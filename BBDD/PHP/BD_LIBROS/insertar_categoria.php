<?php
    include '../conexion.php';
    $id_categoria=$_POST['id_categoria'];
    $categoria=$_POST['categoria'];
    $conexion->query("INSERT INTO categorias VALUES($id_categoria,'$categoria')");
    $conexion->close();
    header('location:categorias.php');

?>