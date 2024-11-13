<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Relación 5</title>
</head>
<body>
<?php
    //ejercicio 1
    function numeroPar(){
        for ($i=0;$i<10;$i++){
            $resultado=$i*2;
        echo $resultado."<br/>";
        }
    }
    echo numeroPar();

    //ejercicio 3
    function numeros(){
        $numero1=33;

        if ($numero1>0){
            if ($numero1%2==0){
                echo "El número " . $numero1 . " es par.";
            } else {
                echo "El número " . $numero1 . " es impar.";
            }
        } else {
            echo "El número es menor a cero.";
        } 
        echo "<br/>";
    }
    echo numeros(); 
          
    //ejercicio 5
    $respuesta = $_POST['respuesta'];
    $correcto = 1;
    $incorrecto = 0;

    function comprobarRespuesta ($respuesta, $correcto, $incorrecto){

        if ($respuesta == "1"){
            echo "Respuesta correcta. " . " Has conseguido " . $correcto . " Punto" ;
        } else {
            echo "Respuesta incorrecta." . " Has conseguido " . $incorrecto . " Puntos";
        }
    }
    comprobarRespuesta($respuesta, $correcto, $incorrecto);
?>
</body>
</html>
