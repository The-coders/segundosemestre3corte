/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import GUI.Jugadores;
import static GUI.Jugadores.cantidaddedgoles;
import static GUI.Jugadores.fecha2;
import static GUI.Jugadores.modelo3;
import static GUI.Jugadores.namejugador;
import static GUI.Jugadores.numbercamisa;
import static GUI.Jugadores.numberparticy;
import static GUI.Jugadores.tabla3;
import static GUI.Tecnicos.numeropasaporte;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author yebrail
 */
public class Operacionjugador {

    public static LinkedList jugador = new LinkedList();

    public static Jugador p1;

    public static void crear(Jugador x) {
        jugador.add(x);
    }

    public static void buscar(Long a) {
        boolean s = false;

        for (int i = 0; i < jugador.size(); i++) {
            p1 = (Jugador) jugador.get(i);
            if (p1.getNumerodepasaporte() == (a)) {
                Jugadores.namejugador.setText(p1.getNombre());
                Jugadores.numeropasaporte.setText(String.valueOf(p1.getNumerodepasaporte()));
                Jugadores.fecha2.setDate(p1.getFechadenacimiento());
                Jugadores.numbercamisa.setText(String.valueOf(p1.getNúmerodesucamiseta()));
                Jugadores.numberparticy.setText(String.valueOf(p1.getNumerodemundialesenquehaparticipado()));
                Jugadores.cantidaddedgoles.setText(String.valueOf(p1.getCantidaddegolesanotadosenelmundial()));
                namejugador.setEditable(true);
                numbercamisa.setEditable(true);
                numberparticy.setEditable(true);
                cantidaddedgoles.setEditable(true);
                s = true;
                break;
            }
        }
        if (!s) {
            JOptionPane.showMessageDialog(null, "numero de pasaporte no encontrado");
        }
    }

    public static void modificar() {
        p1.setNombre(Jugadores.namejugador.getText());
        p1.setNumerodepasaporte(Long.parseLong(Jugadores.numeropasaporte.getText()));
        p1.setFechadenacimiento(Jugadores.fecha2.getDate());
        p1.setNúmerodesucamiseta(Long.parseLong(Jugadores.numbercamisa.getText()));
        p1.setNumerodemundialesenquehaparticipado(Long.parseLong(Jugadores.numbercamisa.getText()));
        p1.setCantidaddegolesanotadosenelmundial(Long.parseLong(Jugadores.cantidaddedgoles.getText()));
        mostrar();

    }

    public static void mostrar() {
        for (int i = modelo3.getRowCount() - 1; i >= 0; i--) {
            modelo3.removeRow(i);
        }
        for (int a = 0; a < jugador.size(); a++) {
            p1 = (Jugador) jugador.get(a);
            modelo3.insertRow(a, new Object[]{});
            modelo3.setValueAt(p1.getNombre(), a, 0);
            modelo3.setValueAt(p1.getNumerodepasaporte(), a, 1);
            DateFormat formato1 = DateFormat.getDateInstance();
            String sfecha = formato1.format(p1.getFechadenacimiento());
            modelo3.setValueAt(sfecha, a, 2);
            modelo3.setValueAt(p1.getNúmerodesucamiseta(), a, 3);

            modelo3.setValueAt(p1.getNumerodemundialesenquehaparticipado(), a, 4);
            modelo3.setValueAt(p1.getCantidaddegolesanotadosenelmundial(), a, 5);

        }

    }

    public static void limpiar() {
        namejugador.setText(null);
       
        fecha2.setDate(null);
        numbercamisa.setText(null);
        numberparticy.setText(null);
       cantidaddedgoles.setText(null);
    }

    public static void eliminar() {
       jugador.remove(tabla3.getSelectedRow());
        modelo3.removeRow(tabla3.getSelectedRow());
    }

    public static void informes() {

        try {
            TableModel model = tabla3.getModel();

            File file = new File("Jugadores.xls");
            FileWriter output = new FileWriter(file);

            for (int i = 0; i < model.getColumnCount(); i++) {
                output.write(model.getColumnName(i) + "\t");
            }

            output.write("\n");

            for (int k = 0; k < model.getRowCount(); k++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    output.write(model.getValueAt(k, j).toString() + "\t");
                }
                output.write("\n");

            }
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
