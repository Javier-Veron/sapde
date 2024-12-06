package com.sapde.sistAdmPresDocenEsc.docentes;

import com.sapde.sistAdmPresDocenEsc.pof.Cargo;

import java.util.Date;
import java.util.List;

public class Agente extends Persona {
    //Attributes
    private String ficha_censal,titulos,observaciones,telefono_emergencia;
    private List<Cargo> cargos_designados;
    private List<Familiar> familiares_a_cargo;

    //Constructor
    public Agente(String nombre,
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
                  List<Familiar> familiares_a_cargo) {
        super(nombre, apellido, mail, direccion, dni, cuil, telefono, fecha_nacimiento);
        this.ficha_censal = ficha_censal;
        this.titulos = titulos;
        this.observaciones = observaciones;
        this.telefono_emergencia = telefono_emergencia;
        this.cargos_designados = cargos_designados;
        this.familiares_a_cargo = familiares_a_cargo;
    }

    //Methods

    //Getters and Setters
    public String getFicha_censal() {
        return ficha_censal;
    }

    public void setFicha_censal(String ficha_censal) {
        this.ficha_censal = ficha_censal;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTelefono_emergencia() {
        return telefono_emergencia;
    }

    public void setTelefono_emergencia(String telefono_emergencia) {
        this.telefono_emergencia = telefono_emergencia;
    }

    public List<Cargo> getCargos_designados() {
        return cargos_designados;
    }

    public void setCargos_designados(List<Cargo> cargos_designados) {
        this.cargos_designados = cargos_designados;
    }

    public List<Familiar> getFamiliares_a_cargo() {
        return familiares_a_cargo;
    }

    public void setFamiliares_a_cargo(List<Familiar> familiares_a_cargo) {
        this.familiares_a_cargo = familiares_a_cargo;
    }
}
