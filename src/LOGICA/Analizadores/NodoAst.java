/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA.Analizadores;

import java.util.ArrayList;

/**
 *
 * @author esteb
 */
public class NodoAst {

    String Etiqueta;
    int idNod;
    String valor;
    ArrayList<NodoAst> hijos = new ArrayList<>();

    public NodoAst() {
    }

    void addHijos(NodoAst nodoAst) {
        hijos.add(nodoAst);
    }
    
}
