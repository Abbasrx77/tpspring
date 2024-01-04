<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
    <head>
		<title>Gestion des étudiants</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
		
	</head>
	
	<body>
		
		<h4>Enregistrement d'un étudiant</h4>
       
       <c:url var="save_student_url" value="/etudiant/enregistrer"/>
       
        <form:form action="${save_student_url}" method="post" modelAttribute="student" class="form">
        
        	<div class="form-group">
	            <form:label path="firstname">Firstname: </form:label> 
	            <form:input class="form-control" type="text" path="firstname"/>
            </div>
            
            <div class="form-group">
	            <form:label path="lastname">Lastname: </form:label> 
	            <form:input class="form-control" type="text" path="lastname"/>
            </div>
            
            <div class="form-group">
	            <form:label path="matricule">Matricule: </form:label> 
	            <form:input class="form-control" type="text" path="matricule"/>
            </div>
            
            <div class="form-group">
            <form:label path="age">Age: </form:label> 
            <form:input class="form-control" path="age"/>
            
            <div class="form-group">
             <form:label path="universite">Université: </form:label> 
	            <form:select class="form-control" path="universite">
					<form:option value="">Sélectionner une valeur</form:option>
					<form:options items="${schools}" itemLabel="name"></form:options>
				</form:select>
			</div>
            
            <div class="form-group">
            	<input type="reset" class="btn btn-warning" value="Annuler"/>
            	<input type="submit" class="btn btn-success" value="Enregistrer"/>
            </div>
            
        </form:form>
       
    
    </body>
</html>