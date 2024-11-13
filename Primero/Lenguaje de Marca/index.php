<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Relación 5</title>
</head>
<body>
<?php
//Relación 1 PHP
//1)
$variableEntero=90;
$variableEntero2=30;
$puntoFlotante=5.0;
$puntoFlotante2=3.8;
$cadenaCaracteres='hola';
$boleano1=true;
$boleano2=false;
echo "<b>1. Crear variables tipo entero, punto flotante, cadena de caracteres y booleanos.
Realiza las operaciones básicas con ellos y muestra el resultado por pantalla.
Comprueba que presente por pantalla lo que realmente se espera.
</b>";
echo "1.La suma de dos variables de números enteros:\n";
echo $variableEntero + $variableEntero2."<br>";
echo "2.La resta de dos variables de números enteros:\n";
echo $variableEntero-$variableEntero2."<br>";
echo "3.La multiplicación de dos variables de números enteros:\n";
echo $variableEntero*$variableEntero2."<br>";
echo "4.La división de dos variables de números enteros:\n";
echo $variableEntero/$variableEntero2."<br>";
echo "5.El resto de dos variables de números enteros:\n";
echo $variableEntero%$variableEntero2."<br>";
echo "6.La suma de dos variables de tipo flotante:\n";
echo $puntoFlotante+$puntoFlotante2."<br>";
echo "7.La resta de dos variables de tipo flotante:\n";
echo $puntoFlotante-$puntoFlotante2."<br>";
echo "8.La multiplicación de dos variables de tipo flotante:\n";
echo $puntoFlotante*$puntoFlotante2."<br>";
echo "9.La división de dos variables de tipo flotante:\n";
echo $puntoFlotante/$puntoFlotante2."<br>";
echo "10.El resto de dos variables de tipo flotante:\n";
echo $puntoFlotante%$puntoFlotante2."<br>";
echo "11.La concatenación de un número y cadena de letra:\n";
echo $cadenaCaracteres.$variableEntero."<br>";
echo "12.Un boleano verdadero:\n";
echo var_dump($boleano1)."<br>";
echo "13.Boleano negado con el exclamación:\n";
echo var_dump(!$boleano1)."<br>";
echo "14.Comparación de dos boleanos siendo el boleano1 falso y boleano2 verdadero:.<br>";
echo var_dump($boleano1==$boleano2)."<br>";
echo var_dump($boleano1>$boleano2)."<br>";//Aqui me sale que es verdadero porque coge y  compara 0 y 1 (0 false y 1 true)
echo var_dump($boleano1<$boleano2)."<br>";//Aqui me sale que es verdadero porque coge y  compara 0 y 1 (0 false y 1 true)
echo var_dump($boleano1<=$boleano2)."<br>";//Aqui me sale que es verdadero porque coge y  compara 0 y 1 (0 false y 1 true)
echo var_dump($boleano1>=$boleano2)."<br>";//Aqui me sale que es verdadero porque coge y  compara 0 y 1 (0 false y 1 true)

//2)
echo "<br><b>2. Introducir un número en una variable y que el programa informe si es mayor
que 50 o no.</b><br>";
$num1=30;
if ($num1>50){
    echo $num1. 'es mayor que 50';
}else {
    echo '$num1 no es mayor que 50';
}
echo "<br>";

//3)
echo "<br><b>3. Introducir un número en una variable y si éste es cero, visualizar en pantalla su
valor escrito con letras. Si es mayor de cero, visualizar su cuadrado. Informar de error
en caso de que el valor sea menor que cero.</b><br>";
$num2=2;
if($num2==0){
    echo $num2;
}
if ($num2>0){
    echo $num2*$num2;
}else {
    echo 'Error';

}
echo "<br>";

//4)
echo "<br><b>4. Introducir dos números en dos variables y que el programa informe si son
iguales y, en caso contrario, cuál es el mayor y cuál el menor</b><br>";
$num3=55;
$num4=80;
if ($num3==$num4){
    echo 'Son iguales';
}
else if($num3>$num4){
    echo $num3.'es mayor que'.$num4;
}
else if($num3<$num4){
    echo $num3.'es menor que'.$num4;
}
echo "<br>";

//5)
echo "<br><b>5. Introducir un número en una variable y que el programa informe si es divisible
por tres.</b><br>";
$num5=43;
if ($num5%3==0){
    echo 'Es divisible';
}else {
    echo 'No es divisible';
}
echo "<br>";

//6)
echo "<br><b>6. Crea un programa que muestre el nombre del mes que corresponda al
número introducido en una variable. Donde 1 sería enero, 2 febrero… Utiliza la
instrucción “elseif”.</b><br>";
$mes=14;
if($mes==1){
    echo "Enero";
}
elseif($mes==2){
    echo "Febrero";
}
elseif($mes==3){
    echo "Marzo";
}
elseif($mes==4){
    echo "Abril";
}
elseif($mes==5){
    echo "Mayo";
}
elseif($mes==6){
    echo "Junio";
}
elseif($mes==7){
    echo "Julio";
}
elseif($mes==8){
    echo "Agosto";
}
elseif($mes==9){
    echo "Septiembre";
}
elseif($mes==10){
    echo "Octubre";
}
elseif($mes==11){
    echo "Noviembre";
}
elseif($mes==12){
    echo "Diciembre";
}
else{
    echo "No existe ese mes";
}
echo "<br>";

//7)
echo "<br><b>7. Visualizar los números comprendidos entre dos números, previamente
introducidos en dos variable. Utiliza la instrucción “while”</b><br>";
    $numini=60;
    $numfinal=70;
while($numfinal>$numini){
    echo $numini++."<br>";
}
echo "<br>";

//8)
echo "<br><b>8. Visualiza la suma de los números comprendidos entre 0 y otro número
(validado mayor que cero) introducido en una variable. Utiliza la instrucción “for”</b><br>";
    $num=40;
    $sumatorio=0;
    if($num>0){
        for ($i=1;$i<$num;$i++){
            //$i=$sumatorio;
             ($sumatorio+=$i);
        }
        echo $sumatorio;
    }
    else{
        echo "Error";
    }

echo "<br>";
//9)
echo "<br><b>9. Visualizar los números comprendidos entre dos números, previamente
introducidos en dos variable. Utiliza la instrucción que desees.</b>";
    $numpri=20;
    $numfin=30;
    echo "<br>";
    for($i=$numpri;$i<$numfin;$i++){
    echo $i."<br>";
}

echo "<br>";


//10)
echo"<br><b>10. Realizar un programa que calcule la media aritmética de 5 números
introducidos en variables.</b><br>";
$var1=3;
$var2=8;
$var3=9;
$var4=7;
$var5=6;
$media=($var1+$var2+$var3+$var4+$var5)/5;
echo "la media es: ".$media;
?>
</body>
</html>