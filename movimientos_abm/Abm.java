package com.sapde.sistAdmPresDocenEsc.movimientos_abm;

import com.sapde.sistAdmPresDocenEsc.docentes.Agente;
import com.sapde.sistAdmPresDocenEsc.licencias.Licencias_Solicitada;
import com.sapde.sistAdmPresDocenEsc.pof.Cargo;

import java.util.Date;
import java.util.List;

public class Abm {

    //Attributes
    private Agente agente;
    private Cargo cargo;
    private String situacion_revista;
    private Date fecha_de_alta;
    private Date fecha_de_baja;
    private List<Licencias_Solicitada> historial_lecencias;

    //Constructor

    public Abm(Agente agente,
               Cargo cargo,
               String situacion_revista,
               Date fecha_de_alta,
               Date fecha_de_baja,
               List<Licencias_Solicitada> historial_lecencias) {
        this.agente = agente;
        this.cargo = cargo;
        this.situacion_revista = situacion_revista;
        this.fecha_de_alta = fecha_de_alta;
        this.fecha_de_baja = fecha_de_baja;
        this.historial_lecencias = historial_lecencias;
    }


    //Methods

    //Getters & Setters

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getSituacion_revista() {
        return situacion_revista;
    }

    public void setSituacion_revista(String situacion_revista) {
        this.situacion_revista = situacion_revista;
    }

    public Date getFecha_de_alta() {
        return fecha_de_alta;
    }

    public void setFecha_de_alta(Date fecha_de_alta) {
        this.fecha_de_alta = fecha_de_alta;
    }

    public Date getFecha_de_baja() {
        return fecha_de_baja;
    }

    public void setFecha_de_baja(Date fecha_de_baja) {
        this.fecha_de_baja = fecha_de_baja;
    }

    public List<Licencias_Solicitada> getHistorial_lecencias() {
        return historial_lecencias;
    }

    public void setHistorial_lecencias(List<Licencias_Solicitada> historial_lecencias) {
        this.historial_lecencias = historial_lecencias;
    }
}
