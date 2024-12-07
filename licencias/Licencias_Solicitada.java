package com.sapde.sistAdmPresDocenEsc.licencias;

import java.util.Date;

public class Licencias_Solicitada {

    //Attributes
    private Licencia licencia;
    private Date fecha_inicio,fecha_finalizacion;
    private boolean justificada;

    //Constructor

    public Licencias_Solicitada(Licencia licencia,
                                Date fecha_inicio,
                                Date fecha_finalizacion,
                                boolean justificada) {
        this.licencia = licencia;
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizacion = fecha_finalizacion;
        this.justificada = justificada;
    }

    //Methods

    //Getters & Setters


    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(Date fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public boolean isJustificada() {
        return justificada;
    }

    public void setJustificada(boolean justificada) {
        this.justificada = justificada;
    }
}
