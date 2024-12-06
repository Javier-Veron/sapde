package com.sapde.sistAdmPresDocenEsc.docentes;

import java.util.Date;

public class Persona {

    //Attributes
    private String nombre,apellido,mail,direccion,dni,cuil,telefono;
    private Date fecha_nacimiento;

    //Constructor
    public Persona(String nombre,
                   String apellido,
                   String mail,
                   String direccion,
                   String dni,
                   String cuil,
                   String telefono,
                   Date fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.direccion = direccion;
        this.dni = dni;
        this.cuil = cuil;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    //Methods

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
