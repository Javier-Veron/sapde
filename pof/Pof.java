package com.sapde.sistAdmPresDocenEsc.pof;

import java.util.List;

public class Pof {

    //Attributes
    private List<Cargo> lista_de_cargos_pof;

    //Constructor

    public Pof(List<Cargo> lista_de_cargos_pof) {
        this.lista_de_cargos_pof = lista_de_cargos_pof;
    }

    //Methods

    //Getters & Setters


    public List<Cargo> getLista_de_cargos_pof() {
        return lista_de_cargos_pof;
    }

    public void setLista_de_cargos_pof(List<Cargo> lista_de_cargos_pof) {
        this.lista_de_cargos_pof = lista_de_cargos_pof;
    }
}
