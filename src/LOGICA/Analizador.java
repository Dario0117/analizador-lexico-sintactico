/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import LOGICA.Analizadores.Lexico;
import LOGICA.Analizadores.NodoError;
import LOGICA.Analizadores.Sintactico;
import PERSISTENCIA.IO;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author esteb
 */
public class Analizador {
    public static StringBuffer Analizar(ArrayList<String> lineas){
        StringBuffer result = new StringBuffer();
        
        Lexico.Errores.clear();
        Sintactico.TablaErr.clear();
        
        try {
            IO.Write("code.txt", lineas);
            Lexico lexico = new Lexico(new FileReader(new File("code.txt")));
            Sintactico asin = new Sintactico(lexico);
            Object x = asin.parse().value;
            System.out.println(lexico.bandera);
            System.out.println(asin.bandera);
        } catch (Exception ex) {
            Sintactico.TablaErr.add(new NodoError("ini", "Sintactico", 1, 1, "Estructura incompleta"));
        } finally{
            result.append("**** RESULTADOS DEL ANÁLISIS ****\n");
            Lexico.Errores.forEach((error) -> {
                result.append("[Error Lexico] Caracter ")
                        .append(error.getValor())
                        .append(" incorrecto en la linea ")
                        .append(error.getLinea())
                        .append(" y columna ").append(error.getColumna())
                        .append("\n");
            });
            if(!Sintactico.TablaErr.isEmpty()){
                result.append("[Error sintáctico] ")
                      .append(Sintactico.TablaErr.get(0).getMensaje())
                      .append(" en la linea ")
                      .append(Sintactico.TablaErr.get(0).getLinea())
                      .append("\n");
            }
            
            if(Sintactico.TablaErr.isEmpty() && Lexico.Errores.isEmpty()){
                result.append("Congratulations no hay errores Léxicos ni Sintácticos\n");
            }
        }
        return result;
    }
}
