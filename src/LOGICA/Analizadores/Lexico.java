/* The following code was generated by JFlex 1.6.1 */

package LOGICA.Analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;

/**
 *
 * @author Esteban Dario Barboza Primera
 * @author Jesus David Barajas González
 */


public class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\41\1\7\1\42\1\41\1\41\22\0\1\41\1\4\1\6"+
    "\1\23\6\0\1\32\1\30\1\40\1\31\1\2\1\33\12\1\2\0"+
    "\1\34\1\36\1\35\2\0\32\3\4\0\1\5\1\0\1\17\1\20"+
    "\1\16\1\15\1\13\1\12\2\3\1\10\2\3\1\22\1\26\1\11"+
    "\1\21\1\24\1\3\1\25\1\27\1\14\6\3\1\0\1\37\10\0"+
    "\1\42\113\0\1\3\37\0\1\3\u1f36\0\1\42\1\42\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\1\1\3\11\1\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\0"+
    "\1\15\1\16\1\0\1\17\15\0\1\20\1\21\1\22"+
    "\1\23\1\24\1\2\1\25\1\26\11\0\1\27\1\0"+
    "\1\30\1\31\1\32\1\33\1\34\7\0\1\35\12\0"+
    "\1\36\2\0\1\37\4\0\1\40\1\0\1\41\1\42"+
    "\5\0\1\43\1\44";

  private static int [] zzUnpackAction() {
    int [] result = new int[103];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\43\0\106\0\151\0\214\0\43\0\257\0\322"+
    "\0\365\0\u0118\0\u013b\0\u015e\0\u0181\0\u01a4\0\u01c7\0\u01ea"+
    "\0\u020d\0\43\0\43\0\u0230\0\u0253\0\u0276\0\43\0\43"+
    "\0\u0299\0\u02bc\0\43\0\214\0\43\0\u02df\0\u0302\0\u0325"+
    "\0\u0348\0\u036b\0\u038e\0\u03b1\0\u03d4\0\u03f7\0\u041a\0\u043d"+
    "\0\u0460\0\u0483\0\43\0\43\0\43\0\43\0\43\0\u0299"+
    "\0\43\0\43\0\u04a6\0\u04c9\0\u04ec\0\u050f\0\u0532\0\u0555"+
    "\0\u0578\0\u059b\0\u05be\0\43\0\u05e1\0\43\0\43\0\43"+
    "\0\43\0\43\0\u0604\0\u0627\0\u064a\0\u066d\0\u0690\0\u06b3"+
    "\0\u06d6\0\43\0\u06f9\0\u071c\0\u073f\0\u0762\0\u0785\0\u07a8"+
    "\0\u07cb\0\u07ee\0\u0811\0\u0834\0\43\0\u0857\0\u087a\0\43"+
    "\0\u089d\0\u08c0\0\u08e3\0\u0906\0\43\0\u0929\0\u094c\0\43"+
    "\0\u096f\0\u0992\0\u09b5\0\u09d8\0\u09fb\0\43\0\43";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[103];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\2\1\4\1\2\1\5\1\6\1\7"+
    "\1\2\1\10\1\11\1\2\1\12\1\13\1\2\1\14"+
    "\1\2\1\15\1\16\2\2\1\17\1\2\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\6"+
    "\45\0\1\3\1\31\43\0\1\32\4\0\13\32\1\0"+
    "\4\32\6\0\1\33\4\0\6\34\1\35\1\0\33\34"+
    "\11\0\1\36\41\0\1\37\43\0\1\40\44\0\1\41"+
    "\46\0\1\42\44\0\1\43\34\0\1\44\41\0\1\45"+
    "\1\46\10\0\1\47\1\0\1\50\1\51\34\0\1\52"+
    "\51\0\1\53\43\0\1\54\47\0\1\55\42\0\1\56"+
    "\42\0\1\57\5\0\1\60\42\0\1\32\1\0\1\32"+
    "\1\0\1\32\2\0\13\32\1\0\4\32\23\0\1\61"+
    "\43\0\1\62\45\0\1\63\44\0\1\64\41\0\1\65"+
    "\46\0\1\66\34\0\1\67\37\0\1\70\43\0\1\71"+
    "\50\0\1\72\33\0\1\73\42\0\1\74\61\0\1\75"+
    "\26\0\1\76\37\0\1\77\45\0\1\100\51\0\1\101"+
    "\45\0\1\102\26\0\1\103\45\0\1\104\53\0\1\105"+
    "\30\0\1\106\43\0\1\107\33\0\1\110\56\0\1\111"+
    "\40\0\1\112\34\0\1\113\56\0\1\114\41\0\1\115"+
    "\1\0\1\116\1\117\24\0\1\120\45\0\1\121\45\0"+
    "\1\122\42\0\1\123\33\0\1\124\42\0\1\125\50\0"+
    "\1\126\51\0\1\127\42\0\1\130\42\0\1\131\30\0"+
    "\1\132\42\0\1\133\46\0\1\134\42\0\1\135\34\0"+
    "\1\136\60\0\1\137\42\0\1\140\27\0\1\141\33\0"+
    "\1\142\62\0\1\143\44\0\1\144\32\0\1\145\33\0"+
    "\1\146\61\0\1\147\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2590];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\13\1\2\11\3\1\2\11"+
    "\1\0\1\1\1\11\1\0\1\11\15\0\5\11\1\1"+
    "\2\11\11\0\1\11\1\0\5\11\7\0\1\11\12\0"+
    "\1\11\2\0\1\11\4\0\1\11\1\0\1\1\1\11"+
    "\5\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[103];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public static LinkedList<NodoError> Errores = new LinkedList<NodoError>();
    public static int bandera = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 150) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Simbolos.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.printf("Error léxico: %s [%s,%s]%n", yytext(), yyline, yycolumn);
                                    NodoError err = new NodoError(yytext(), "ERROR LEXICO", (yyline+1), (yycolumn+1), "Simbolo no existente");
                                    Errores.add(err); bandera = 1;
            }
          case 37: break;
          case 2: 
            { System.out.println("Reconociendo: "+yytext()+", Tnumero");
                                    return new Symbol(Simbolos.Tnumero, yycolumn, yyline, yytext());
            }
          case 38: break;
          case 3: 
            { 
            }
          case 39: break;
          case 4: 
            { System.out.println("Reconociendo: "+yytext()+", Tmas");
                                    return new Symbol(Simbolos.Tmas, yycolumn, yyline, yytext());
            }
          case 40: break;
          case 5: 
            { System.out.println("Reconociendo: "+yytext()+", Tmenos");
                                    return new Symbol(Simbolos.Tmenos, yycolumn, yyline, yytext());
            }
          case 41: break;
          case 6: 
            { System.out.println("Reconociendo: "+yytext()+", Tpor");
                                    return new Symbol(Simbolos.Tpor, yycolumn, yyline, yytext());
            }
          case 42: break;
          case 7: 
            { System.out.println("Reconociendo: "+yytext()+", Tentre");
                                    return new Symbol(Simbolos.Tentre, yycolumn, yyline, yytext());
            }
          case 43: break;
          case 8: 
            { System.out.println("Reconociendo: "+yytext()+", Tmenor");
                                    return new Symbol(Simbolos.Tmenor, yycolumn, yyline, yytext());
            }
          case 44: break;
          case 9: 
            { System.out.println("Reconociendo: "+yytext()+", Tmayor");
                                    return new Symbol(Simbolos.Tmayor, yycolumn, yyline, yytext());
            }
          case 45: break;
          case 10: 
            { System.out.println("Reconociendo: "+yytext()+", Tasign");
                                    return new Symbol(Simbolos.Tasign, yycolumn, yyline, yytext());
            }
          case 46: break;
          case 11: 
            { System.out.println("Reconociendo: "+yytext()+", Tsep");
                                    return new Symbol(Simbolos.Tsep, yycolumn, yyline, yytext());
            }
          case 47: break;
          case 12: 
            { System.out.println("Reconociendo: "+yytext()+", Tcoma");
                                    return new Symbol(Simbolos.Tcoma, yycolumn, yyline, yytext());
            }
          case 48: break;
          case 13: 
            { System.out.println("Reconociendo: "+yytext()+", Tid");
                                    return new Symbol(Simbolos.Tid, yycolumn, yyline, yytext());
            }
          case 49: break;
          case 14: 
            { System.out.println("Reconociendo: "+yytext()+", Tdifer");
                                    return new Symbol(Simbolos.Tdifer, yycolumn, yyline, yytext());
            }
          case 50: break;
          case 15: 
            { System.out.println("Reconociendo: "+yytext()+", Tcadena");
                                    return new Symbol(Simbolos.Tcadena, yycolumn, yyline, yytext());
            }
          case 51: break;
          case 16: 
            { System.out.println("Reconociendo: "+yytext()+", Tmasmas");
                                    return new Symbol(Simbolos.Tmasmas, yycolumn, yyline, yytext());
            }
          case 52: break;
          case 17: 
            { System.out.println("Reconociendo: "+yytext()+", Tmenosmenos");
                                    return new Symbol(Simbolos.Tmenosmenos, yycolumn, yyline, yytext());
            }
          case 53: break;
          case 18: 
            { System.out.println("Reconociendo: "+yytext()+", Tmenor_igual");
                                    return new Symbol(Simbolos.Tmenor_igual, yycolumn, yyline, yytext());
            }
          case 54: break;
          case 19: 
            { System.out.println("Reconociendo: "+yytext()+", Tmayor_igual");
                                    return new Symbol(Simbolos.Tmayor_igual, yycolumn, yyline, yytext());
            }
          case 55: break;
          case 20: 
            { System.out.println("Reconociendo: "+yytext()+", Tigual");
                                    return new Symbol(Simbolos.Tigual, yycolumn, yyline, yytext());
            }
          case 56: break;
          case 21: 
            { System.out.println("Reconociendo: "+yytext()+", Tini");
                                    return new Symbol(Simbolos.Tini, yycolumn, yyline, yytext());
            }
          case 57: break;
          case 22: 
            { System.out.println("Reconociendo: "+yytext()+", Tfin");
                                    return new Symbol(Simbolos.Tfin, yycolumn, yyline, yytext());
            }
          case 58: break;
          case 23: 
            { System.out.println("Reconociendo: "+yytext()+", Tsi");
                                    return new Symbol(Simbolos.Tsi, yycolumn, yyline, yytext());
            }
          case 59: break;
          case 24: 
            { System.out.println("Reconociendo: "+yytext()+", Rint");
                                    return new Symbol(Simbolos.Rint, yycolumn, yyline, yytext());
            }
          case 60: break;
          case 25: 
            { System.out.println("Reconociendo: "+yytext()+", Rdeci");
                                    return new Symbol(Simbolos.Rdeci, yycolumn, yyline, yytext());
            }
          case 61: break;
          case 26: 
            { System.out.println("Reconociendo: "+yytext()+", Rcade");
                                    return new Symbol(Simbolos.Rcade, yycolumn, yyline, yytext());
            }
          case 62: break;
          case 27: 
            { System.out.println("Reconociendo: "+yytext()+", Rbool");
                                    return new Symbol(Simbolos.Rbool, yycolumn, yyline, yytext());
            }
          case 63: break;
          case 28: 
            { System.out.println("Reconociendo: "+yytext()+", Tleer");
                                    return new Symbol(Simbolos.Tleer, yycolumn, yyline, yytext());
            }
          case 64: break;
          case 29: 
            { System.out.println("Reconociendo: "+yytext()+", Tpara");
                                    return new Symbol(Simbolos.Tpara, yycolumn, yyline, yytext());
            }
          case 65: break;
          case 30: 
            { System.out.println("Reconociendo: "+yytext()+", Tfin_si");
                                    return new Symbol(Simbolos.Tfin_si, yycolumn, yyline, yytext());
            }
          case 66: break;
          case 31: 
            { System.out.println("Reconociendo: "+yytext()+", Tmostrar");
                                    return new Symbol(Simbolos.Tmostrar, yycolumn, yyline, yytext());
            }
          case 67: break;
          case 32: 
            { System.out.println("Reconociendo: "+yytext()+", Tfin_para");
                                    return new Symbol(Simbolos.Tfin_para, yycolumn, yyline, yytext());
            }
          case 68: break;
          case 33: 
            { System.out.println("Reconociendo: "+yytext()+", Tentonces");
                                    return new Symbol(Simbolos.Tentonces, yycolumn, yyline, yytext());
            }
          case 69: break;
          case 34: 
            { System.out.println("Reconociendo: "+yytext()+", Tmientras");
                                    return new Symbol(Simbolos.Tmientras, yycolumn, yyline, yytext());
            }
          case 70: break;
          case 35: 
            { System.out.println("Reconociendo: "+yytext()+", Tentonces_si");
                                    return new Symbol(Simbolos.Tentonces_si, yycolumn, yyline, yytext());
            }
          case 71: break;
          case 36: 
            { System.out.println("Reconociendo: "+yytext()+", Tfin_mientras");
                                    return new Symbol(Simbolos.Tfin_mientras, yycolumn, yyline, yytext());
            }
          case 72: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
