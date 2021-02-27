<?php
	session_start();
	include("unidad25ingresosconexion.php");
	if(isset($_POST['user']) and !empty($_POST['user']) and isset($_POST['pw']) and !empty($_POST['pw'])){
		$con=mysqli_connect($host,$user,$pw) or die ($_SESSION['validar']="problemas al conectar al servidor"); 
		mysqli_select_db($con,$db) or die ($_SESSION['validar']="Problemas al conectar la bd");
		$sel=mysqli_query($con,"SELECT user, pw, id FROM vendedor WHERE user='$_POST[user]'");
		$sesion =mysqli_fetch_array($sel);

		if($_POST['pw'] == $sesion['pw']){
			if($sesion['id'] != ""){
				$_SESSION['id'] = $sesion['id'];
				$_SESSION['username']=$_POST['user'];
				header("location: ../vendedor.php");
			}
		}else{
			$_SESSION['validar']="Combinacion erronea";
			header("location: ./unidad25ingresosform.php");
		}
	}else{
		$_SESSION['validar']= "Debes llenar los dos campos";
		header("location: ./unidad25ingresosform.php");
	}
?>