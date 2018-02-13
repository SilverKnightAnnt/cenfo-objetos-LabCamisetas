/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labodirectoryclothing;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CL {

    ArrayList<Cliente> listaCliente = new ArrayList<>();
    ArrayList<Camiseta> listaCamiseta = new ArrayList<>();
    ArrayList<Catalogo> listaCatalogo = new ArrayList<>();
    ArrayList<Orden> listaOrden = new ArrayList<>();

    /**
     *
     * @return
     */
    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    /**
     *
     * @param listaCliente
     */
    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    /**
     *
     * @return
     */
    public ArrayList<Camiseta> getListaCamiseta() {
        return listaCamiseta;
    }

    /**
     *
     * @param listaCamiseta
     */
    public void setListaCamiseta(ArrayList<Camiseta> listaCamiseta) {
        this.listaCamiseta = listaCamiseta;
    }

    /**
     *
     * @return
     */
    public ArrayList<Catalogo> getListaCatalogo() {
        return listaCatalogo;
    }

    /**
     *
     * @param listaCatalogo
     */
    public void setListaCatalogo(ArrayList<Catalogo> listaCatalogo) {
        this.listaCatalogo = listaCatalogo;
    }

    /**
     *
     * @return
     */
    public ArrayList<Orden> getListaOrden() {
        return listaOrden;
    }

    /**
     *
     * @param listaOrden
     */
    public void setListaOrden(ArrayList<Orden> listaOrden) {
        this.listaOrden = listaOrden;
    }

    /**
     *
     * @param pCedula
     * @param pNombre
     * @param pApellidos
     */
    public void agregarCliente(String pCedula, String pNombre, String pApellidos) {

        Cliente clienteIngresado = new Cliente(pCedula, pNombre, pApellidos);
        listaCliente.add(clienteIngresado);
    }
    
    /**
     *
     * @param pCedula
     * @return
     */
    public boolean validacionCliente(String pCedula){
        boolean clienteEncontrado = false;
        
        for (int i = 0; i < getListaCliente().size(); i++) {
            
            if (pCedula.equals(getListaCliente().get(i).getCedula())) {
                
                clienteEncontrado = true;
                
            }
            
        }
        return clienteEncontrado;
    }

    /**
     *
     * @param pId
     * @param pColor
     * @param pTamanno
     * @param pDescripcion
     * @param pPrecio
     */
    public void agregarCamiseta(String pId, String pColor, String pTamanno,
            String pDescripcion, double pPrecio) {

        Camiseta camisetaIngresada = new Camiseta(pId, pColor, pTamanno, pDescripcion, pPrecio);
        listaCamiseta.add(camisetaIngresada);

    }
    
    /**
     *
     * @param pId
     * @return
     */
    public boolean validacionCamiseta(String pId){
        boolean camisetaEncontrada = false;
        
        for (int i = 0; i < getListaCamiseta().size(); i++) {
            
            if (pId.equals(getListaCamiseta().get(i).getId())) {
                
                camisetaEncontrada = true;
            }
        }
        return camisetaEncontrada;
    }

    /**
     *
     * @param pMes
     * @param pAnno
     */
    public void agregarCatalogo(String pMes, String pAnno) {

        Catalogo catalogoIngresado = new Catalogo(pMes, pAnno);
        listaCatalogo.add(catalogoIngresado);
    }

    /**
     *
     * @param pId
     * @param pTipo
     * @param pFecha
     * @param pCantidad
     * @param pIdCliente
     */
    public void agregarOrden(String pId, String pTipo, String pFecha, int pCantidad, String pIdCliente) {

        Orden ordenIngresada = new Orden(pId, pTipo, pFecha, pCantidad, pCantidad);

        for (int i = 0; i < getListaCliente().size(); i++) {
            Cliente clienteIngresado;
            clienteIngresado = getListaCliente().get(i);

            if (pIdCliente.equals(clienteIngresado.getCedula())) {
                ordenIngresada.setCliente(clienteIngresado);
            }
        }

        listaOrden.add(ordenIngresada);

    }

//    public double calcularTotalPrecio(int pCantidad){
//        
//        double totalPrecio;
//        
//        for (int i = 0; i < getListaCamiseta().size(); i++) {
//            
//            
//            Camiseta camisetaIngresada;
//            camisetaIngresada = getListaCamiseta().get(i);
//
//            totalPrecio = pCantidad * (camisetaIngresada.getPrecio());
//            
//            double totalPrecioCamiseta = totalPrecio;
//            
//           
//        }
//        
//        return totalPrecioCamiseta;
//    }

    /**
     *
     * @param pId
     * @return
     */
    public Orden buscarOrden(String pId) {
        Orden ordenIngresada = null;

        for (int i = 0; i < getListaOrden().size(); i++) {
            if (pId.equals(getListaOrden().get(i).getId())) {
                ordenIngresada = getListaOrden().get(i);
            }
        }
        return ordenIngresada;
    }

}//Fin del programa
