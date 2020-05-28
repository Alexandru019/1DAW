<?php 
    include '../conexion.php';
    $sql=$conexion->query("SELECT * FROM categorias")or die($conexion->error);
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Tabla Categorias</title>
        <link rel="stylesheet" type="text/css" href="personalizado.css" />
    </head>

    <body>
        <h1>Tabla Categorias</h1>
        <div class=tabla>
            <table border="1px">
                <tr>
                    <td>Id Categoria</td>
                    <td>Categoria</td>
                    <td>Eliminar</td>
                    <td>Editar</td>
                </tr>
                <?php   
                    while ($row=$sql->fetch_array()) { 
                        $id_categoria=$row[0];
                        $categoria=$row[1]; 
                ?>
                <tr>
                    <td><?php echo $id_categoria; ?></td>
                    <td><?php echo $categoria;?></td>
                    <td><a href="eliminar_categoria.php?id_categoria=<?php echo $id_categoria;?>">Eliminar</a></td>
                    <td><a href="editar_categoria.php?id_categoria=<?php echo $id_categoria;?>">Editar</a></td>
                </tr> 
                
                <?php
                    } 
                $conexion->close();?>
            </table>
        </div>
        <div class=formulario>
            <form action="insertar_categoria.php" method="POST">
                <label>ID Categoria</label>
                <input type="number" name="id_categoria" required>
                </br>
                <label>Categoria</label>
                <input type="text" name="categoria" required>
                </br>
                <input type="submit" value="Añadir Categoría">
            </form>
        </div>
        <br class=limpiar>
        <p>Volver al index, <a href="../index.php">aqui</a></p>
        <p>Ir a la tabla libros, <a href="libros.php">aqui</a></p>

    </body>




</html>



