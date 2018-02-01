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
public class Correo{
    boolean leido;
    String contenido;

    public Correo(){
    }

    public Correo(boolean leido, String contenido){
        this.leido=leido;
        this.contenido=contenido;
    }

    public boolean isLeido(){
        return leido;
    }

    public void setLeido(boolean leido){
        this.leido=leido;
    }

    public String getContenido(){
        return contenido;
    }

    public void setContenido(String contenido){
        this.contenido=contenido;
    }

    @Override
    public String toString(){
        return "leido:"+leido+", contenido:"+contenido;
    }
    
}
