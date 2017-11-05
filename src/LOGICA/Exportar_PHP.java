/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author esteb
 */
public class Exportar_PHP {
    private final String codigo;

    public Exportar_PHP(String codigo) {
        this.codigo = codigo;
    }
    
    public void exportar(){
        String[] lines = codigo.split("\n");
        for(String line : lines){
            
            /*INICIO Y FIN*/
            if(line.equals("ini")){
                    System.out.println("<?php");
                    continue;
            }else if(line.equals("fin")){
                    System.out.println("?>");
                    continue;
            }
            
            /*VARIABLES*/
            if(line.trim().startsWith("!")){
                line = line.replace("!", "$");
                String[] partes = line.trim().split("\\|");
                System.out.printf("%s = %s;%n", partes[0], partes[2]);
                continue;
            }
            
            /*LEER*/
            
            /*MOSTRAR*/
            if(line.trim().startsWith("mostrar")){
                System.out.printf("echo \"%s\";%n", line.trim().replace("mostrar ", "").replace("!", "$"));
            }
            
            /*CONDICIONAL SI*/
            if(line.trim().startsWith("#si")){
                System.out.printf("%s(%s){%n",
                                "if",
                                line.substring(line.indexOf("#si ")+4).replace("!", "$"));
            }
            
            /*CONDICIONAL ENTONCES*/
            if(line.trim().startsWith("#entonces")){
                System.out.println("}else{");
            }
            
            
            /*Finales de bloque*/
            if(line.trim().startsWith("#fin")){
                System.out.println("}");
            }
        }
    }
}
