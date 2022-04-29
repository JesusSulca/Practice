package controller;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import model.Convertidor;
import service.ConvertidorS;

@Named(value = "convertidorC")
@SessionScoped
public class ConvertidorC implements Serializable {

     private Convertidor convertidor;

    public ConvertidorC() {
        convertidor = new Convertidor();
    }
            /*Metodo Calcular Controlador*/
    public void calcular() {
        ConvertidorS.calcular(convertidor.getNumero());
        convertidor.setMensaje(ConvertidorS.mensaje);
    }

            /*Metodo Limpiar Controlador*/    
    public void limpiar() {
        ConvertidorS.limpiar();
        convertidor.setNumero(0);
        convertidor.setMensaje("");
    }
    
           /*Getter and Setter*/
    public Convertidor getConvertidor() {
        return convertidor;
    }

    public void setConvertidor(Convertidor convertidor) {
        this.convertidor = convertidor;
    }

}
