<?php
    include '../conexion.php';

    $id_categoria=$_GET['id_categoria'];

    $conexion->query("DELETE FROM categorias WHERE id_categoria=$id_categoria") or die($conexion->error);

    $conexion->close();

    header('location: categorias.php');
?>