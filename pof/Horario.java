package com.sapde.sistAdmPresDocenEsc.pof;

import java.util.Date;

public class Horario {

    //Attributes
    private String tipo,materia,curso,division;
    private Date hora_entrada;
    private Date hora_salida;

    //Constructor

    public Horario(String tipo,
                   String materia,
                   String curso,
                   String division,
                   Date hora_entrada,
                   Date hora_salida) {
        this.tipo = tipo;
        this.materia = materia;
        this.curso = curso;
        this.division = division;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }


    //Methods

    //Getters & Setters


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Date getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Date hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }
}
