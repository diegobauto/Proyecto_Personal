<!DOCTYPE html>
<html>
<head>
    <title>Page Title</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <form action="" method="POST">
        Numero:  <input type="text" id="" name="numero"><br><br>
        Numero de potencia:  <input type="text" id="" name="numero_p"><br><br>
        <input type="submit" value="calcular" name="calcular"/>
        <div>
            <p><b>
            <?php 
                $resultado = 0;
                if($resultado != " "){
                    if(isset($_POST['calcular'])){
                        $resultado = pow((int)$_POST['numero'],(int)$_POST['numero_p']);
                    }
                    echo "Valor Potencia: ".$resultado;
                }
            ?>
            </b></p>
        </div>
    </form>
</body>
</html>