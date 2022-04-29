package service;

public class ConvertidorS {

    public static String mensaje = "";
    public static int residuo;
    public static int resultado;
    public static int base;

                /*Algoritmo*/
    public static void calcular(int numero) {
        /*Condicional*/
        if (numero > 0 && numero <= 255) {
            resultado = 0;
            base = 1;
            /*Bucle*/
            while (numero > 0 && numero <= 255) {
                residuo = numero % 2;
                resultado = resultado + residuo * base;
                numero = (numero / 2);
                base = base * 10;
            }
            mensaje = "" + resultado ;
        } else {
            mensaje = "Error digite un numero entre 1 y 255";
            
        }
        
    }
/*Limpieza*/
    public static void limpiar() {
        mensaje = "";
    }
}
