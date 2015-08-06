/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import GUI.Tecnicos;
import static GUI.Tecnicos.fechadenacimiento;
import static GUI.Tecnicos.modelo1;
import static GUI.Tecnicos.nombredeltecnico;
import static GUI.Tecnicos.numermudialesp;
import static GUI.Tecnicos.numeropasaporte;
import static GUI.Tecnicos.paisdeorigen;
import static GUI.Tecnicos.tabla1;
import static GUI.Tecnicos.vecestecnico;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author yebrail
 */
public class Operaciontecnico {

    public static LinkedList tecnicoo = new LinkedList();

    public static Tecnico p1;
    


    public static void crear(Tecnico x) {
        tecnicoo.add(x);
    }

    public static void buscar(Long a) {
        boolean s = false;

        for (int i = 0; i < tecnicoo.size(); i++) {
            p1 = (Tecnico) tecnicoo.get(i);
            if (p1.getNumerodepasaporte() == (a)) {
                Tecnicos.nombredeltecnico.setText(p1.getNombre());
                Tecnicos.numeropasaporte.setText(String.valueOf(p1.getNumerodepasaporte()));
                Tecnicos.paisdeorigen.setText(p1.getPaisdeorigen());
                Tecnicos.fechadenacimiento.setDate(p1.getFechadenacimiento());
                Tecnicos.numermudialesp.setText(String.valueOf(p1.getNumerodemundialesenquehaparticipado()));
                Tecnicos.vecestecnico.setText(String.valueOf(p1.getCantidaddevecesquehasidoTecnicocomoganadordeunmundial()));
                nombredeltecnico.setEditable(true);
                paisdeorigen.setEditable(true);
                numermudialesp.setEditable(true);
                vecestecnico.setEditable(true);
                s = true;
                break;
            }
        }
        if (!s) {
            JOptionPane.showMessageDialog(null, "numero de pasaporte no encontrado");
        }
    }

    public static void modificar() {
        p1.setNombre(Tecnicos.nombredeltecnico.getText());
        p1.setNumerodepasaporte(Long.parseLong(Tecnicos.numeropasaporte.getText()));
        p1.setPaisdeorigen(Tecnicos.paisdeorigen.getText());
        p1.setFechadenacimiento(Tecnicos.fechadenacimiento.getDate());
        p1.setNumerodemundialesenquehaparticipado(Long.parseLong(Tecnicos.numermudialesp.getText()));
        p1.setCantidaddevecesquehasidoTecnicocomoganadordeunmundial(Long.parseLong(Tecnicos.vecestecnico.getText()));
        mostrar();

    }

    public static void mostrar() {
        for (int i = modelo1.getRowCount() - 1; i >= 0; i--) {
            modelo1.removeRow(i);
        }
        
        for (int a = 0; a < tecnicoo.size(); a++) {
            p1 = (Tecnico) tecnicoo.get(a);
            modelo1.insertRow(a, new Object[]{});
            modelo1.setValueAt(p1.getNombre(), a, 0);
            modelo1.setValueAt(p1.getNumerodepasaporte(), a, 1);
            modelo1.setValueAt(p1.getPaisdeorigen(), a, 2);
            DateFormat formato1 = DateFormat.getDateInstance();
            String sfecha = formato1.format(p1.getFechadenacimiento());
            modelo1.setValueAt(sfecha, a, 3);
            modelo1.setValueAt(p1.getNumerodemundialesenquehaparticipado(), a, 4);
            modelo1.setValueAt(p1.getCantidaddevecesquehasidoTecnicocomoganadordeunmundial(), a, 5);

        }

    }

    public static void limpiar() {
        nombredeltecnico.setText(null);
        numeropasaporte.setText(null);
        paisdeorigen.setText(null);
        fechadenacimiento.setDate(null);
        numermudialesp.setText(null);
        vecestecnico.setText(null);
    }

    public static void eliminar() {
        tecnicoo.remove(tabla1.getSelectedRow());
        modelo1.removeRow(tabla1.getSelectedRow());
    }

    public static void informes() {

        try {
            TableModel model = tabla1.getModel();

            File file = new File("Tecnicos.xls");
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
