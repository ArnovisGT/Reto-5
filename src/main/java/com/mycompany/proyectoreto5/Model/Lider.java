
package com.mycompany.proyectoreto5.Model;

public class Lider {
    private int  ID_lider;
    private String Nombre;
    private String Primer_Apellido;
    private String Ciudad_Residencia;

    public Lider() {
    }

    public Lider(int ID_lider, String Nombre, String Primer_Apellido, String Ciudad_Residencia) {
        this.ID_lider = ID_lider;
        this.Nombre = Nombre;
        this.Primer_Apellido = Primer_Apellido;
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public int getID_lider() {
        return ID_lider;
    }

    public void setID_lider(int ID_lider) {
        this.ID_lider = ID_lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia) {
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    @Override
    public String toString() {
        return "Lider{" + "ID_lider=" + ID_lider + ", Nombre=" + Nombre +
                ", Primer_Apellido=" + Primer_Apellido + ", Ciudad_Residencia=" +
                Ciudad_Residencia + '}';
    }
    
    
}
