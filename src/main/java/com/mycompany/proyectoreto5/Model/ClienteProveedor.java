
package com.mycompany.proyectoreto5.Model;

public class ClienteProveedor {
    
    private int ID_compra;
    private String Constructora;
    private String Banco;

    public ClienteProveedor() {
    }

    public ClienteProveedor(int ID_compra, String Constructora, String Banco) {
        this.ID_compra = ID_compra;
        this.Constructora = Constructora;
        this.Banco = Banco;
    }

    public int getID_compra() {
        return ID_compra;
    }

    public void setID_compra(int ID_compra) {
        this.ID_compra = ID_compra;
    }

    public String getConstructora() {
        return Constructora;
    }

    public void setConstructora(String Constructora) {
        this.Constructora = Constructora;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    @Override
    public String toString() {
        return "ClienteProveedor{" + "ID_compra=" + ID_compra + ", "
                + "Constructora=" + Constructora + ", Banco=" + Banco + '}';
    }
           
}
