<?php

    include 'conexion.php';


    $dni=$_GET['dni'];

    if(isset($_GET['editar'])) { 
        $nombre=$_POST['nombre'];
        $direccion=$_POST['direccion'];
        $telefono=$_POST['telefono'];
        $conexion->query("UPDATE artista SET nombre='$nombre', direccion='$direccion', telefono='$telefono' WHERE dni='$dni'");
        $conexion->close();
        header('location:artista.php'); 
    }

    $sql=$conexion->query("SELECT * FROM artista WHERE dni='$dni'")or die($conexion->error);

    while($row=$sql->fetch_array()) {
        $dni=$row[0];
        $nombre=$row[1];
        $direccion=$row[2];
        $telefono=$row[3]; 
    }
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Editar Artista</title>
    </head>
    <body>
        <h1>Editar Artista</h1>
        <p>Editar Artista con DNI <?php echo $dni;?> </p>
        <form action="editar_artista.php?editar=si&dni=<?php echo $dni;?>" method="POST">
            <label>Nombre:</label>
            <input type="text" name="nombre" value="<?php echo $nombre;?>">
            <br>
            <label>Dirección:</label>
            <input type="text" name="direccion" value="<?php echo $direccion;?>">
            <br>
            <label>Teléfono:</label>
            <input type="text" name="telefono" value="<?php echo $telefono;?>">
            <input type="submit" name="enviar" value="Editar Artista">
        </form>
    </body>
</html>