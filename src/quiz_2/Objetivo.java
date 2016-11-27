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
public class Objetivo {
    private String nombre;
    private String nObjetosNivel;
    private int valor;
    private ArrayList<Casilla> casillas;

    public Objetivo(String nombre, String nObjetosNivel, int valor, ArrayList<Casilla> casillas) {
        this.nombre = nombre;
        this.nObjetosNivel = nObjetosNivel;
        this.valor = valor;
        this.casillas = casillas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnObjetosNivel() {
        return nObjetosNivel;
    }

    public void setnObjetosNivel(String nObjetosNivel) {
        this.nObjetosNivel = nObjetosNivel;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArrayList<Casilla> getCasillas() {
        return casillas;
    }

    public void setCasillas(ArrayList<Casilla> casillas) {
        this.casillas = casillas;
    }

    
    
}
