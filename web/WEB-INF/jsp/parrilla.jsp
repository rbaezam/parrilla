<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 29/10/2010
  Hora: 08:40:19 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Parrilla OVAR</title>
		<script type="text/javascript" language="JavaScript">
			$(function() {

				$("#dlgAgregarObjetivo").dialog({
					modal: true,
					autoOpen:false
				});

				$("#fObjetivo").submit(function() {
					var nombreObjetivo = $("#nombreObjetivo").val();
					var idParrilla = $("#hidIdParrilla").val();

					var url = "<%= request.getContextPath() %>" + "/parrilla/agregarObjetivo.form";

					$.getJSON(url, {nombreObjetivo: nombreObjetivo, idParrilla: idParrilla}, function(data) {
						var cadena = '<li>' + data.datos.nombre + '</li>';
						$("#listaObjetivos").append(cadena)
					});

					/*
					$.getJSON('/parrilla/agregarObjetivo.form', function(data) {
						alert(data.datos);
					});
					*/
					return false;
				});
			});

			function agregarObjetivo() {
				$("#dlgAgregarObjetivo").dialog("open");
			}
		</script>
	</head>

	<body>

		<h3>Parrilla OVAR</h3>

		<form method="get">
			Seleccione la parrilla:
			<select name="idParrilla">
				<c:forEach items="${parrillas}" var="parrilla">
					<option value="${parrilla.id}">${parrilla.descripcion}</option>
				</c:forEach>
			</select>
			<br/>

			<input type="submit" value="Seleccionar"/>
		</form>

		<p>${parrilla.unidad.nombre}</p>
		<p>${parrilla.responsable.nombre}</p>

		<h4>Objetivos</h4>

		<div id="dlgAgregarObjetivo" title="Agregar objetivo">
			<form id="fObjetivo">
				<input type="hidden" id="hidIdParrilla" value="${parrilla.id}">
				Escriba el nombre del objetivo:
				<input type="text" name="nombreObjetivo" id="nombreObjetivo"/>
				<br/>

				<input type="submit" value="Guardar"/>
			</form>
		</div>
		<ul id="listaObjetivos">
			<c:forEach items="${parrilla.objetivos}" var="objetivo">
				<li>${objetivo.nombre}</li>
			</c:forEach>
		</ul>
	</body>
</html>