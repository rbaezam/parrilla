<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 25/10/2010
  Hora: 11:40:06 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Listado de unidades responsables</title>
	</head>
	
	<body>
		<h3>Listado de unidades responsables</h3>

		<a href="agregar.form">Agregar unidad responsable</a>

		<table>
			<tr>
				<th>Nombre</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${unidades}" var="unidad">
				<tr>
					<td>${unidad.nombre}</td>
					<td>
						<a href="modificar.form?id=${unidad.id}">Modificar</a>						
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>