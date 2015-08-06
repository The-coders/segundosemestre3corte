/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import GUI.Equipos;
import GUI.Jugadores;
import GUI.Tecnicos;
import static Operaciones.Operaciontecnico.tecnicoo;

import static java.lang.Math.random;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gebrail
 */
public class LlenadoAleatorio {

    String nombres[] = new String[100];
    String paises[] = new String[32];
    String apellidos[] = new String[100];
    public static Jugador p1;
    public static Equipo p2;
    public static Tecnico p3;
    public static DefaultTableModel modelotecnicos;
    public static DefaultTableModel modelojugadores;
    public static DefaultTableModel modeloequipos;

    public static void creartecnico(String paises[], String nombres[], String apellidos[]) throws ParseException {

        for (int i = 0; i < 32; i++) {
            int valorEntero_nombre = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
            int valorEntero_apellido = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
            String nombre = nombres[valorEntero_nombre] + " " + apellidos[valorEntero_apellido];
            int numpasaport = (int) Math.floor(Math.random() * (910000000 - 10000000 + 1) + 10000000);
            int valorEntero = (int) Math.floor(Math.random() * (32 - 1 + 1) + 1);
            String pais = paises[valorEntero];
            int num_mundiales = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
            int ganador_mundiales = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);

            int dias = (int) Math.floor(Math.random() * (30 + 1) + 1);
            int mes = (int) Math.floor(Math.random() * (12 + 1) + 1);
            int año = (int) Math.floor(Math.random() * (70 + 1) + 1930);  //numeros del 1 al 10, mas 2 mil = numeros del 2001 al 2010
            String fecha = String.valueOf(dias) + "-" + String.valueOf(mes) + "-" + String.valueOf(año);
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            Date nuevaFecha = null;
            nuevaFecha = formatoFecha.parse(fecha);

            DateFormat formato1 = DateFormat.getDateInstance();
            String sfecha = formato1.format(nuevaFecha);

            Tecnico T = new Tecnico(nombre, numpasaport, pais, nuevaFecha, num_mundiales, ganador_mundiales);
            tecnicoo.add(T);

        }

    }

    public static void crearjugador(String paises[], String nombres[], String apellidos[]) throws ParseException {
        for (int i = 0; i < (32 * 23); i++) {
            int valorEntero_nombre = (int) Math.floor(Math.random() * (99 - 1 + 1) + 1);
            int valorEntero_apellido = (int) Math.floor(Math.random() * (99 - 1 + 1) + 1);
            String nombre = nombres[valorEntero_nombre] + " " + apellidos[valorEntero_apellido];
            int numpasaport = (int) Math.floor(Math.random() * (910000000 - 10000000 + 1) + 10000000);

            int dias = (int) Math.floor(Math.random() * (30 + 1) + 1);
            int mes = (int) Math.floor(Math.random() * (12 + 1) + 1);
            int año = (int) Math.floor(Math.random() * (70 + 1) + 1960);  //numeros del 1 al 10, mas 2 mil = numeros del 2001 al 2010
            int numcamiseta = (int) Math.floor(Math.random() * (23 - 1 + 1) + 1);
            int num_mundiales = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
            int golesrealizados = (int) Math.floor(Math.random() * (500 - 1 + 1) + 1);
            String fecha2 = String.valueOf(dias) + "-" + String.valueOf(mes) + "-" + String.valueOf(año);
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            Date nuevaFecha2 = null;
            nuevaFecha2 = formatoFecha.parse(fecha2);

            DateFormat formato1 = DateFormat.getDateInstance();
            String sfecha = formato1.format(nuevaFecha2);

                Jugador J = new Jugador(nombre, numpasaport, nuevaFecha2, numcamiseta, num_mundiales, golesrealizados);
                Operacionjugador.jugador.add(J);
           
            
            

        }

    }

    public static void crearequipo(String paises[], String nombres[], String apellidos[]) {
        Tecnico x = null;
        for (int i = 0; i < 32; i++) {
            String nombrepais = paises[i];
            int codigofifa = (int) Math.floor(Math.random() * (910000000 - 10000000 + 1) + 10000000);
            int mundialpariticipado = (int) Math.floor(Math.random() * (32 - 1 + 1) + 1);
            int golesrecibidos = (int) Math.floor(Math.random() * (500 - 1 + 1) + 1);
            int golesrealizados = (int) Math.floor(Math.random() * (500 - 1 + 1) + 1);
            x = (Tecnico) Operaciontecnico.tecnicoo.get(i);
            String nom_tecnico = x.getNombre();
            Equipo E = new Equipo(nombrepais, codigofifa, mundialpariticipado, golesrecibidos, golesrealizados, nom_tecnico);
            Operacionequipo.equipo.add(E);
        }

    }


}
