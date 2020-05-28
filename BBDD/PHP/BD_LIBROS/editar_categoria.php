<?php   
    include '../conexion.php';
    $id_categoria=$_GET['id_categoria'];
    if(isset($_GET['editar'])) { 
        $categoria=$_POST['categoria'];
        $conexion->query("UPDATE categorias SET categoria='$categoria' WHERE id_categoria=$id_categoria");
        $conexion->close();
        header('Location:categorias.php'); 
    }
    $sql=$conexion->query("SELECT * FROM categorias WHERE id_categoria=$id_categoria")or die($conexion->error);
    while($row=$sql->fetch_array()) {
        $id_categoria=$row[0];
        $categoria=$row[1];
    }
    $conexion->close();
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Editar Categoria</title>
    <body>
        <h1>Editar Categoria</h1>
        <p>Editar Categoria con ID <?php echo $id_categoria;?> </p>
        <form action="editar_categoria.php?editar=si&id_categoria=<?php echo $id_categoria;?>" method="POST">
            <label>Categoría</label>
            <input type="text" name="categoria" value="<?php echo $categoria;?>">
            <br>
            <input type="submit" value="Editar Categoría">
        </form>
    </body>
    </head>
</html>
