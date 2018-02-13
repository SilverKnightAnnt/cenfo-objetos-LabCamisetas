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
public class Orden {
    
    private String id;
    private String tipo;
    private Cliente cliente;
    private String fecha;
    private int cantidad;
    private double total;

    /**
     *
     */
    public Orden() {
    }

    /**
     *
     * @param id
     * @param tipo
     * @param fecha
     * @param cantidad
     * @param total
     */
    public Orden(String id, String tipo, String fecha, int cantidad, double total) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", tipo=" + tipo + ", cliente=" + cliente + ", fecha=" + fecha + ", cantidad=" + cantidad + ", total=" + total + '}';
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     *
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     *
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @return
     */
    public double getTotal() {
        return total;
    }

    /**
     *
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
    
}//Fin del programa
