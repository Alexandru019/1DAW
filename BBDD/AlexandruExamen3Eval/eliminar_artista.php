<?php 
    include 'conexion.php';
    
    $dni=$_GET['dni'];

    $conexion->query("DELETE FROM artista WHERE dni='$dni'")or die($conexion->error);

    $conexion->close();

    header('location: artista.php');
?>