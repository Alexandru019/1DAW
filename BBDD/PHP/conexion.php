<?php
    include 'conexion-datos.php';
    $conexion=new mysqli($server,$user,$pass,$bd);
    $conexion->set_charset("utf8");
    if ($conexion->connect_error)
        die('No se pudo conectar a la base de datos');
?>


