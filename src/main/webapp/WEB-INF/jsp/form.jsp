<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/save" method="post" >
        <label for="nom">Nom:</label>
        <input type="text" name="nom" id="nom" placeholder="nom">
        <label for="prenom">Prenom:</label>
        <input type="text" name="prenom" id="prenom" placeholder="prenom">
        <input type="submit" value="save">
    </form>
</body>
</html>