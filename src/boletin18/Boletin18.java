/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

/**
 *
 * @author dani
 */
public class Boletin18{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Buzon buzon1=new Buzon();
        Correo correo1=new Correo(true,"Correo1");
        Correo correo2=new Correo(true,"Correo2");
        Correo correo3=new Correo(false,"Correo3");
        Correo correo4=new Correo(false,"Correo4");
        Correo correo5=new Correo(true,"Correo5");
        
        buzon1.añadir(correo1);
        buzon1.añadir(correo2);
        buzon1.añadir(correo5);
        buzon1.añadir(correo3);
        System.out.println(buzon1.mostrar(1));
        buzon1.elimina(1);
        System.out.println(buzon1.mostrarPrimerNoLeido());
        System.out.println("Número de correos: "+buzon1.numeroDeCorreos());
        System.out.println("Correos por leer: "+buzon1.porLeer());
    }
    
}
