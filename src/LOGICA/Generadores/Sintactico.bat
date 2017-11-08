SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_121\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\Memo\Documents\NetBeansProjects\[OLC1]Tarea_201503936\src\Analizadores
java -jar C:\Users\Memo\Documents\NetBeansProjects\[OLC1]Tarea_201503936\Librerias\java-cup-11b.jar -parser analisis_sintactico -symbols Simbolos Sintactico.cup
pause
