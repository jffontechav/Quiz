/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_2;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Enemigos {
    private String nombre;
    //no se acerca de este
    private String animacion;
    
    private String nEnemigosNivel;
    private String nVelocidad;
    private ArrayList<Casilla> casillas;

    public Enemigos(String nombre, String animacion, String nEnemigosNivel, String nVelocidad, ArrayList<Casilla> casillas) {
        this.nombre = nombre;
        this.animacion = animacion;
        this.nEnemigosNivel = nEnemigosNivel;
        this.nVelocidad = nVelocidad;
        this.casillas = casillas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnimacion() {
        return animacion;
    }

    public void setAnimacion(String animacion) {
        this.animacion = animacion;
    }

    public String getnEnemigosNivel() {
        return nEnemigosNivel;
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(ArrayList<Casilla> casillas) {
        this.casillas = casillas;
    }

    public void setnEnemigosNivel(String nEnemigosNivel) {
        this.nEnemigosNivel = nEnemigosNivel;
    }

    public String getnVelocidad() {
        return nVelocidad;
    }

    public void setnVelocidad(String nVelocidad) {
        this.nVelocidad = nVelocidad;
    }
    
    //no estoy seguro porque este lo cubre todo
    public void moverAtacar(){
        
    }
    
    
}
