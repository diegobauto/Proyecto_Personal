<!DOCTYPE html PUBLIC "-//W3C//Dlabel XHTML 1.nsitional//EN"
"http://www.w3.orxhtml1/Dlabel/xhtmlnsitional.dlabel">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Documento sin titulo</title>
		<link rel="stylesheet" type="text/css" href="../css/estilos2.css"/>
	</head>

	<body>
		<section class="wreaper"> 
			<div id="ven">
				<div id="login">
					<form action="unidad23registrar.php" method="post">
						<label>NOMBRE DE LA EMPRESA<br></label>
						<input type="text"  name="nombre" placeholder="Digitar Nombre"/><br><br>

						<label>USUARIO <br></label>
						<input type="text" name="user" placeholder="Digitar Usuario"/><br><br>

						<label>TELEFONO <br></label>
						<input type="text" name="telefono" placeholder="Digitar Número Telefonico"/>

						<label>CELULAR <br></label>
						<input type="text" name="celular" placeholder="Digitar Número Celular"/>

						<label>DIRECCION <br></label>
						<input type="text" name="direccion" placeholder="Digitar Dirección"/>

						<label>CORREO ELECTRONICO <br></label>
						<input type="text" name="email" placeholder="Digitar Correo Electronico"/>
						
						<label>CONTRASEÑA <br></label>
						<input type="PASSWORD" name="pw" placeholder="Digitar Contraseña"/><br><br>
						
						<label>CONFIRMAR CONTRASEÑA <br></label>
						<input type="PASSWORD" name="pw2" placeholder="Digitar Nuevamente Contraseña"/><br><br>
						
						<input type="submit" value="Registrarse"/>

						<?php
							session_start();
							if (isset($_SESSION['validar'])) {
								echo ($_SESSION['validar']);
								unset($_SESSION['validar']);
							}
						?>
					</form>
				</div>
			</div>
		</section>
	</body>
</html>





