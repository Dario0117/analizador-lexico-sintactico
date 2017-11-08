SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_121\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd "D:\El Arca de K1d\Dropbox\Universidad\Automatas\Proyecto\Analizador\src\LOGICA\Analizadores"
java -jar "D:\El Arca de K1d\Dropbox\Universidad\Automatas\Proyecto\Analizador\src\LOGICA\Analizadores\lib\java-cup-11b.jar" -parser analisis_sintactico -symbols Simbolos Sintactico.cup
pause
