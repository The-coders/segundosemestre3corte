package Operaciones;

import GUI.Equipos;
import GUI.Jugadores;
import static GUI.Registros.campo1;
import static GUI.Registros.campo2;
import static GUI.Registros.campo3;
import static GUI.Registros.campo4;
import static GUI.Registros.campo5;
import static GUI.Registros.campo6;
import GUI.Tecnicos;
import java.util.Date;

/**
 *
 * @author yebrail
 */
public class Operacionregistros {

    public static String Archivo;
    public static Jugador p1;
    public static Equipo p2;
    public static Tecnico p3;
    public static Equipo p4;
    public static Tecnico p5;
    public static Jugador p6;
    public static Equipo p7;
    public static Equipo p8;
    public static Equipo p9;
    public static Equipo p10;
    public static Equipo p11;
    public static Equipo p12;
    public static long promedio = 0;
    public static long pro;
    public static long prom;
    public static long total;

    public static void Equipoconmásparticipaciónenmundiales() {

        Archivo += "Equipo con mas participacion en los mundiales \t" + "\n";
        long mayor1 = 0;
        for (Object equipo : Operacionequipo.equipo) {
            p2 = (Equipo) equipo;
            
            if (p2.getNumerodemundialesjugados() > mayor1) {
                mayor1 = p2.getNumerodemundialesjugados();
                campo1.setText(p2.getNombrepais());
                Archivo += p2.getNombrepais() + "\n";

            }
        }

    }

    public static void técnicoconmasparticipaciónenmundiales() {

        Archivo += "Tecnico con mas participacion en los mundiales \t" + "\n";

        long mayor2 = 0;
        for (int i = 0; i < Operaciontecnico.tecnicoo.size(); i++) {

            p3 = (Tecnico) Operaciontecnico.tecnicoo.get(i);

            if (p3.getNumerodemundialesenquehaparticipado() > mayor2) {
                mayor2 = p3.getNumerodemundialesenquehaparticipado();

                campo2.setText(p3.getNombre());
                Archivo += p3.getNombre()+"\t" +p3.getCantidaddevecesquehasidoTecnicocomoganadordeunmundial()+ "\n";
            }

        }
    }

    public static void CódigoFIFAdelpaísconmayorcantidaddegolesanotados() {

        Archivo = "CódigoFIFA del país con mayor cantidadde goles anotados \t" + "\n";
        long mayor3 = 0;
        for (int i = 1; i < Operacionequipo.equipo.size(); i++) {

            p7 = (Equipo) Operacionequipo.equipo.get(i);

            if (p7.getNumerodegolesrealizadosenelmundialactual() > mayor3) {
                mayor3 = p7.getNumerodegolesrealizadosenelmundialactual();

                campo3.setText(String.valueOf(p7.getCodigoFIFA()));
                Archivo += p7.getCodigoFIFA() + p7.getNombrepais()+ "\n";
            }
        }
    }

    public static void CódigoFIFAdelpaisaconlavallamenosvencidadeltorneo() {

        Archivo += "Código FIFA del paisa con la valla menos vencida deltorneo \t" + "\n";

        long meno2 = 999999999;

        for (int i = 1; i < Operacionequipo.equipo.size(); i++) {

            p9 = (Equipo) Operacionequipo.equipo.get(i);

            if (p9.getNumerodegolesrecibidosenlosmundialesanteriores()< meno2) {
                meno2 = p9.getNumerodegolesrecibidosenlosmundialesanteriores();

                campo4.setText(String.valueOf(p9.getCodigoFIFA()));
                Archivo += campo4.getText() + "\n";
            }

        }

    }

    public static void Promediodegolesdeltorneo() {

        Archivo += "Promedio de goles del torneo \t" + "\n";

        long acu = 0;

        for (int i = 0; i < Operacionequipo.equipo.size(); i++) {

            p11 = (Equipo) Operacionequipo.equipo.get(i);

            acu += p11.getNumerodegolesrealizadosenelmundialactual();
        }
        double promedio = acu / Operacionequipo.equipo.size();

        Archivo += promedio + "\n";
        campo5.setText(String.valueOf(promedio));
    }

    public static void Pasaportedelgoleadormásjovendeltorneo() {
        Archivo += "Pasaporte del goleador mas joven del torneo xD \t" + "\n";
        Jugador menor = (Jugador) Operacionjugador.jugador.get(0);
        int edadmenor = 2014 - menor.getFechadenacimiento().getYear();
        for (int i = 1; i < Operacionjugador.jugador.size(); i++) {
            p1 = (Jugador) Operacionjugador.jugador.get(i);
            Date a = p1.getFechadenacimiento();
            int año = a.getYear();
            int edad = 2014 - año;
            if (edad < edadmenor) {
                edadmenor = edad;
                menor = p1;
            }
        }
        Archivo += menor.getNombre() + "\t" + menor.getFechadenacimiento() + "\t" + menor.getNumerodepasaporte() + "\n";
        campo6.setText(String.valueOf(menor.getNumerodepasaporte()));
    }

}
