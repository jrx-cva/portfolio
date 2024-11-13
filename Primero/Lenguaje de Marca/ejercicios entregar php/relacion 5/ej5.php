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
        for($i=0;$i<10;$i++){
        $resultado=$i*2;
        echo $resultado."<br>";
        }
    }
    echo numeroPar();

    
    
    //ejercicio 3
    $numero=23;
    if ($numero>0){ 
        if($numero%2==0){
            print "<p>Tu número $numero es par </p>\n";
        }else {
            print "<p>Tu número $numero es impar </p>\n";
        }
    }else{
        print "<p>Tu número $numero no es positivo </p>\n";
    }
    echo "<br>";
    
    
            
    //ejercicio 5

    $respuesta = $_POST['respuesta'];
    $correcto = 1;
    $incorrecto = 0;


    function comprobarRespuesta($respuesta, $correcto, $incorrecto){

        if($respuesta == "a"){
            echo "Respuesta correcta. " . " Has conseguido " . $correcto . " Punto" ;
        }else{
            echo "Respuesta incorrecta." . " Has conseguido " . $incorrecto . " Puntos";
        }

    }


    comprobarRespuesta($respuesta, $correcto, $incorrecto);
 
    
    
?>
</body>

</html>
