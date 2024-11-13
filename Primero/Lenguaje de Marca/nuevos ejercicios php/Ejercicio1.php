<!DOCTYPE html>
<html>
<head>
    <title>Relación 1</title>
</head>
<body>
<?php
    
//Ejercicio 1
$int = 124; // variables de tipo entero
$float = 5.4; // punto flotante
$string = 'relación'; // cadena de caracteres
$verdadero = true; 
$falso = false;
    
    print "<p>Suma de $int y $float:</p>\n";
    echo $int + $float. "<br>";
    
    print "<p>Resta de $int y $float:</p>\n";
    echo $int - $float. "<br>";
    
    print "<p>Multiplicación de $int y $float:</p>\n";
    echo $int * $float. "<br>";
    
    print "<p>División de $int y $float:</p>\n";
    echo $int / $float. "<br>";
    
    print "<p>Escribir en pantalla $string:</p>\n";
    echo $string."<br>"; 
  
    
    
//Ejercicio 2
//$numero=$_REQUEST[numero];   
$numero = 73;    
    
    print "<p>Tu número es $numero:</p>\n";

    if ($numero>50){
        echo $numero. ' es mayor que 50.';
    } else {
        echo $numero. ' no es mayor que 50.';
    }
    echo "<br>";    
    
   
    
//Ejercicio 5
$numero2=55;
    
    print "<p>Tu número es $numero2:</p>\n";

    if ($numero2%3==0){
        echo $numero2. ' es divisible por 3';
    } else {
        echo $numero2. ' no es divisible por 3';
    }
    echo "<br>";
 
    
    
//Ejercicio 7
$numInicial=30;
$numFinal=50;
    
    print "<p>Los números comprendidos entre $numInicial y $numFinal son: </p>\n";
    
    while ($numFinal>$numInicial){
        echo $numInicial++."<br>";
    }
    echo "<br>";

    

//Ejercicio 8
$numero3=65;
$numero4=0;
    
    print "<p>La suma de los números comprendidos entre $numero4 y $numero3 es: </p>\n";
    
    if ($numero3>0){
        for ($i=1;$i<$numero3;$i++){
            ($numero4=$numero4+$i);
        }
            echo $numero4. "<br />";
        }
    else {
        echo "Error";
    }
?>

</body>
</html>
