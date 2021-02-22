<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<link rel="stylesheet" type="text/css" href="css/estiloslibreria.css"/>
	</head>

	<body>
		<center>
			<div class="mod"><br><br>
				<?php
					$conexion=mysqli_connect("localhost","root","");
					mysqli_select_db($conexion,"biblioteca");
					$q="SELECT * FROM vendedor " ;
					$r=mysqli_query($conexion, $q);

					while ($f=mysqli_fetch_array($r)) {
						echo  "<h1>Empresa: ".$f['nombre']."<br></h1>";
						print "<h3>Direccion: ".$f['direccion']."<br></h3>";
						print "<h3>Celular: ".$f['celular']."<br><br><br><br><br>";
					}
				?>
				</br>
			</div>
		</center>
	</body>
</html>