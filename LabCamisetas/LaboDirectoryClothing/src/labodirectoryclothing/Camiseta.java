/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labodirectoryclothing;

/**
 *
 * @author User
 */
public class Camiseta {
    
    private String id;
    private String color;
    private String tamanno;
    private String descripcion;
    private double precio;

    public Camiseta() {
    }

    public Camiseta(String id, String color, String tamanno, String descripcion, double precio) {
        this.id = id;
        this.color = color;
        this.tamanno = tamanno;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Camiseta{" + "id=" + id + ", color=" + color + ", tamanno=" + tamanno + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String tamanno) {
        this.tamanno = tamanno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}//Fin del programa
