<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/saveFile" method="post" enctype="multipart/form-data">
   <h2>Informations sur l'employe</h2>
    <label for="employefile_nom">Nom:</label>
    <input type="text" name="employefile_nom" id="employefile_nom" placeholder="nom"><br>
    <label for="employefile_prenom">Prenom:</label>
    <input type="text" name="employefile_prenom" id="employefile_prenom" placeholder="prenom"><br>
    <label for="employefile_file">Fichier:</label>
    <input type="file" name="employefile_file" id="employefile_file"><br>

    <button type="submit">Envoyer les informations</button>
</form>
</body>
</html>