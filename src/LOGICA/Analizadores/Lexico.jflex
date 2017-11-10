package LOGICA.Analizadores;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.LinkedList;

%%

%{
    public static LinkedList<NodoError> Errores = new LinkedList<NodoError>();
    public static int bandera = 0;
%}

// Directivas

%public
%class Lexico
%cupsym Simbolos
%cup
%char
%column
%line
%unicode

// Expresiones regulares

digito = [0-9]
numero = ({digito}+ | {digito}+"."{digito}+)
letra = [a-zA-ZñÑ]
id = "!"{letra}({letra}|{digito}|"_")*
cadena = "\""[^\"\n]*"\""

%%

<YYINITIAL> "ini"                   {System.out.println("Reconociendo: "+yytext()+", Tini");
                                    return new Symbol(Simbolos.Tini, yycolumn, yyline, yytext());}

<YYINITIAL> "fin"                   {System.out.println("Reconociendo: "+yytext()+", Tfin");
                                    return new Symbol(Simbolos.Tfin, yycolumn, yyline, yytext());}

<YYINITIAL> "ente"                  {System.out.println("Reconociendo: "+yytext()+", Rint");
                                    return new Symbol(Simbolos.Rint, yycolumn, yyline, yytext());}

<YYINITIAL> "deci"                  {System.out.println("Reconociendo: "+yytext()+", Rdeci");
                                    return new Symbol(Simbolos.Rdeci, yycolumn, yyline, yytext());}

<YYINITIAL> "cade"                  {System.out.println("Reconociendo: "+yytext()+", Rcade");
                                    return new Symbol(Simbolos.Rcade, yycolumn, yyline, yytext());}

<YYINITIAL> "bool"                  {System.out.println("Reconociendo: "+yytext()+", Rbool");
                                    return new Symbol(Simbolos.Rbool, yycolumn, yyline, yytext());}

<YYINITIAL> "#para"                 {System.out.println("Reconociendo: "+yytext()+", Tpara");
                                    return new Symbol(Simbolos.Tpara, yycolumn, yyline, yytext());}

<YYINITIAL> "#mientras"             {System.out.println("Reconociendo: "+yytext()+", Tmientras");
                                    return new Symbol(Simbolos.Tmientras, yycolumn, yyline, yytext());}

<YYINITIAL> "#si"                   {System.out.println("Reconociendo: "+yytext()+", Tsi");
                                    return new Symbol(Simbolos.Tsi, yycolumn, yyline, yytext());}

<YYINITIAL> "#entonces"             {System.out.println("Reconociendo: "+yytext()+", Tentonces");
                                    return new Symbol(Simbolos.Tentonces, yycolumn, yyline, yytext());}

<YYINITIAL> "#entonces_si"          {System.out.println("Reconociendo: "+yytext()+", Tentonces_si");
                                    return new Symbol(Simbolos.Tentonces_si, yycolumn, yyline, yytext());}

<YYINITIAL> "leer"                  {System.out.println("Reconociendo: "+yytext()+", Tleer");
                                    return new Symbol(Simbolos.Tleer, yycolumn, yyline, yytext());}

<YYINITIAL> "mostrar"               {System.out.println("Reconociendo: "+yytext()+", Tmostrar");
                                    return new Symbol(Simbolos.Tmostrar, yycolumn, yyline, yytext());}

<YYINITIAL> "#fin_para"             {System.out.println("Reconociendo: "+yytext()+", Tfin_para");
                                    return new Symbol(Simbolos.Tfin_para, yycolumn, yyline, yytext());}

<YYINITIAL> "#fin_mientras"         {System.out.println("Reconociendo: "+yytext()+", Tfin_mientras");
                                    return new Symbol(Simbolos.Tfin_mientras, yycolumn, yyline, yytext());}

<YYINITIAL> "#fin_si"               {System.out.println("Reconociendo: "+yytext()+", Tfin_si");
                                    return new Symbol(Simbolos.Tfin_si, yycolumn, yyline, yytext());}

<YYINITIAL> "true"                  {System.out.println("Reconociendo: "+yytext()+", Rtrue");
                                    return new Symbol(Simbolos.Rtrue, yycolumn, yyline, yytext());}

<YYINITIAL> "false"                 {System.out.println("Reconociendo: "+yytext()+", Rfalse");
                                    return new Symbol(Simbolos.Rfalse, yycolumn, yyline, yytext());}

<YYINITIAL> "+"                     {System.out.println("Reconociendo: "+yytext()+", Tmas");
                                    return new Symbol(Simbolos.Tmas, yycolumn, yyline, yytext());}

<YYINITIAL> "++"                    {System.out.println("Reconociendo: "+yytext()+", Tmasmas");
                                    return new Symbol(Simbolos.Tmasmas, yycolumn, yyline, yytext());}

<YYINITIAL> "-"                     {System.out.println("Reconociendo: "+yytext()+", Tmenos");
                                    return new Symbol(Simbolos.Tmenos, yycolumn, yyline, yytext());}

<YYINITIAL> "--"                    {System.out.println("Reconociendo: "+yytext()+", Tmenosmenos");
                                    return new Symbol(Simbolos.Tmenosmenos, yycolumn, yyline, yytext());}

<YYINITIAL> "*"                     {System.out.println("Reconociendo: "+yytext()+", Tpor");
                                    return new Symbol(Simbolos.Tpor, yycolumn, yyline, yytext());}

<YYINITIAL> "/"                     {System.out.println("Reconociendo: "+yytext()+", Tentre");
                                    return new Symbol(Simbolos.Tentre, yycolumn, yyline, yytext());}

<YYINITIAL> "<"                     {System.out.println("Reconociendo: "+yytext()+", Tmenor");
                                    return new Symbol(Simbolos.Tmenor, yycolumn, yyline, yytext());}

<YYINITIAL> ">"                     {System.out.println("Reconociendo: "+yytext()+", Tmayor");
                                    return new Symbol(Simbolos.Tmayor, yycolumn, yyline, yytext());}

<YYINITIAL> ">="                    {System.out.println("Reconociendo: "+yytext()+", Tmayor_igual");
                                    return new Symbol(Simbolos.Tmayor_igual, yycolumn, yyline, yytext());}

<YYINITIAL> "<="                    {System.out.println("Reconociendo: "+yytext()+", Tmenor_igual");
                                    return new Symbol(Simbolos.Tmenor_igual, yycolumn, yyline, yytext());}

<YYINITIAL> "="                     {System.out.println("Reconociendo: "+yytext()+", Tasign");
                                    return new Symbol(Simbolos.Tasign, yycolumn, yyline, yytext());}

<YYINITIAL> "!="                    {System.out.println("Reconociendo: "+yytext()+", Tdifer");
                                    return new Symbol(Simbolos.Tdifer, yycolumn, yyline, yytext());}

<YYINITIAL> "=="                    {System.out.println("Reconociendo: "+yytext()+", Tigual");
                                    return new Symbol(Simbolos.Tigual, yycolumn, yyline, yytext());}

<YYINITIAL> "|"                    {System.out.println("Reconociendo: "+yytext()+", Tsep");
                                    return new Symbol(Simbolos.Tsep, yycolumn, yyline, yytext());}

<YYINITIAL> ","                    {System.out.println("Reconociendo: "+yytext()+", Tcoma");
                                    return new Symbol(Simbolos.Tcoma, yycolumn, yyline, yytext());}

<YYINITIAL> {numero}                {System.out.println("Reconociendo: "+yytext()+", Tnumero");
                                    return new Symbol(Simbolos.Tnumero, yycolumn, yyline, yytext());}

<YYINITIAL> {id}                    {System.out.println("Reconociendo: "+yytext()+", Tid");
                                    return new Symbol(Simbolos.Tid, yycolumn, yyline, yytext());}

<YYINITIAL> {cadena}                {System.out.println("Reconociendo: "+yytext()+", Tcadena");
                                    return new Symbol(Simbolos.Tcadena, yycolumn, yyline, yytext());}

[ \t\r\n\f]                         {}

.                                   { System.out.printf("Error léxico: %s [%s,%s]%n", yytext(), yyline, yycolumn);
                                    NodoError err = new NodoError(yytext(), "ERROR LEXICO", (yyline+1), (yycolumn+1), "Simbolo no existente");
                                    Errores.add(err); bandera = 1;}
