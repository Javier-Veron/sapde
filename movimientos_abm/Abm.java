package com.sapde.sistAdmPresDocenEsc.movimientos_abm;

import com.sapde.sistAdmPresDocenEsc.docentes.Agente;
import com.sapde.sistAdmPresDocenEsc.licencias.Licencias_Solicitada;
import com.sapde.sistAdmPresDocenEsc.pof.Cargo;

import java.util.Date;
import java.util.List;

public class Abm {

    Agente agente;
    Cargo cargo;
    String situacion_revista;
    Date fecha_de_alta;
    Date fecha_de_baja;
    List<Licencias_Solicitada> historial_lecencias;


}
