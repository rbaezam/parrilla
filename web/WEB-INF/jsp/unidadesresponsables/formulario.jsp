<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 25/10/2010
  Hora: 11:44:25 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>${titulo}</title>
	</head>
	
	<body>
		<h3>${titulo}</h3>

		<form:form method="post" modelAttribute="unidad">
			Nombre:
			<form:input path="nombre"/><br/>

			<input type="submit" value="Guardar"/>
		</form:form>

		<p>
			<a href="listado.form">Regresar al listado</a>
		</p>
	</body>
</html>