<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Validar formulario - Listasrroja</title>
</head>
<body>
	<form action="#" method="POST">
		<?php
			$option = "";
			
			if(isset($_POST['option'])){
				$option = $_POST['option'];
			}else{
				$option = "";
			}

			$campos = array();

			if($option == ""){
				array_push($campos, "Selecciona un option de desarrollo.");
			}

			if(count($campos) > 0){
				echo "<div class='error'>";
				for($i = 0; $i < count($campos); $i++){
					echo "<li>".$campos[$i]."</i>";
				}
			}else{
				echo "<div class='correcto'>
						Datos correctos";
			}
			echo "</div>";
		?>
		<p>
			option de desarrollo <br>	
			<input type="radio" name="option" value="DBO" <?php if($option == "DBO") ; ?>> DBO
			<input type="radio" name="option" value="DQO" <?php if($option == "DQO") ; ?>> DQO
			<input type="radio" name="option" value="SST" <?php if($option == "SST") ; ?>> SST
		</p>
		<p><input type="submit" value="enviar datos"></p>

		<?php
            if ($option == "DQO") {
				echo "jajajaj";
			}
        ?>
	</form>
</body>
</html>