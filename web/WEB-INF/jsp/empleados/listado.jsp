<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 25/10/2010
  Hora: 10:51:38 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Listado de empleados</title>
	</head>
	
	<body>
		<h3>Listado de empleados</h3>

		<p>
			<a href="agregar.form">Agregar empleado</a>
		</p>

		<table>
			<tr>
				<th>Nombre</th>
				<th>Puesto</th>
				<th>Unidad Responsable</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${empleados}" var="empleado">
				<tr>
					<td>${empleado.nombre}</td>
					<td>${empleado.puesto}</td>
					<td>${empleado.unidad.nombre}</td>
					<td>
						<a href="modificar.form?id=${empleado.id}">Modificar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>