<?php
	session_start();
	include("unidad23conexion.php");
	if(isset($_POST['nombre']) and !empty($_POST['nombre']) and
		isset($_POST['user']) and !empty($_POST['user']) and
		isset($_POST['telefono']) and !empty($_POST['telefono']) and
		isset($_POST['celular']) and !empty($_POST['celular']) and
		isset($_POST['direccion']) and !empty($_POST['direccion']) and
		isset($_POST['email']) and !empty($_POST['email']) and
		isset($_POST['pw']) and !empty($_POST['pw']) and
		isset($_POST['pw2']) and !empty($_POST['pw2']) and
		$_POST['pw'] == $_POST['pw2']){

		$con=mysqli_connect($host,$user,$pw) or die ($_SESSION['validar'] ="Problemas al conectar el servidor");
		mysqli_select_db($con,$db) or die ($_SESSION['validar']= "Problemas al conectar con db");
		mysqli_query($con,"INSERT INTO vendedor(nombre,user,telefono,celular,direccion,email,pw) VALUES('$_POST[nombre]','$_POST[user]', '$_POST[telefono]','$_POST[celular]','$_POST[direccion]','$_POST[email]','$_POST[pw]')");
		$_SESSION['user'] = $_POST['user'];
		header("location: ./unidad25ingresosform.php");
	}else{
		$_SESSION['validar']= "Verifica que llenaste los campos y la contraseña coincidan";
		header("location: ./unidad23registrosform.php");
	}
?>
