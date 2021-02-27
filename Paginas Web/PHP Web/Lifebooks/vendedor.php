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
				<div ID="image"><img aling="center" src="fondos/456.png" width="50%" alt="Logotipo"><vr></div>
				<hr/>
				
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
									<a class="nav-link" href="#">Quienes Somos<span class="sr-only">(current)</span></a>
								</li>

								<li class="nav-item dropdown">
									<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Ayuda</a>
									<div class="dropdown-menu" aria-labelledby="navbarDropdown">
										<a class="dropdown-item" href="Manual de Usuario.pdf">Manual de Usuario</a>
										<a class="dropdown-item" href="Manual Tecnico.pdf">Manual Tecnico</a>
									</div>
								</li>

								<li class="nav-item active">
									<a class="nav-link" href="Datos Registro Vendedores/unidad25destruir.php">Cerrar Sesion<span class="sr-only">(current)</span></a>
								</li>
							</ul>
						</div>
					</nav>
				</div>
			</header>

			<section class="wrapper">
				<section class="main">
					<center>
						<form action="Libreria/proceso_guardar.php" method="POST" enctype="multipart/form-data">
							<div class="edit"><p>Editar Libro</p></div>
							<input type="text" REQUIRED name="nombre" placeholder="Titulo" value=""/><br><br>
							<input type="text" REQUIRED name="autor" placeholder="Autor"><br><br>
							<input type="text" REQUIRED name="genero" placeholder="Genero"><br><br>
							<input type="file" REQUIRED name="Imagen"/ ><br><br>
							<textarea REQUIRED name="descripcion" placeholder="Descripcion" maxlength="700" style="background-color:"></textarea><br><br>
							<button type="submit"  value="Aceptar">Aceptar<br>
						</form>
					</center><br>
				</section>
				
				<div style="overflow-x:auto;">
					<center>
						<table id="customers" border="3px;" >
							<thead>
								<tr>
									<th>Nombre</th>
									<th>Imagen</th>
									<th>Autor</th>
									<th>Genero</th>
									<th>Descripcion</th>
									<th colspan="2">Operaciones</th>
								</tr>
							</thead>
							<tbody>
								<?php
									session_start();
									include("Libreria/conexion.php");
									if(isset($_SESSION['id'])){
										$query = "SELECT * FROM libreria where id_vendedor =". $_SESSION['id'];
									}else{
										$query = "SELECT * FROM libreria";
									}
									$resultado = $conexion->query($query);
									while($row = $resultado->fetch_assoc()){
								?>
								<tr>
									<td><?php echo $row['nombre']; ?></td>
									<td width="10"><img height="100" src="data:image/jpg;base64,<?php echo base64_encode($row['Imagen']);?>"/></td>
									<td><?php echo $row['autor']; ?></td>
									<td><?php echo $row['genero']; ?></td>
									<td><?php echo $row['descripcion']; ?><br></td>
									<th><a href="Libreria/modificar.php?id=<?php echo $row['id']; ?>">Modificar</a></th>
									<th><a href="Libreria/eliminar.php?id=<?php echo $row['id']; ?>">Eliminar</a></th>
								<tr>
								<?php
									}
								?>
							</tbody>
						</table><br><br>
					</center>
				</div>
				<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
				<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
				<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
			</section>
		</div>
	</div>
</body>
</html>