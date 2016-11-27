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
public class Casilla {
    private String nombreArchivo;
    private int nPosicion;

    public Casilla(String nombreArchivo, int nPosicion) {
        this.nombreArchivo = nombreArchivo;
        this.nPosicion = nPosicion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getnPosicion() {
        return nPosicion;
    }

    public void setnPosicion(int nPosicion) {
        this.nPosicion = nPosicion;
    }
    
}
