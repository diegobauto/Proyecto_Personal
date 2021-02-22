<?php
	/*incluir la conexion*/
	session_start();
	include("conexion.php");

	$nombre = $_POST['nombre'];
	$Imagen = addslashes(file_get_contents($_FILES['Imagen']['tmp_name']));
	$autor = $_POST['autor'];
	$genero = $_POST['genero'];
	$descripcion = $_POST['descripcion'];
	$id_vendedor = $_SESSION['id'];

	$query = "INSERT INTO libreria(nombre,Imagen,autor,genero,descripcion, id_vendedor) VALUES('$nombre',
	'$Imagen','$autor','$genero', '$descripcion', '$id_vendedor')";
	$resultado=$conexion->query($query);

	if($resultado){
		header("Location: ../vendedor.php");
	}
	else {
		echo "No Insertado";
	}


?>