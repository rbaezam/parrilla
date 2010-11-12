<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 11/11/2010
  Hora: 02:57:08 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>${titulo}</title>
	</head>
	
	<body>
		<h3>${titulo}</h3>

		<form:form modelAttribute="objetivo">
			<input type="hidden" name="idParrilla" value="${idParrilla}"/>

			Nombre del objetivo:
			<form:input path="nombre"/>
			<br/>

			<input type="submit" value="Guardar"/>
		</form:form>

		<a href="${request.getContextPath}/parrilla.form">Regresar a la parrilla</a>
	</body>
</html>