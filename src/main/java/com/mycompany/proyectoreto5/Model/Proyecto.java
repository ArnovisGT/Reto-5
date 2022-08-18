
package com.mycompany.proyectoreto5.Model;

public class Proyecto {
    private int ID_proyecto;
    private String Constructora;
    private int Numero_Habitaciones;
    private String Ciudad;

    public Proyecto() {
    }

    public Proyecto(int ID_proyecto, String Constructora, int Numero_Habitaciones, String Ciudad) {
        this.ID_proyecto = ID_proyecto;
        this.Constructora = Constructora;
        this.Numero_Habitaciones = Numero_Habitaciones;
        this.Ciudad = Ciudad;
    }

    public int getID_proyecto() {
        return ID_proyecto;
    }

    public void setID_proyecto(int ID_proyecto) {
        this.ID_proyecto = ID_proyecto;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public int getNumero_Habitaciones() {
        return Numero_Habitaciones;
    }

    public void setNumero_Habitaciones(int Numero_Habitaciones) {
        this.Numero_Habitaciones = Numero_Habitaciones;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "ID_proyecto=" + ID_proyecto + ", Constructora=" 
                + Constructora + ", Numero_Habitaciones=" + Numero_Habitaciones 
                + ", Ciudad=" + Ciudad + '}';
    }
    

}