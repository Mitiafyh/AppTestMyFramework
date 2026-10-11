<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/save" method="post" >
        <h2>Informations sur l'etudiant</h2>
        <label for="etudiant_nom">Nom:</label>
        <input type="text" name="etudiant_nom" id="etudiant_nom" placeholder="nom"><br>
        <label for="etudiant_prenom">Prenom:</label>
        <input type="text" name="etudiant_prenom" id="etudiant_prenom" placeholder="prenom"><br>
        <label for="etudiant_age">Age:</label>
        <input type="number" name="etudiant_age" id="etudiant_age" placeholder="age"><br>
        <label for="etudiant_moyenne">Moyenne:</label>
        <input type="number" name="etudiant_moyenne" id="etudiant_moyenne" placeholder="moyenne" step="0.01"><br>

    <h2>Informations sur le parent</h2>
        <label for="parent_nom">Nom:</label>
        <input type="text" name="parent_nom" id="parent_nom" placeholder="nom"><br>
        <label for="parent_age">Age:</label>
        <input type="number" name="parent_age" id="parent_age" placeholder="age"><br>

        <input type="submit" value="save">
    </form>
</body>
</html>