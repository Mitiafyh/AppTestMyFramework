<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/saveExtends" method="post">
   <h2>Informations sur l'employe</h2>
    <label for="employe_personne_nom">Nom:</label>
    <input type="text" name="employe_personne_nom" id="employe_personne_nom" placeholder="nom"><br>
    <label for="employe_prenom">Prenom:</label>
    <input type="text" name="employe_personne_prenom" id="employe_personne_prenom" placeholder="prenom"><br>
    <label for="employe_age">Age:</label>
    <input type="number" name="employe_personne_age" id="employe_personne_age" placeholder="age"><br>
    <label for="employe_poste">Poste:</label>
    <input type="number" name="employe_poste" id="employe_poste" placeholder="salaire" step="0.01"><br>
    <button type="submit">Envoyer les informations</button>
</form>
</body>
</html>