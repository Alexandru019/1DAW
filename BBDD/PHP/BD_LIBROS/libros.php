<?php 
    include '../conexion.php';
    $sql=$conexion->query("SELECT * FROM libros")or die($conexion->error);
?>

<!DOCTYPE html>
<html>
    <head>
        <title>Tabla Libros</title>
    </head>
    <body>
        <table border="1px">
            <tr>
                <td>Id Libro</td>
                <td>Titulo</td>
                <td>Autor</td>
                <td>Id Categoria</td>
                <td>Precio</td>
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
                </tr>

            <?php
                }
            ?>
        </table>



        


    </body>




</html>