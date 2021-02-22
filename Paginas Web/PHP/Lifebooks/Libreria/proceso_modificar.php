<?php
	/*incluir la conexion*/
	include("conexion.php");

	$id= $_REQUEST['id'];

	$nombre = $_POST['nombre'];
	$Imagen = addslashes(file_get_contents($_FILES['Imagen']['tmp_name']));
	$autor = $_POST['autor'];
	$genero = $_POST['genero'];
	$descripcion = $_POST['descripcion'];

	$query = "UPDATE libreria SET nombre='$nombre', Imagen='$Imagen', autor='$autor', genero='$genero', descripcion='$descripcion'WHERE id ='$id' ";
	$resultado=$conexion->query($query);

	if($resultado){
		header("Location: ../vendedor.php");
	}
	else {
		echo "NO MODIFICADO";
	}


?>