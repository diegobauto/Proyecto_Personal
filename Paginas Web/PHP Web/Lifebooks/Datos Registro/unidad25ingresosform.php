<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<title>Documento sin titulo</title>
		<link rel="stylesheet" type="text/css" href="../css/estilos2.css"/>
	</head>

	<body> 
		<div class="otro">
			<div id="login">
				<form action="unidad25ingresos.php" method="post">
					<label>USUARIO <BR></label><input type="text" name="user" placeholder="Digitar Usuario"/><br/><br/>
					<label>CONTRASEÑA </label><input type="password" name="pw" placeholder="Digitar Contraseña"/><br/><br/>
					<input type="submit" value="Ingresar"/>
				</form>

				<?php
					session_start();
					if (isset($_SESSION['validar'])) {
						echo ($_SESSION['validar']);
						unset($_SESSION['validar']);
					}
				?>
			</div>
		</div>
	</body>
</html>

