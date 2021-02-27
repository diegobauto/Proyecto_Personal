<?php
	session_start();

	include("unidad23conexion.php");
	if(isset($_POST['nombre']) and !empty($_POST['nombre']) and
		isset($_POST['user']) and !empty($_POST['user']) and
		isset($_POST['pw']) and !empty($_POST['pw']) and
		isset($_POST['pw2']) and !empty($_POST['pw2']) and
		isset($_POST['email']) and !empty($_POST['email']) and
		$_POST['pw'] == $_POST['pw2']){
			
		$con=mysqli_connect($host,$user,$pw) or die ($_SESSION['validar'] ="Problemas al conectar el servidor");

		mysqli_select_db($con,$db) or die ($_SESSION['validar']= "Problemas al conectar con db");

		mysqli_query($con,"INSERT INTO lector(nombre,user,pw,email) VALUES('$_POST[nombre]','$_POST[user]','$_POST[pw]','$_POST[email]')");
		header("location: ./unidad25ingresosform.php");
		

	}else{
		$_SESSION['validar']= "Verifica que llenaste los campos y la contaseña coincidan";
		header("location: ./unidad23registrosform.php");
	}
?>
