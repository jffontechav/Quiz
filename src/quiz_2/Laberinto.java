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
public class Laberinto extends Juego{
    //configurar la "composicion" que no se como hacerla exactamente
    private int tiempo;
    private Mundo mundos;
    private Heroe heroes;
    private Pantalla pantalla;

    //posibles cambios en este constructor
    public Laberinto(int tiempo, Mundo mundos, Heroe heroes, Pantalla pantalla,
            String titulo, String descripcion, String autor) {
        //definido aca
        super(titulo, descripcion, autor);

        this.tiempo = tiempo;
        this.mundos = mundos;
        this.heroes = heroes;
        this.pantalla = pantalla;
    }
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Mundo getMundos() {
        return mundos;
    }

    public void setMundos(Mundo mundos) {
        this.mundos = mundos;
    }

    public Heroe getHeroes() {
        return heroes;
    }

    public void setHeroes(Heroe heroes) {
        this.heroes = heroes;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    
    
    
}
