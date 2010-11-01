<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Listado de periodos</title>
	</head>

	<body>
		<h3>Listado de periodos</h3>

		<p>
			<a href="agregar.form">Agregar periodo</a>
		</p>

		<table>
			<tr>
				<th>Descripción</th>
				<th>Fecha de Inicio</th>
				<th>Fecha final</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${periodos}" var="periodo">
				<tr>
					<td>
						${periodo.descripcion}
					</td>
					<td>
						${periodo.fechaInicio}
					</td>
					<td>
						${periodo.fechaFin}
					</td>
					<td>
						<a href="modificar.form?id=${periodo.id}">Modificar</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
