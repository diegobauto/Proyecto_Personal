<!DOCTYPE html>
<html>
<head>
    <title>Page Title</title>
    <link rel="stylesheet" href="estilos.css">
</head>
<body>
    <form action="" method="POST">
        P inicial:  <input type="text" id="" name="p_inicial" placeholder="0"><br><br>
        P: <input type="text" id="atura" name="p" placeholder="0"><br><br>
        Tiempo inicial: <input type="text" id="atura" name="tiempo" placeholder="0"><br><br>
        Tiempo final: <input type="text" id="atura" name="tiempo_final" placeholder="0"><br><br>
        <input type="submit" value="calcular" name="calcular"/>
        <div>
            <p><b>
            <?php 
                $resultado = 0;
                if($resultado != " "){
                    if(isset($_POST['calcular'])){
                        $p_inicial = 0;
                        $resultado = 0;
                        $k = 0;
                        $tiempo = 0;
                        $tiempo_final = 0;

                        $p_inicial = (int)$_POST['p_inicial'];
                        $p = (int)$_POST['p'];
                        $tiempo = (int)$_POST['tiempo'];
                        $tiempo_final = (int)$_POST['tiempo_final'];


                        $k = (log($p/$p_inicial))/$tiempo;
                        $resultado = $p_inicial*pow(M_E, ($k*$tiempo_final));
                    }
                    print "Valor Bacterias: ".$resultado;
                }
            ?>
            </b></p>
        </div>
    </form>
</body>
</html>