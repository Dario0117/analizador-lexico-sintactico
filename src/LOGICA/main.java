/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import LOGICA.Analizadores.Lexico;
import LOGICA.Analizadores.Sintactico;
import VISTA.Principal;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Esteban Dario Barboza Primera
 * @author Jesus David Barajas González
 */
public class main {

    public static void main(String args[]) {
//        try {
//            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//        }
//        Principal gui = new Principal();
//        gui.setVisible(true);

        try {
            // TODO add your handling code here:
//            IO.Write("code.txt", Arrays.asList(this.JTA_Field.getText().split("\n")));
            Lexico lexico = new Lexico(new FileReader(new File("code.txt")));
            Sintactico asin = new Sintactico(lexico);
            Object x = asin.parse().value;
            System.out.println(lexico.bandera);
            System.out.println(asin.bandera);
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
}
