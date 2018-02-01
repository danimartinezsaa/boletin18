/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dani
 */
public class Buzon{
    ArrayList<Correo> buzon=new ArrayList();
    
    public int numeroDeCorreos(){
        return buzon.size();
    }
    public void añadir(Correo c){
        buzon.add(c);
    }
    public boolean porLeer(){
        boolean si=false;
        for(int i=0;i<buzon.size();i++){
            if(buzon.get(i).leido!=true)
                si=true;
        }
        return si;
    }
    public String mostrarPrimerNoLeido(){
        String noLeido=null;
        for(int i=0;i<buzon.size();i++){
            if(buzon.get(i).leido!=true){
                noLeido=buzon.get(i).contenido;
                buzon.get(i).leido=true;
                break;
            }
        }
        if(noLeido==null)
            return "No hay correos por leer.";
        else
            return noLeido;
    }
    public String mostrar(int k){
        if(k>buzon.size())
            return "Ese correo no existe.";
        else
            return buzon.get(k).contenido;
    }
    public void elimina(int k){
        if(k>buzon.size())
            System.out.println("Ese correo no existe.");
        else
            buzon.remove(k);
    }
}
