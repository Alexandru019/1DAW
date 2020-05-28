<?php
    include '../conexion.php';
    $sql=$conexion->query("SELECT * FROM categorias")or die($conexion->error);

    if(isset($_GET['id_categoria'])){
        $id_categoria=$_GET['id_categoria'];
        $sql_libros=$conexion->query("SELECT * FROM libros WHERE id_categoria=$id_categoria")or die($conexion->error);
    }else{
        $sql_libros=$conexion->query("SELECT * FROM libros")or die($conexion->error);

    }

?>
<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
        <h1>Página De La Base de Datos</h1>
        <p>Tabla de Libros, <a href="libros.php">aquí</a>
        <p>Tabla de Categorías, <a href="categorias.php">aquí</a>
        <br><br>
        <ul>
            <?php
                while ($row=$sql->fetch_array()) { 
                    $id_categoria=$row[0];
                    $categoria=$row[1];
            ?>
                <li><a href="indice.php?id_categoria=<?php echo $id_categoria;?>"><?php echo $categoria;?></a></li>
            <?php
                }            
            ?>
            <li><a href="indice.php">Todas las Categorías</a></li>
        
        
        </ul>

        <table border="1px">
                <tr>
                    <td>Título</td>
                    <td>Autor</td>
                </tr>    
  
        <?php
                while ($row=$sql_libros->fetch_array()) { 
                    $titulo=$row['titulo'];
                    $autor=$row['autor'];
            ?>
                <tr>
                    <td><?php echo $titulo;?></td>
                    <td><?php echo $autor;?></td>
                </tr>
            <?php
                }            
            ?>
      </table>
    </body>




</html>
