/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA.Analizadores;

/**
 *
 * @author esteb
 */
public class NodoError {
    private final String valor;
    private final String tipo;
    private final int linea;
    private final int columna;
    private final String mensaje;

    public NodoError(String valor, String tipo, int linea, int columna, String mensaje) {
        this.valor = valor;
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
        this.mensaje = mensaje;
    }

    public String getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public String getMensaje() {
        return mensaje;
    }
}
