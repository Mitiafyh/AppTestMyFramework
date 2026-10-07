<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- <h1>Page de test</h1>
    <p>Message : <%= request.getAttribute("message") %></p>
    <p>Status : <%= request.getAttribute("status") %></p> -->

    <p>Nom : <%= request.getAttribute("etudiant.nom") %></p>
    <p>Prenom : <%= request.getAttribute("etudiant.prenom") %></p>
    <p>Age : <%= request.getAttribute("etudiant.age") %></p>
    <p>Moyenne : <%= request.getAttribute("etudiant.moyenne") %></p>


</body>
</html>