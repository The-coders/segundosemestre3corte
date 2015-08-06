package Operaciones;

import java.util.Date;
import static GUI.Parcial.areaxd;

/**
 *
 * @author gebrail
 */
public class OperacionParcial {

    public static Equipo p2;
    public static Tecnico p3;

    public static void parcialfutbol() {

        Tecnico menor = (Tecnico) Operaciontecnico.tecnicoo.get(0);
        int edadmenor = 2014 - menor.getFechadenacimiento().getYear();
        Tecnico mundialesp = (Tecnico) Operaciontecnico.tecnicoo.get(0);

        Tecnico veces = (Tecnico) Operaciontecnico.tecnicoo.get(0);
        Equipo fifa = (Equipo) Operacionequipo.equipo.get(0);

        for (int i = 0; i < Operaciontecnico.tecnicoo.size(); i++) {

            p3 = (Tecnico) Operaciontecnico.tecnicoo.get(i);
            Date a = p3.getFechadenacimiento();
            int año = a.getYear();
            int edad = 1970 - año;

            if (edadmenor < 1970 && mundialesp.getNumerodemundialesenquehaparticipado() >= 2 && veces.getCantidaddevecesquehasidoTecnicocomoganadordeunmundial() >= 1) {

                String h = p3.getNombre();
                for (int g = 0; g < Operacionequipo.equipo.size(); g++) {
                    p2 = (Equipo) Operacionequipo.equipo.get(g);
                    if (p2.getDirectortecnico() == (h)) {

                        System.out.println(p2.getCodigoFIFA());
                    }
                }
            }

        }

    }
}
