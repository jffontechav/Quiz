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
public class Accion {
    private String mover;
    private ArrayList<Casilla> casillas;

    public Accion(String mover, ArrayList<Casilla> casillas) {
        this.mover = mover;
        this.casillas = casillas;
    }

    public String getMover() {
        return mover;
    }

    public void setMover(String mover) {
        this.mover = mover;
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(ArrayList<Casilla> casillas) {
        this.casillas = casillas;
    }
    
}
