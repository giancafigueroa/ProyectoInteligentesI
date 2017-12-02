/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointeligentes;

import java.awt.Rectangle;

/**
 *
 * @author JORGE_ALEJANDRO
 */
public class Cuadro implements Cloneable {
    private int i;
    private int j;
    private Rectangle area;
    private String rutaImagen;
    private String tipo;

    public Cuadro(int i, int j) {
        this.i = i;
        this.j = j;
        this.area = null;
        this.rutaImagen = "img/cuadro.png";
        this.tipo = "cuadro";
    }
    
    public Rectangle getArea() {
        return area;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public void setArea(Rectangle area) {
        this.area = area;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar");
        }
        return obj;
    }
}
