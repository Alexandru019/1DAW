<?php

    include '../conexion.php';


    $id_libro=$_GET['id_libro'];

    if(isset($_GET['editar'])) { 
        $titulo=$_POST['titulo'];
        $autor=$_POST['autor'];
        $categoria=$_POST['categoria'];
        $precio=$_POST['precio'];
        $conexion->query("UPDATE libros SET titulo='$titulo', autor='$autor', id_categoria='$categoria', precio='$precio' WHERE id_libro=$id_libro");
        $conexion->close();
        header('Location:libros.php'); 
    }

    $sql=$conexion->query("SELECT * FROM libros JOIN categorias ON libros.id_categoria=categorias.id_categoria WHERE id_libro=$id_libro")or die($conexion->error);

    while($row=$sql->fetch_array()) {
        $id_libro=$row[0];
        $titulo=$row[1];
        $autor=$row[2];
        $nombre_categoria=$row[6]; 
        $precio=$row[4];
    }
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Editar Libro</title>
    </head>
    <body>
        <h1>Editar Libro</h1>
        <p>Editar Libro con ID <?php echo $id_libro;?> </p>
        <form action="editar_libro.php?editar=si&id_libro=<?php echo $id_libro;?>" method="POST">
            <label>Titulo:</label>
            <input type="text" name="titulo" value="<?php echo $titulo;?>">
            <br>
            <label>Autor:</label>
            <input type="text" name="autor" value="<?php echo $autor;?>">
            <br>
            <label>Categoria:</label>
                <select name="categoria">
                    <?php
                    $tabla_categorias = $conexion->query("SELECT * FROM categorias");
                    while($row=$tabla_categorias->fetch_array()) {

                        $id_categoria=$row[0];
                        $categoria=$row[1];

                        if ($categoria == $nombre_categoria) { ?>
                            <option value="<?php echo $id_categoria;?>" selected><?php echo $categoria;?></option>
                        <?php
                        }else{ ?>
                            <option value="<php echo $id_categoria;?>"><?php echo $categoria;?></option>
                            <?php
                        }
                    } 
                    ?>
                </select>
                <br>
                <label>Precio:</label><input type="text" name="precio" value="<?php echo $precio;?>"><br>
                <input type="submit" name="enviar" value="Editar libro">
        </form>
    </body>
</html>