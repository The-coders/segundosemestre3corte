package Operaciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author usuario
 */
public class Archivo {

    public static void main(String[] args) {
        
    }
    
    public static boolean grabar(String na, String cad){
        boolean saber=false;
        FileWriter fw = null;
        try {
           
            File f = new File(na);
            fw = new FileWriter(f);
            fw.write(cad);
            fw.close();
            saber=true;    
            
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return saber;
    }
}