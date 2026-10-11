<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/saveList" method="post">
    <h2>Etudiant 1</h2>
    <label>Nom :</label>
    <input type="text" name="etudiants[0].nom"><br>
    <label>Prenom :</label>
    <input type="text" name="etudiants[0].prenom"><br>
    <label>Age :</label>
    <input type="number" name="etudiants[0].age"><br>
    <label>Moyenne :</label>
    <input type="number" name="etudiants[0].moyenne" step="0.01"><br>

    <h2>Etudiant 2</h2>
    <label>Nom :</label>
    <input type="text" name="etudiants[1].nom"><br>
    <label>Prenom :</label>
    <input type="text" name="etudiants[1].prenom"><br>
    <label>Age :</label>
    <input type="number" name="etudiants[1].age"><br>
    <label>Moyenne :</label>
    <input type="number" name="etudiants[1].moyenne" step="0.01"><br>

    <button type="submit">Envoyer la liste</button>
</form>
</body>
</html>