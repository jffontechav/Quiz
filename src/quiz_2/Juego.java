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

//no seguro si es abstracto o una interface
public abstract class Juego {
    private String title;
    private String descripcion;
    private String autor;

    public Juego(String title, String descripcion, String autor) {
        this.title = title;
        this.descripcion = descripcion;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
