<?php 
    include 'conexion.php';
    $sql=$conexion->query("SELECT * FROM artista");
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Tabla Artistas</title>
    </head>
    <body>
        <h1>Tabla Artistas</h1>
        <table border="1px">
            <tr>
                <td>DNI</td>
                <td>Nombre</td>
                <td>Direccion</td>
                <td>Teléfono</td>
                <td>Eliminar</td>
                <td>Editar</td>
            </tr>


        
            <?php
                while($row=$sql->fetch_array()){
                    $dni=$row[0];
                    $nombre=$row[1];
                    $direccion=$row[2];
                    $telefono=$row[3];
                
            ?>
                <tr>
                    <td><?php echo $dni; ?></td> 
                    <td><?php echo $nombre; ?></td>
                    <td><?php echo $direccion; ?></td>
                    <td><?php echo $telefono; ?></td>
                    <td><a href="eliminar_artista.php?dni=<?php echo $dni;?>">Eliminar</a></td>  
                    <td><a href="editar_artista.php?dni=<?php echo $dni;?>">Editar</a></td>       
                </tr>

            <?php
                }
            ?>
        </table>
        <form action="insertar_artista.php" method="POST">
            <label for="dni">DNI</label>
            <input type="text" id="dni" name="dni" placeholder="Escribe el DNI" required>
            <br>
            <label for="nombre">Nombre</label>
            <input type="text" id="nombre" name="nombre" placeholder="Escribe el Nombre" required>
            <br>
            <label for="direccion">Dirección</label>
            <input type="text" id="direccion" name="direccion" placeholder="Escribe la dirección" required>
            <br>
            <label for="telefono">Teléfono</label>
            <input type="text" id="telefono" name="telefono" placeholder="Escribe el teléfono" required>
            <button type="submit">Enviar</button>
        </form> <?php $conexion->close(); ?>

    </body>




</html>