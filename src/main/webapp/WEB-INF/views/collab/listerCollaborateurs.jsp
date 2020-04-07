<%@page import="dev.sgp.util.Constantes"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.0.0-dist/css/bootstrap.css">
</head>
	<body>
		<h1>Les collaborateurs</h1>
			<ul>
			<%
			List<Collaborateur> collaborateurs = Constantes.COLLAB_SERVICE.listerCollaborateurs();
				for (Collaborateur collab : collaborateurs) {
			%>
				<li><%=collab.getNom() %></li>
				<li><%=collab.getPrenom() %></li>
				<li><%=collab.getAdresse() %></li>
			<%
				}
			%>
		</ul>
		
			<!-- Script -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/js/jquery-3.4.1.slim.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/js/popper.min.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>
	</body>
</html>