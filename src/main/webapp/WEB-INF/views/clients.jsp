<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>

	<head>
		<title>Liste des clients</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
		<style>
			.centered {
				margin: auto;
				width: 50%;
				padding: 10px;
			}
		</style>
	</head>

	<body>
		<div class="centered">
			<h4 style="text-align: center;">Affichage de la liste des clients de l'agence ${agenceId}</h4>
		</div>

		<table class="table">
		    <div class="centered">
		        <h5 style="text-align: center;">Clients ayant un compte courant</h5>
		    </div>
			<thead class="table-light">
				<a href="/client/create" class="btn btn-primary">Nouveau</a>
			</thead>
			<tr class="table-primary">
				<th>Numéro</th>
				<th>Prénom</th>
				<th>Nom</th>
				<th>Adresse</th>
				<th>Nom Conseiller</th>
			</tr>

			<c:forEach items="${clientsCourant}" var="client">
				<tr>
					<td>${client.numero}</td>
					<td>${client.prenom}</td>
					<td>${client.nom}</td>
					<td>${client.adresse}</td>
					<td>${client.nomConseiller}</td>
				</tr>
			</c:forEach>
		</table>

		<!-- Second table  -->
		<table class="table">
        			<table class="table table-dark table-striped-columns">
        			</thead>
        			<div class="centered">
                        <h5 style="text-align: center;">Clients ayant un compte à intérets</h5>
                    </div>
                    <a href="/client/create" class="btn btn-success">Nouveau</a>
        			<tr class="table-primary">
        				<th>Numéro</th>
        				<th>Prénom</th>
        				<th>Nom</th>
        				<th>Adresse</th>
        				<th>Nom Conseiller</th>
        			</tr>

        			<c:forEach items="${clientsInteret}" var="client">
        				<tr>
        					<td>${client.numero}</td>
        					<td>${client.prenom}</td>
        					<td>${client.nom}</td>
        					<td>${client.adresse}</td>
        					<td>${client.nomConseiller}</td>
        				</tr>
        			</c:forEach>
        		</table>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
	</body>
</html>
