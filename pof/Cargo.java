package com.sapde.sistAdmPresDocenEsc.pof;

import java.util.List;

public class Cargo {

    //Attributes
    private String tipo,turno,codigo;
    private List<Horario> horarios;

    //Constructor

    public Cargo(String tipo, String turno, String codigo, List<Horario> horarios) {
        this.tipo = tipo;
        this.turno = turno;
        this.codigo = codigo;
        this.horarios = horarios;
    }


    //Methods

    //Getters & Setters


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
}
