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
public class Catalogo {
    
    private String mes;
    private String anno;

    /**
     *
     */
    public Catalogo() {
    }

    /**
     *
     * @param mes
     * @param anno
     */
    public Catalogo(String mes, String anno) {
        this.mes = mes;
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "mes=" + mes + ", anno=" + anno + ", nombre=" + mes + " " + anno +'}';
    }

    /**
     *
     * @return
     */
    public String getMes() {
        return mes;
    }

    /**
     *
     * @param mes
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     *
     * @return
     */
    public String getAnno() {
        return anno;
    }

    /**
     *
     * @param anno
     */
    public void setAnno(String anno) {
        this.anno = anno;
    }
   
    
    
}//Fin del programa
