
package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Demo;


public class DemoImpl extends Conexion{
    
    public List<Demo>GraficarBarras() throws Exception {
        List<Demo> ListarPersona = null;
        Demo demo ;
        try {
            ListarPersona = new ArrayList<>();
            System.out.println("asd");
            String sql = "select * from persona";
            Statement st = this.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                demo = new Demo();
                demo.setNombre(rs.getString("Nombre"));
                demo.setNota(rs.getInt("Nota"));
                ListarPersona.add(demo);
            }
        } catch (Exception e) {
            System.out.println("error en GraficarBarra/DemoImpl");
        }
        return ListarPersona;
    }
}
