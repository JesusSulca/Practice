/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controlador;

import dao.DemoImpl;
import java.awt.Dimension;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import modelo.Demo;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

@Named(value = "demoC")
@SessionScoped
public class DemoC implements Serializable {

    private Demo demo;
    private DemoImpl dao;
    private List<Demo> ListarPersona;

    public DemoC() {
        demo = new Demo();
        dao = new DemoImpl();

    }

    public void Demostracion() throws Exception {
        ListarPersona = dao.GraficarBarras();
        int var = ListarPersona.get(0).getNota();
        int var1 = ListarPersona.get(1).getNota();
        int var2 = ListarPersona.get(2).getNota();
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.setValue(var, "Programación", "Juan");
        System.out.println(var);
        datos.setValue(var1, "Programación", "Marcos");
        System.out.println(var1);
        datos.setValue(var2, "Programación", "Alex");
        System.out.println(var2);
        JFreeChart grafico_barras = ChartFactory.createBarChart3D("Calificación", "Estudiantes", "Calificación ", datos, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel = new ChartPanel(grafico_barras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400, 200));
        try {
            System.out.println("sd");
            ChartUtilities.saveChartAsPNG(new File("C:\\Users\\51992\\Downloads\\Demo\\Demo\\src\\main\\webapp\\image\\JFreeChart.png"), grafico_barras, 400, 400);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public DemoImpl getDao() {
        return dao;
    }

    public void setDao(DemoImpl dao) {
        this.dao = dao;
    }

    public List<Demo> getListarPersona() {
        return ListarPersona;
    }

    public void setListarPersona(List<Demo> ListarPersona) {
        this.ListarPersona = ListarPersona;
    }

   

}
