<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <link rel="stylesheet" href="">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<br><br><br>
<fieldset>
    <form action="${pageContext.request.contextPath}/jdbc?action=insert" method="post">
        <div style="width: 500px; margin: auto;">
            <div class="form-group">
                <label for="formGroupExampleInput">Code Pays</label>
                <input type="text" class="form-control" id="formGroupExampleInput" name="code">
            </div>
            <div class="form-group">
                <label for="formGroupExampleInput2">Nom Pays</label>
                <input type="text" class="form-control" id="formGroupExampleInput2" name="nom">
            </div>
            <div class="form-group">
                <label for="formGroupExampleInput2">Langue</label>
                <input type="text" class="form-control" id="formGroupExampleInput2" name="lng">
            </div>
            <div class="form-group">
                
                <input type="submit" class="form-control" value="Enregistrer" >
            </div>
    </form>
</fieldset>

</html>