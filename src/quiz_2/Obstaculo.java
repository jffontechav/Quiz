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
public class Obstaculo {
    private String nombre;
    private String nObstaculosNivel;
    private Casilla casillas;

    public Obstaculo(String nombre, String nObstaculosNivel, Casilla casillas) {
        this.nombre = nombre;
        this.nObstaculosNivel = nObstaculosNivel;
        this.casillas = casillas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnObstaculosNivel() {
        return nObstaculosNivel;
    }

    public void setnObstaculosNivel(String nObstaculosNivel) {
        this.nObstaculosNivel = nObstaculosNivel;
    }

    public Casilla getCasillas() {
        return casillas;
    }

    public void setCasillas(Casilla casillas) {
        this.casillas = casillas;
    }
    
    
}
