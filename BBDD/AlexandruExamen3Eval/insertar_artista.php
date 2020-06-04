<?php
    include 'conexion.php'; 
    $dni=$_POST['dni'];
    $nombre=$_POST['nombre'];
    $direccion=$_POST['direccion'];
    $telefono=$_POST['telefono'];
    $conexion->query("INSERT INTO artista VALUES('$dni','$nombre','$direccion',$telefono)");
    $conexion->close();
    header('location:artista.php');

?>