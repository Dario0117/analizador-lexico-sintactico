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
                    System.out.println("\n?>");
                    continue;
            }
            
            /*VARIABLES*/
            if(line.trim().startsWith("!")){
                line = line.replace("!", "$");
                String[] partes = line.split("\\|");
                System.out.printf("%s = %s%n", partes[0], partes[2]);
                continue;
            }
            
            /*MOSTRAR*/
            if(line.trim().startsWith("mostrar")){
                System.out.printf("echo \"%s\";", line.trim().replace("mostrar ", "").replace("!", "$"));
            }
        }
    }
}
