<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 27/10/2010
  Hora: 05:23:54 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Parrillas</title>
	</head>
	
	<body>
		<script type="text/javascript" language="JavaScript">
			function eliminar() {
				var res = confirm("¿Seguro que desea eliminar el registro seleccionado?");
				if(res == true) {
					alert("Eliminando registro");
				}
			}
		</script>

		<h3>Parrillas</h3>

		<p>
			<a href="agregar.form">
				Agregar parrilla
			</a>
		</p>

		<table>
			<tr>
				<th>Periodo</th>
				<th>Unidad Responsable</th>
				<th>Responsable</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${parrillas}" var="parrilla">
				<tr>
					<td>
						${parrilla.periodo.descripcion}
					</td>
					<td>
						${parrilla.unidad.nombre}
					</td>
					<td>
						${parrilla.responsable.nombre}
					</td>
					<td>
						<a href="modificar.form?id=${parrilla.id}">Modificar</a>
						<a href="eliminar.form?id=${parrilla.id}" 
						   onclick="return confirm('¿Seguro que desea eliminar el registro seleccionado?')">Eliminar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>