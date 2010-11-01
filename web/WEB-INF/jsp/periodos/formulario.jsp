<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 15/10/2010
  Hora: 03:36:26 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>${titulo}</title>
	</head>
	
	<body>
		<h3>${titulo}</h3>

		<form:form method="post" modelAttribute="periodo">
			Descripción:
			<form:input path="descripcion"/><br/>

			Fecha inicial:
			<form:input path="fechaInicio"/><br/>

			Fecha final:
			<form:input path="fechaFin"/><br/>

			<input type="submit" value="Guardar">
		</form:form>

		<p>
			<a href="listado.form">Regresar al listado</a>
		</p>
	</body>
</html>