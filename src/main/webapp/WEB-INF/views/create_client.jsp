<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Enregistrement</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body>

<div class="container">
    <h2>Enregistrement</h2>
    <form action="/client/save" method="POST">
        <div class="form-group">
            <label for="numero">Numéro:</label>
            <input type="text" class="form-control" id="numero" placeholder="Entrer le numéro (8 chiffres)" name="numero" pattern="\d{8}" required>
        </div>
        <div class="form-group">
            <label for="nom">Nom:</label>
            <input type="text" class="form-control" id="nom" placeholder="Entrer le nom" name="nom" required>
        </div>
        <div class="form-group">
            <label for="prenom">Prénom:</label>
            <input type="text" class="form-control" id="prenom" placeholder="Entrer le prénom" name="prenom" required>
        </div>
        <div class="form-group">
            <label for="adresse">Adresse:</label>
            <input type="text" class="form-control" id="adresse" placeholder="Entrer l'adresse" name="adresse" required>
        </div>
        <div class="form-group">
            <label for="nomConseiller">Nom du Conseiller:</label>
            <input type="text" class="form-control" id="nomConseiller" placeholder="Nom du conseiller" name="nomConseiller" required>
        </div>
        <div class="form-group">
            <label for="agence">Agence:</label>
            <select class="form-control" id="agence" name="agence">
                <c:forEach items="${agences}" var="agence">
                    <option value="${agence.id}">${agence.nom}</option>
                </c:forEach>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Sauvegarder</button>
    </form>
</div>

<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</body>
</html>
