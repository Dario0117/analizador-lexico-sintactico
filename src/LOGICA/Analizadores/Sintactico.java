
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package LOGICA.Analizadores;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\004\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\005\005\000\002\005\003\000\002\013\003\000\002" +
    "\013\003\000\002\013\003\000\002\013\003\000\002\014" +
    "\003\000\002\015\005\000\002\015\005\000\002\015\003" +
    "\000\002\016\005\000\002\016\005\000\002\016\003\000" +
    "\002\017\003\000\002\017\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\004\004\004\001\002\000\004\012\011\001" +
    "\002\000\004\002\007\001\002\000\004\002\000\001\002" +
    "\000\004\002\001\001\002\000\004\005\ufffa\001\002\000" +
    "\014\005\ufff7\006\021\007\025\010\022\011\023\001\002" +
    "\000\004\005\ufffc\001\002\000\004\005\ufffb\001\002\000" +
    "\004\005\ufff9\001\002\000\004\005\ufffd\001\002\000\004" +
    "\005\ufffe\001\002\000\004\005\020\001\002\000\004\002" +
    "\uffff\001\002\000\006\017\ufff4\020\ufff4\001\002\000\006" +
    "\017\ufff5\020\ufff5\001\002\000\006\017\ufff6\020\ufff6\001" +
    "\002\000\006\017\032\020\033\001\002\000\006\017\ufff3" +
    "\020\ufff3\001\002\000\014\005\uffef\013\uffef\014\uffef\015" +
    "\037\016\040\001\002\000\004\005\ufff8\001\002\000\014" +
    "\005\uffec\013\uffec\014\uffec\015\uffec\016\uffec\001\002\000" +
    "\010\005\ufff2\013\035\014\034\001\002\000\014\005\uffeb" +
    "\013\uffeb\014\uffeb\015\uffeb\016\uffeb\001\002\000\014\005" +
    "\uffea\013\uffea\014\uffea\015\uffea\016\uffea\001\002\000\006" +
    "\017\032\020\033\001\002\000\006\017\032\020\033\001" +
    "\002\000\014\005\ufff1\013\ufff1\014\ufff1\015\037\016\040" +
    "\001\002\000\006\017\032\020\033\001\002\000\006\017" +
    "\032\020\033\001\002\000\014\005\uffed\013\uffed\014\uffed" +
    "\015\uffed\016\uffed\001\002\000\014\005\uffee\013\uffee\014" +
    "\uffee\015\uffee\016\uffee\001\002\000\014\005\ufff0\013\ufff0" +
    "\014\ufff0\015\037\016\040\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\006\002\004\003\005\001\001\000\020\004" +
    "\016\005\015\006\014\007\011\010\012\011\007\012\013" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\023\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\014\026\015\030\016\025\017\027\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\016\042\017\027\001\001\000\006\016\035\017" +
    "\027\001\001\000\002\001\001\000\004\017\041\001\001" +
    "\000\004\017\040\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public static LinkedList<NodoError> TablaErr = new LinkedList<NodoError>();
	public int bandera = 0;
	public int contador = 0;
	public static NodoAst padre;
	
/**Metodo al que se llama automaticamente ante algun error sintactico*/
public void syntax_error(Symbol s){
	String lexema = s.value.toString();
	int fila = s.right;
	int columna = s.left;
	System.out.println("!!!!!! Error Sintactico Recuperado !!!!!!");
	System.out.println("\t\tLexema: "+lexema);
	System.out.println("\t\tFila: "+fila);
	System.out.println("\t\tColumna: "+columna);
	NodoError datos = new NodoError(lexema, "ERROR SINTACTICO", fila, columna, "Simbolo no esperado");
	TablaErr.add(datos);
	bandera = 1;
}

/*Metodo al que se llama en el momento en que ya no es posible uan recuperacion de errores*/
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
	String lexema = s.value.toString();
	int fila = s.right;
	int columna = s.left;
	System.out.println("!!!!!! Error Sintactico, Panic Mode !!!!!!");
	System.out.println("\t\tLexema: "+lexema);
	System.out.println("\t\tFila: "+fila);
	System.out.println("\t\tColumna: "+columna);
	NodoError datos = new NodoError(lexema, "ERROR SINTACTICO", fila, columna, "Simbolo no esperado Error Fatal");
	TablaErr.add(datos);
	bandera = 1;
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {


	//Espacio que servira para metodos en el lenguaje de java

  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= PROGRAMA 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "Inicio"; nodo.addHijos((NodoAst) n);
	parser.padre = (NodoAst) nodo;
	RESULT = nodo;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PROGRAMA ::= Tini CUERPO Tfin 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "CUERPO";
	nodo.addHijos((NodoAst)n);
	RESULT = nodo;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("PROGRAMA",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CUERPO ::= VARIABLE 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "VARIABLE"; 
	nodo.addHijos((NodoAst) n);
	RESULT = nodo;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CUERPO ::= CICLO 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "CICLO"; 
	nodo.addHijos((NodoAst) n1);
	RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CUERPO ::= CONDICIONAL_IF 
            {
              Object RESULT =null;
		int n2left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n2 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "CONDICIONAL_IF"; 
	nodo.addHijos((NodoAst) n2);
	RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CUERPO ::= MOSTRAR 
            {
              Object RESULT =null;
		int n3left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n3right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n3 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "MOSTRAR"; 
	nodo.addHijos((NodoAst) n3);
	RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CUERPO ::= LEER 
            {
              Object RESULT =null;
		int n4left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n4right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n4 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "LEER"; 
	nodo.addHijos((NodoAst) n4);
	RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CUERPO ::= OPERACION 
            {
              Object RESULT =null;
		int n5left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n5right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n5 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "OPERACION"; 
	nodo.addHijos((NodoAst) n5);
	RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // VARIABLE ::= Tid TIPO EXPRESION 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int n1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "VARIABLE";
	NodoAst nodo1 = new NodoAst(); nodo1.idNod = contador; contador++; nodo1.Etiqueta = "id";
	nodo.addHijos((NodoAst) n);
	nodo.addHijos((NodoAst) n1);
	RESULT = nodo;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("VARIABLE",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // VARIABLE ::= Tid 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "VARIABLE";
	NodoAst nodo1 = new NodoAst(); nodo1.idNod = contador; contador++; nodo1.Etiqueta = "id";
	nodo.addHijos((NodoAst) n);
	RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("VARIABLE",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // TIPO ::= Rint 
            {
              Object RESULT =null;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "int"; RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIPO",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // TIPO ::= Rcade 
            {
              Object RESULT =null;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "cadena"; RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIPO",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // TIPO ::= Rdeci 
            {
              Object RESULT =null;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "decimal"; RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIPO",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // TIPO ::= Rbool 
            {
              Object RESULT =null;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "booleano"; RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIPO",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXPRESION ::= E 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = n; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESION",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // E ::= E Tmas T 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int n1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "+"; nodo.addHijos((NodoAst)n); nodo.addHijos((NodoAst)n1); RESULT = nodo; 
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // E ::= E Tmenos T 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int n1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "-"; nodo.addHijos((NodoAst)n); nodo.addHijos((NodoAst)n1); RESULT = nodo; 
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // E ::= T 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	RESULT = n;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // T ::= T Tpor F 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int n1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "*"; nodo.addHijos((NodoAst)n); nodo.addHijos((NodoAst)n1); RESULT = nodo; 
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("T",12, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // T ::= T Tentre F 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int n1left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n1 = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "/"; nodo.addHijos((NodoAst)n); nodo.addHijos((NodoAst)n1); RESULT = nodo; 
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("T",12, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // T ::= F 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	RESULT = n;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("T",12, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // F ::= Tnumero 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "Numero"; nodo.valor = n.toString(); RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("F",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // F ::= Tcadena 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		
	NodoAst nodo = new NodoAst(); nodo.idNod = contador; contador++; nodo.Etiqueta = "Cadena"; nodo.valor = n.toString(); RESULT = nodo;
	
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("F",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
