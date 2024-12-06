package com.sapde.sistAdmPresDocenEsc.docentes;

import com.sapde.sistAdmPresDocenEsc.pof.Cargo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agenda {
    //Attributes
    private  List<Agente> lista_de_agentes;

    //Constructor
    public Agenda(List<Agente> lista_de_agentes) {
        this.lista_de_agentes = lista_de_agentes;
    }

    //Methods

    public void agregar_agente(String nombre,
                               String apellido,
                               String mail,
                               String direccion,
                               String dni, String cuil,
                               String telefono,
                               Date fecha_nacimiento,
                               String ficha_censal,
                               String titulos,
                               String observaciones,
                               String telefono_emergencia,
                               List<Cargo> cargos_designados,
                               List<Familiar> familiares_a_cargo){
        Agente agente = new Agente(nombre,apellido,mail,
                direccion,dni,cuil,telefono,fecha_nacimiento,
                ficha_censal,titulos,observaciones,telefono_emergencia,cargos_designados,
                familiares_a_cargo);

        lista_de_agentes.add(agente);
    }

    public Agente buscar_por_dni(String dni){
        for (Agente a: lista_de_agentes)
            if (a.getDni().equals(dni)) {
            return a;
            }
    return null;
    }

    public List<Agente> buscar_por_nombre(String nombre){
        List<Agente> lista_resultado = new ArrayList<>();
        for (Agente a: lista_de_agentes)
            if (a.getNombre().equals(nombre)) {
                lista_resultado.add(a);
            }
        return lista_resultado;
    }

    public List<Agente> buscar_por_apellido(String apellido){
        List<Agente> lista_resultado = new ArrayList<>();
        for (Agente a: lista_de_agentes)
            if (a.getApellido().equals(apellido)) {
                lista_resultado.add(a);
            }
        return lista_resultado;
    }

    //Getters and Setters
    public List<Agente> getLista_de_agentes() {
        return lista_de_agentes;
    }

    public void setLista_de_agentes(List<Agente> lista_de_agentes) {
        this.lista_de_agentes = lista_de_agentes;
    }
}
