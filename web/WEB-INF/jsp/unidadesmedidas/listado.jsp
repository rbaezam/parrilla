<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 24/10/2010
  Hora: 03:59:16 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Listado de Unidades de Medida</title>
	</head>
	
	<body>
		<h3>Listado de unidades de medida</h3>

		<p>
			<a href="agregar.form">Agregar unidad</a>
		</p>

		<table>
			<tr>
				<th>Nombre</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${unidades}" var="unidad">
				<tr>
					<td>
						${unidad.nombre}
					</td>
					<td>
						<a href="modificar.form?id=${unidad.id}">Modificar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>