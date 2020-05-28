<?php 
    include '../conexion.php';
    
    $id_libro=$_GET['id_libro'];

    $conexion->query("DELETE FROM libros WHERE id_libro=$id_libro")or die($conexion->error);

    $conexion->close();

    header('location: libros.php');
?>