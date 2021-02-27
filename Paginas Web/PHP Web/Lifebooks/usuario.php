<html>
	<head>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<title>LIFEBOOKS</title>
		<link rel="stylesheet" type="text/css" href="css/estilosindex.css"/><!--archivo css-->
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, maximum-scale=1.0">
	</head>

	<body>
		<div class="hola">
			<div class="contenedor">
				<header>
					<img aling="center" src="fondos/456.png" width="50%" alt="Logotipo"><vr>
					<br><hr/>

					<div id="header">
						<nav class="navbar navbar-expand-lg navbar-light bg-light">
							<a class="navbar-brand" href="#">LIFEBOOKS</a>
							<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
								<span class="navbar-toggler-icon"></span>
							</button>

							<div class="collapse navbar-collapse" id="navbarSupportedContent">
								<ul class="navbar-nav mr-auto">

									<li class="nav-item active">
										<a class="nav-link" href="Documento.pdf">Documento<span class="sr-only">(current)</span></a>
									</li>

									<li class="nav-item active">
										<a class="nav-link" href="datosempresa.php">Datos Empresas<span class="sr-only">(current)</span></a>
									</li>

									<li class="nav-item dropdown">
										<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Ayuda</a>
										<div class="dropdown-menu" aria-labelledby="navbarDropdown">
											<a class="dropdown-item" href="Manual de Usuario.pdf">Manual de Usuario</a>
											<a class="dropdown-item" href="Manual Tecnico.pdf">Manual Tecnico</a>
										</div>
									</li>

									<li class="nav-item active">
										<a class="nav-link" href="Datos Registro/unidad25destruir.php">Cerrar Sesion<span class="sr-only">(current)</span></a>
									</li>
								</ul>
							</div>
						</nav>
					</div>
				</header>

				<!--*****************************************************************************************************-->
				<section class="wrapper">
					<div style="overflow-x:auto;">
						<center>
							<table id="customers" border="2px;">
								<thead>
								</thead>
								<tbody>
									<?php
										include("Libreria/conexion.php");
										$query = @"SELECT l.*, v.nombre as nom_vendedor FROM libreria l inner join vendedor v on l.id_vendedor = v.id"; /*Seleccionar archivos de la bd*/
										$resultado = $conexion->query($query);

										while($row = $resultado->fetch_assoc()){
									?>
									<tr>
										<td colspan= 5><h4>Empresa: <a href="datosempresa.php"><?php echo $row['nom_vendedor']; ?></a></h4></td>
									</tr>
									<tr>
										<th>Nombre</th>
										<th>Imagen</th>
										<th>Autor</th>
										<th>Genero</th>
										<th>Descripcion</th>
									</tr>
									<tr>
										<td width="100"><?php echo $row['nombre']; ?></td>
										<td width="150"><img height="250" src="data:image/jpg;base64,<?php echo base64_encode($row['Imagen']);?>"/></td>
										<td width="100"><?php echo $row['autor']; ?></td>
										<td width="100"><?php echo $row['genero']; ?></td>
										<td><?php echo $row['descripcion']; ?></td>
									</tr>
									<?php
										}
									?>
								</tbody>
							</table><br>
						</center><br>
						<iframe src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d75667.96688998309!2d-74.13979927000071!3d4.628383121493357!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1slibreria!5e0!3m2!1ses-419!2sco!4v1537027458154" width="100%" height="30%" frameborder="0" style="border:0" allowfullscreen></iframe>
					</div>

					<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
					<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
					<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
				</section>


				<aside><!--Contenido secundario, como noticias, anuncios,etc-->
					<center>
						<br><P>ESTAREMOS ACTUALIZANDO LA SECCION DE NOTICIAS Y OTROS</P>
					</center>
				</aside>

				<footer>
					<center>
						<p>--------Programacion de Software--------</p>
					</center>
				</footer>
				
			</div>
		</div>
	</body>
</html>