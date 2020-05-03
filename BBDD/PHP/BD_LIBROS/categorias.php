<?php 
    include 'conexion.php';
    $sql=$conexion->query("SELECT * FROM categorias")or die($conexion->error);
?>

<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
        <h1>Página De La Base de Datos</h1>
        <p><a href="libros.php">Libros</a>
        <p><a href="categorias.php">Categorias</a>


    </body>




</html>



