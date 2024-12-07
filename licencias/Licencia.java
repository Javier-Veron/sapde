package com.sapde.sistAdmPresDocenEsc.licencias;

public class Licencia {

    //Attributes
    private String codigo,descripcion;

    //Constructor

    public Licencia(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }


    //Methods

    //Getters & Setters


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
