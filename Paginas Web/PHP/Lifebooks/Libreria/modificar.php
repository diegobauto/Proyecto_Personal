<!DOCTYPE html>
<html>
<head>
	<title>Index de la libreria</title>
	<link rel="stylesheet" type="text/css" href="../css/estiloslibreria.css"/>
</head>
<body>
	<?php

		include("conexion.php");
		$id = $_REQUEST['id'];
		$query ="SELECT * FROM libreria WHERE id='$id'";
		$resultado = $conexion->query($query);
		$row = $resultado->fetch_assoc();
	?>
	<center>
			<div class="mod"><BR><BR>
				<h2>MODIFICAR LIBRO<H2>
		<form action="proceso_modificar.php?id=<?php echo $row['id']; ?>" method="POST" enctype="multipart/form-data">
		<input type="text" REQUIRED name="nombre" placeholder="Titulo" value="<?php echo $row['nombre']; ?>"/><br><br>
		<img width="200" src="data:image/jpg;base64,<?php echo base64_encode($row['Imagen']); ?>"/><br>
		<input type="file" REQUIRED name="Imagen"/><br><br>
		<input type="text" REQUIRED name="autor" placeholder="Autor" value="<?php echo $row['autor']; ?>"/><br><br>
		<input type="text" REQUIRED name="genero" placeholder="Genero" value="<?php echo $row['genero']; ?>"/><br><br>
		<textarea REQUIRED name="descripcion" placeholder="Descripcion" maxlength="700" value="<?php echo $row['descripcion']; ?>"/></textarea><br><br>
		<input type="submit" value="Aceptar"><br><br>
		</form>
			</div><br>
	</center>

</body>
</html>                 