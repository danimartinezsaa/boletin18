/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import javax.swing.JOptionPane;

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
        int opcion=0;
        boolean encendido=true;

        while(encendido==true){
            opcion=Integer.parseInt(JOptionPane.showInputDialog("MENÚ:\n"
                    +"1 añadir correo\n"
                    +"2 eliminar correo\n"
                    +"3 mostrar correo\n"
                    +"4 primer correo no leído\n"
                    +"5 número total de correos\n"
                    +"6 correos por leer\n"
                    +"7 salir"));
            switch(opcion){
                case 1:
                    buzon1.añadir(new Correo(false, JOptionPane.showInputDialog("Introduzca argumento")));
                    break;
                case 2:
                    buzon1.elimina(Integer.parseInt(JOptionPane.showInputDialog("Inserte correo a borrar."))-1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, buzon1.mostrar(Integer.parseInt(JOptionPane.showInputDialog("Inserte correo a mostrar"))-1));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "primer correo no leído: "+buzon1.mostrarPrimerNoLeido());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "número total de correos: "+buzon1.numeroDeCorreos());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "correos por leer: "+buzon1.porLeer());
                    break;
                case 7:
                    encendido=false;
                    System.exit(0);
                default:
                    break;
            }
        }
    }

}
