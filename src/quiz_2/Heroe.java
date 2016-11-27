/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_2;

/**
 *
 * @author USUARIO
 */
public class Heroe {
    private String nombre;
    //no se acerca de este
    private String animacion;
    
    private int vidas;
    private int puntuacion;

    public Heroe(String nombre, String animacion, int vidas, int puntuacion) {
        this.nombre = nombre;
        this.animacion = animacion;
        this.vidas = vidas;
        this.puntuacion = puntuacion;
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

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    //metodos a trabajar
    public void victoria(){
        
    }
    
    public void derrota(){
        
    }
    
    public void moverArriba(){
        
    }
    
    public void moverAbajo(){
        
    }
    
    public void moverIzquierda(){
        
    }
    
    public void moverDerecha(){
        
    }
    
    
}
