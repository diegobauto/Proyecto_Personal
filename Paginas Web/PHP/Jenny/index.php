<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>ASIGNATURAS</title>
	<link rel="stylesheet" href="estilos.css">
</head>
<body>
	<form action="#" method="POST">
		<?php
			$asignaturas = array();
            $campos = array();
            if(isset($_POST['asignaturas'])){
                $asignaturas = $_POST['asignaturas'];
            }else{
                $asignaturas = [];
            }
            
            if($asignaturas == "" || count($asignaturas) < 2){
                array_push($campos, "Selecciona al menos dos asignaturas");
            }

            if(count($campos) > 0){
                echo "<div class='error'>";
                for($i = 0; $i < count($campos); $i++){
                    echo $campos[$i];
                }
            }else{
                echo "<div class='correcto'> Procesando info ...";
            }
            echo "</div>";
		?>
		<p>
			Asignaturas:<br><br>	
			<input type="checkbox" name="asignaturas[]" value="Matematicas" <?php if(in_array("php", $asignaturas)) echo "checked"; ?>> Matematicas<br>
			<input type="checkbox" name="asignaturas[]" value="Biología" <?php if(in_array("js", $asignaturas)) echo "checked"; ?>> Biología<br>
			<input type="checkbox" name="asignaturas[]" value="Quimica" <?php if(in_array("java", $asignaturas)) echo "checked"; ?>> Quimica<br>
			<input type="checkbox" name="asignaturas[]" value="Calculo" <?php if(in_array("swift", $asignaturas)) echo "checked"; ?>> Calculo<br>
			<input type="checkbox" name="asignaturas[]" value="Fisica" <?php if(in_array("py", $asignaturas)) echo "checked"; ?>> Fisica<br>
		</p>
        <p><input type="submit" value="Validar"></p> 
        
        <?php
            for($i = 0; $i < count($asignaturas); $i++){
                if ($asignaturas[$i] == "Matematicas" && count($asignaturas)>=2){
                    ?>
                    <br>
                    <ul>
                        <p>Botones de navegación: </p>
                        <li><a href="Hipotenusa.php">Calcular Hipotenusa</a></li>
                        <li><a href="Potencia.php">Calcular Potencia</a></li>
                        <li><a href="Raiz Cuadrada.php">Raiz Cuadrada</a></li>
                        
                    </ul>
                    <?php
                }
                if ($asignaturas[$i] == "Biología" && count($asignaturas)>=2){
                    ?>
                    <ul>
                        <li><a href="Bacterias.php">Crecimiento exponencial <br> de bacterias</a></li>
                    </ul>
                    <?php
                }
            }
        ?>
	</form>
</body>
</html>
