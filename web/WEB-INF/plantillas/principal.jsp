<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 15/10/2010
  Hora: 11:22:37 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<html>
	<head>
		<title>Parrilla O.V.A.R. - <decorator:title/></title>
		<link type="text/css" rel="stylesheet" href="/estilos/estilo.css"/>
		<script type="text/javascript" src="/scripts/jquery-1.4.3.min.js"></script>
	</head>
	
	<body>
		<div id="pagina">
			<div id="encabezado">
				<h1>Parrilla O.V.A.R.</h1>
			</div>

			<div id="centro">
				<div id="menu">
					<%@ include file="/WEB-INF/includes/menu.jsp" %>
				</div>
				<div id="contenido">
					<decorator:body/>
				</div>
			</div>
		</div>
	</body>
</html>