<!DOCTYPE html>
<html>
<head>
    <title>Page Title</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <form action="" method="POST">
        Cateto Opuesto:  <input type="text" id="base" name="opuesto">
        Cateto Adyacente: <input type="text" id="altura" name="adyacente"><br><br>
        <input type="submit" value="calcular" name="calcular"/>
        <div>
            <p><b>
            <?php 
                $resultado = 0;
                if($resultado != " "){
                    if(isset($_POST['calcular'])){
                        $opuesto = 0;
                        $adyacente = 0;
                        $resultado = 0;
                        $opuesto = (int)$_POST['opuesto'];
                        $adyacente = (int)$_POST['adyacente'];
                        $resultado = sqrt(pow($opuesto,2) + pow($adyacente,2));
                    }
                    echo "Valor Potencia: ".$resultado;
                }
            ?>
            </b></p>
        </div>
    </form>
</body>
</html>