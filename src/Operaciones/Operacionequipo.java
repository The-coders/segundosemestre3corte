
package Operaciones;

import GUI.Equipos;
import static GUI.Equipos.codigofifa;
import static GUI.Equipos.goleshechosac;
import static GUI.Equipos.golesrecibidosa;
import static GUI.Equipos.modelo2;
import static GUI.Equipos.namepais;
import static GUI.Equipos.nombredeltecnicoactual;
import static GUI.Equipos.numbermundialesparti;
import static GUI.Equipos.tabla2;
import static GUI.Equipos.modelo2;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;


public class Operacionequipo {
  
    public static LinkedList equipo = new LinkedList();

    public static Equipo p1;

    public static void crear(Equipo x) {
        equipo.add(x);  
}
    
     public static void buscar(Long a) {
        boolean s = false;

        for (int i = 0; i < equipo.size(); i++) {
            p1 = (Equipo) equipo.get(i);
            if (p1.getCodigoFIFA() == (a)) {
                Equipos.namepais.setText(p1.getNombrepais());
                Equipos.codigofifa.setText(String.valueOf(p1.getCodigoFIFA()));
                Equipos.numbermundialesparti.setText(String.valueOf(p1.getNumerodemundialesjugados()));
                Equipos.golesrecibidosa.setText(String.valueOf(p1.getNumerodegolesrecibidosenlosmundialesanteriores()));
                Equipos.goleshechosac.setText(String.valueOf(p1.getNumerodegolesrealizadosenelmundialactual()));
                Equipos.nombredeltecnicoactual.setText(p1.getDirectortecnico());
                namepais.setEditable(true);
                numbermundialesparti.setEditable(true);
                golesrecibidosa.setEditable(true);
                goleshechosac.setEditable(true);
                nombredeltecnicoactual.setEditable(true);
                s = true;
                break;
            }
        }
        if (!s) {
            JOptionPane.showMessageDialog(null, "codigo de fifa no encontrado");
        }
    }

    public static void modificar() {
        p1.setNombrepais(GUI.Equipos.namepais.getText());
        p1.setNumerodemundialesjugados(Long.parseLong(Equipos.numbermundialesparti.getText()));
        p1.setNumerodegolesrecibidosenlosmundialesanteriores(Long.parseLong(Equipos.golesrecibidosa.getText()));

        p1.setNumerodegolesrealizadosenelmundialactual(Long.parseLong(Equipos.goleshechosac.getText()));
        p1.setDirectortecnico(GUI.Equipos.nombredeltecnicoactual.getText());
        mostrar();

    }

    public static void mostrar() {
        for (int i = modelo2.getRowCount() - 1; i >= 0; i--) {
            modelo2.removeRow(i);
        }
        for (int a = 0; a < equipo.size(); a++) {
            p1 = (Equipo) equipo.get(a);
            modelo2.insertRow(a, new Object[]{});
            modelo2.setValueAt(p1.getNombrepais(), a, 0);
            modelo2.setValueAt(p1.getCodigoFIFA(), a, 1);
            modelo2.setValueAt(p1.getNumerodemundialesjugados(), a, 2);
            modelo2.setValueAt(p1.getNumerodegolesrecibidosenlosmundialesanteriores(), a, 3);
            modelo2.setValueAt(p1.getNumerodegolesrealizadosenelmundialactual(), a, 4);
            modelo2.setValueAt(p1.getDirectortecnico(), a, 5);

        }

    }

    public static void limpiar() {
        namepais.setText(null);
        codigofifa.setText(null);
        numbermundialesparti.setText(null);
        golesrecibidosa.setText(null);
        goleshechosac.setText(null);
        nombredeltecnicoactual.setText(null);
    }

    public static void eliminar() {
        equipo.remove(tabla2.getSelectedRow());
        modelo2.removeRow(tabla2.getSelectedRow());
    }

    public static void informes() {

        try {
            TableModel model = tabla2.getModel();

            File file = new File("Equipos.xls");
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
    
