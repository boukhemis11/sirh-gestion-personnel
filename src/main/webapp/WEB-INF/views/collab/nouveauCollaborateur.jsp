<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.0.0-dist/css/bootstrap.css">
</head>
<body>
	<h1 class="m-2">Nouveau Collaborateurs</h1>
	<form method="post" action="cree">
	  <div class="form-row">
	    <div class="col-md-6 m-3">
	      <label for="validationDefault01">Nom</label>
	      <input type="text" class="form-control" id="nom" name="nom" value="" required>
	    </div>
	    <div class="col-md-6 m-3">
	      <label for="validationDefault02">Prenom</label>
	      <input type="text" class="form-control" id="prenom" name="prenom"  value="" required>
	    </div>
	    <div class="col-md-6 m-3">
	      <label for="validationDefault02">Date de naissance</label>
	      <input type="text" class="form-control" id="date_de_naissance" name="date_de_naissance"  value="" required>
	    </div>
	    <div class="col-md-6 m-3">
	      <label for="validationDefault02">Adresse</label>
	      <textarea type="text" class="form-control" id="adresse" name="adresse"  value="" required ></textarea>
	    </div>
	    <div class="col-md-6 m-3">
	      <label for="validationDefault02">Numéro de sécurité sociale</label>
	      <input type="text" class="form-control" id="nss" name="nss" value="" required>
	    </div>
	  </div>

	  <button class="btn btn-primary m-3" type="submit">Ajouter</button>
	</form>
</body>
</html>