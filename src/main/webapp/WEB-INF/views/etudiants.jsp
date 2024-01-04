<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>

	<head>
		<title>Liste des étudiants</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
		
	</head>
	
	<body>
		
		<h4>Affichage de la liste des étudiants</h4>
		
		<table class="table table-striped">
			<tr>
				<th colspan="4"><a href="/etudiant/nouveau">Nouveau</a></th>
				
			</tr>
			<tr class="table-primary">
				<th>Prénom</th>
				<th>Nom</th>
				<th>Age</th>
				<th>Université</th>
				<th>Manager</th>
			</tr>
			
			<c:forEach items="${students}" var="student">
			
				<tr>
					<th>${student.firstname}</th>
					<th>${student.lastname}</th>
					<th>${student.age}</th>
					<th>${student.universite.name}</th>
					<th>${student.universite.manager}</th>
				</tr>
				
             </c:forEach>    
		
		</table>
		
		
	</body>
</html>