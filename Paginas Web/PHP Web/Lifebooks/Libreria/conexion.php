<?php
	$host = 'localhost';
	$user = 'root';
	$password = '';
	$db = 'biblioteca';

	$conexion = new mysqli($host,$user,$password,$db);

	if ($conexion){
		/*Quiere decir que si conecto*/
		echo "Conexion buena";
	}else{
		echo "Conexion mala";
	}
?>