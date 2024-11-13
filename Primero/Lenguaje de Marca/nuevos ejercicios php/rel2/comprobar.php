<!DOCTYPE html>
<html>
<head>
    <title>Comprobación</title>
</head>
<body>
    <h1>Tus Datos: </h1>
    <h3>Estos son los datos que nos has enviado:</h3>
    
    <?php  
    echo "Nombre: "; echo $_POST['nombre']; echo "<br/>";
    echo "Apellidos: "; echo $_POST['apellidos']; echo "<br/>";
    echo "Edad: "; echo $_POST['edad']; echo "<br/>";
    echo "Sexo: "; echo $_POST['sexo']; echo "<br/>";
    echo "Estudios: "; echo $_POST['estudios']; echo "<br/>";
    echo "Hobbies: ";  //pongo espacio entre las actividades para verlo más claro
    
    if( empty($_POST["deportes"]) ) { 
        echo ""; }
    else { 
        echo "Deportes ";}
    
    if( empty($_POST["cine"]) ) { 
        echo ""; }
    else { 
        echo "Cine ";}
    
    if( empty($_POST["lectura"]) ) { 
        echo ""; }
    else { 
        echo "Lectura ";}
    
    if( empty($_POST["musica"]) ) { 
        echo ""; }
    else { 
        echo "Música";} echo "<br/>";

    echo "Día: "; echo $_POST['dia']; echo "<br/>";
    echo "Mes: "; echo $_POST['mes']; echo "<br/>";
    echo "Año: "; echo $_POST['año']; echo "<br/>";
    echo "Tu comentario: "; echo $_POST['comentario']; echo "<br/>";
    ?>
    
    <p>Comprueba tus datos antes de enviarlos, si no están bien vuelve a escribirlos.</p>
    <p>Los datos son correctos: <a href="enviar.html">Enviar</a>
    <p>Los datos no son correctos: <a href="ej2.html">Volver a escribirlos</a>
        
</body>
</html>
