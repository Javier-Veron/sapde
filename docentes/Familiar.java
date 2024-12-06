package com.sapde.sistAdmPresDocenEsc.docentes;

import java.util.Date;

public class Familiar extends Persona {

    //Attributes
    private String parentesco;

    //Constructor
    public Familiar(String nombre,
                    String apellido,
                    String mail,
                    String direccion,
                    String dni,
                    String cuil,
                    String telefono,
                    Date fecha_nacimiento,
                    String parentesco) {
        super(nombre, apellido, mail, direccion, dni, cuil, telefono, fecha_nacimiento);
        this.parentesco = parentesco;
    }

    //Methods

    //Getters and Setters
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
