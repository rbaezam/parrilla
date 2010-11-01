<%--
  Usuario: Rodolfo E. Baeza Madrid.
  Fecha: 20/10/2010
  Hora: 10:43:54 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h4>Catálogos</h4>
<ul>
	<li>
		<a href="<%= request.getContextPath() %>/catalogos/empleados/listado.form">
			Empleados
		</a>
	</li>
	<li>
		<a href="<%= request.getContextPath() %>/catalogos/unidadesresponsables/listado.form">
			Unidades responsables
		</a>
	</li>
	<li>
		<a href="<%= request.getContextPath() %>/catalogos/unidadesmedidas/listado.form">
			Unidades de medida
		</a>
	</li>
	<li>
		<a href="<%= request.getContextPath() %>/catalogos/periodos/listado.form">
			Periodos
		</a>
	</li>
</ul>

<h4>Parrillas</h4>
<ul>
	<li>
		<a href="<%= request.getContextPath() %>/parrillas/listado.form">
			Parrillas de URs
		</a>
	</li>
	<li>Tablero de seguimiento</li>
	<li>Observaciones</li>
	<li>Gráficas de avances</li>
</ul>

<h4>Opciones de UR</h4>
<ul>
	<li>
		<a href="<%= request.getContextPath() %>/parrilla.form">
			Parrillas de URs
		</a>
	</li>
</ul>