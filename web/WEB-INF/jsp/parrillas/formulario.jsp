<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 28/10/2010
  Hora: 11:55:20 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>${titulo}</title>
	</head>
	
	<body>
		<h3>${titulo}</h3>

		<form:form method="post" modelAttribute="parrilla">
			Periodo:
			<form:select path="periodo.id">
				<form:option value="--Seleccione una opción--"/>
				<form:options items="${periodos}" itemLabel="descripcion" itemValue="id"/>
			</form:select>
			<br/>

			Unidad Responsable:
			<form:select path="unidad.id">
				<form:option value="--Seleccione una opción--"/>
				<form:options items="${unidadesResponsables}" itemLabel="nombre" itemValue="id"/>
			</form:select>
			<br/>

			<input type="submit" value="Guardar"/>
		</form:form>

		<p>
			<a href="listado.form">Regresar al listado</a>
		</p>
	</body>
</html>