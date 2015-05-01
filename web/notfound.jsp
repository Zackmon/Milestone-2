<html lang="en">
    ﻿<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="G1">

    <title>TextBook Management System</title>

    <!--My custom CSS-->
    <link rel="stylesheet" href="css/style.css"> 
    <!--Bootstrap CSS-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>

<body>
        <jsp:include page="head.jsp" />


    <div class="container">
        <div class="body">
            <div class="page-header">
                <h1></h1>
            </div>    
            <div class="panel-width">
                
                <span>Couldn't find a book with the specified ISBN </span> </br>
                
             <!--  <button class="btn  btn-primary" type="submit">Add TextBook Through Amazon</button> --></br> </br> 
                <a href="addManual"><button class="btn  btn-primary" type="submit">Add TextBook Manually </button> </a></br> </br>
                <a href="semester"> <button class="btn  btn-primary" type="submit">Return To Main Page</button>  </a>
            </div> 
    </div>
</div>


<footer class="footer">
    <div>All Rights Reserved</div>
</footer>


<script src="https://code.jquery.com/jquery-2.1.3.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>



</body>
</html>

