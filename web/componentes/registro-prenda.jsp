<!-- tuto mircha https://www.youtube.com/watch?v=9ON-zI5BvYA -->
<html>

<head>
	<meta charset="UTF-8">
	<title>registro</title>
	<meta name="description" content="formulario y validacion">
	<link rel="stylesheet" href="../css/registro-prenda.css"/>
	<script src="js/validaciones.js"></script>
</head>
<body>
	<form id="registro-frm" name"registro-frm" action="" method="get" enctype="application/x-www-form-urlencoded">
		<fieldset>
		<legend> Registro </legend>
		<label for="categoria">Categoria: </label>
		<input type="text" id="categoria" name="categoria_txt"/>
		<br /><br />
		<label for="tipo">Tipo: </label>
		<input type="text" id="tipo" name="tipo_txt"/>
		<br /><br />
		<label for="talla">Talla: </label>
		<input type="text" id="talla" name="talla_txt"/>
		<br /><br />
		<label for="descripcion">Descripcion: </label>
		<br/>
		<textarea name="descripcion_txa" id="descripcion" cols="50" rows="5"></textarea>
		<br /><br />
		<label for="color">Color: </label>
		<input type="text" id="color" name="color_txt"/>
		<br /><br />
		<input type="button" id="enviar" class="cambio" name="enviar_btn" value="Enviar" onclick="validarForm()"/>
		<input type="button" id="limpiar" class="cambio" name="limpiar_btn" value="Limpiar" onclick="limpiarForm()"/>
		</fieldset>
	</form>
</body>
</html>
