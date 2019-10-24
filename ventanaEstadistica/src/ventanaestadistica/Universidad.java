/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaestadistica;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Universidad 
{
    private String[] plantel;
    private String[] colegio;
    private String[] carrera;
    private Boolean[] trabajar;

    public Universidad() {
    }
    
    
    //METODOS
    

    public String[] getPlantel() {
        return plantel;
    }

    public void setPlantel(String[] plantel) {
        this.plantel = plantel;
    }

    public String[] getColegio() {
        return colegio;
    }

    public void setColegio(String[] colegio) {
        this.colegio = colegio;
    }

    public String[] getCarrera() {
        return carrera;
    }

    public void setCarrera(String[] carrera) {
        this.carrera = carrera;
    }

    public Boolean[] getTrabajar() {
        return trabajar;
    }

    public void setTrabajar(Boolean[] trabajar) {
        this.trabajar = trabajar;
    }
    
    
    
    
}
