<?php
    include '../conexion.php'; 
    $id_libro=$_POST['id_libro'];
    $titulo=$_POST['titulo'];
    $autor=$_POST['autor'];
    $categoria=$_POST['categoria'];
    $precio=$_POST['precio'];
    $conexion->query("INSERT INTO libros VALUES($id_libro,'$titulo','$autor',$categoria,$precio)");
    $conexion->close();
    header('location:libros.php');

?>
