<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>
        <h1>Test de formulario</h1>
            <form action="confirmacion.php" method="POST">
                <p>Nombre: <input type="text" name="nombre" size="25%" placeholder="Nombre"></p>
                <p>Apellidos: <input type="text" name="apellidos" size="25%" placeholder="Apellidos"></p>
                <p>Contraseña: <input type="password" name="password" size="25%" placeholder="******"></p>
                <p>Radio de ejemplo:</p>
                <p>
                    <input type="radio" name="ejemploradio" value="opcion1"> Opción1
                    <input type="radio" name="ejemploradio" value="opcion2"> Opción2
                </p>
                <p>Desplegable de ejemplo:
                    <select name="encontrar">
                        <option value="desplegable1" selected="">Opcion1</option>
                        <option value="desplegable2">Opcion2</option>
                        <option value="desplegable3">Opcion3</option>
                        <option value="desplegable4">Opcion4</option>
                    </select>
                </p>
                <p>Textarea de ejemplo:</p>
                <p>
                    <textarea name="mensaje" cols="50" rows="10"></textarea>
                </p>
                <p align="center">
                    <input type="submit" name="enviar" value="Enviar">
                </p>
            </form>


    </body>




</html>