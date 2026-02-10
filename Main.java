package feria.main;

import feria.model.*;
import feria.service.FeriaEmpresarial;

public class Main {

    public static void main(String[] args) {

        FeriaEmpresarial feria = new FeriaEmpresarial();

        Empresa empresa1 = new Empresa("TechSoft", "Tecnología", "contacto@techsoft.com");
        Stand stand1 = new Stand(1, "Pabellón A", "Grande");
        Visitante visitante1 = new Visitante("Ana López", "12345", "ana@gmail.com");
        Comentario comentario1 = new Comentario(
                "Ana López", 
                "2026-02-10", 
                5, 
                "Excelente atención"
        );

        feria.registrarEmpresa(empresa1);
        feria.asignarStand(empresa1, stand1);
        feria.registrarVisitante(visitante1);
        feria.agregarComentario(comentario1);

        feria.generarReporte();
    }
}
