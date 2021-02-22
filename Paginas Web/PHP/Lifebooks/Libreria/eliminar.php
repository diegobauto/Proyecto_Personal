<?php
	include("conexion.php");

	$id= $_REQUEST['id'];

	$query = "DELETE FROM libreria  WHERE id ='$id' ";
	$resultado=$conexion->query($query);

	if($resultado){
		header("Location: ../vendedor.php");
	}
	else {
		echo "NO Eliminado";
	}
?>