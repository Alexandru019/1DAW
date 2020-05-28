<?php 
    include '../conexion.php';
    $sql=$conexion->query("SELECT libros.*,categorias.* FROM libros JOIN categorias ON libros.id_categoria=categorias.id_categoria");
?>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Tabla Libros</title>
        <link rel="stylesheet" type="text/css" href="personalizado.css" />
    </head>
    <body>
        <h1>Tabla Libros</h1>
        <div class=tabla>
            <table border="1px">
                <tr>
                    <td>Id Libro</td>
                    <td>Titulo</td>
                    <td>Autor</td>
                    <td>Id Categoria</td>
                    <td>Precio</td>
                    <td>Eliminar</td>
                    <td>Editar</td>
                </tr>


            
                <?php
                    while($row=$sql->fetch_array()){
                        $id_libro=$row[0];
                        $titulo=$row[1];
                        $autor=$row[2];
                        $id_categoria=$row[3];
                        $precio=$row[4];
                    
                ?>
                    <tr>
                        <td><?php echo $id_libro; ?></td> 
                        <td><?php echo $titulo; ?></td>
                        <td><?php echo $autor; ?></td>
                        <td><?php echo $id_categoria; ?></td>
                        <td><?php echo $precio; ?></td>  
                        <td><a href="eliminar_libro.php?id_libro=<?php echo $id_libro;?>">Eliminar</a></td>  
                        <td><a href="editar_libros.php?id_libro=<?php echo $id_libro;?>">Editar</a></td>       
                    </tr>

                <?php
                    }
                ?>
            </table>
        </div>
        <div class=formulario>
        
            <form action="insertar_libros.php" method="POST">
                <label for="id_libro">Id Libro</label>
                <input type="number" id="id_libro" name="id_libro" placeholder="Escribe la id" required>
                <br>
                <label for="titulo">Título</label>
                <input type="text" id="titulo" name="titulo" placeholder="Escribe el título" required>
                <br>
                <label for="autor">Autor</label>
                <input type="text" id="autor" name="autor" placeholder="Escribe el autor" required>
            
            
                <label for="desplegable">Elige la categoría</label>
                <select id="desplegable" name="categoria" required>
                    <?php 
                    $categorias=$conexion->query("SELECT * FROM categorias");
                    while($row = $categorias->fetch_array()) { ?>
                        <option value="<?php echo $row[0]; ?>"><?php echo $row[1]; ?></option>
                    <?php } ?>
                </select>
                <label for="precio">Precio</label>
                <input type="text" id="precio" name="precio" placeholder="Escribe el precio" required>
                <button type="submit">Enviar</button>
            </form> <?php $conexion->close(); ?>
        </div>
        <br class=limpiar><br><br><br>
        <p>Volver al index, <a href="../index.php">aqui</a></p>
        <p>Ir a la tabla categorias, <a href="categorias.php">aqui</a></p>



        


    </body>




</html>