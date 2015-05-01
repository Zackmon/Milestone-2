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
                <h1>Welcome to </br> <em>TextBook Management System</em></h1>
            </div>    
            <div class="panel-width">
                
                <c:if test='${not empty message}'>
                    <p class='error_label'>${message}</p>
                    <c:remove var="message" scope="request" />
                </c:if>
            
                <form action="Login" method="post">
                   <!-- <label for="username" >Username: </label>-->
                    <input type="text"  class="form-control"  id="username" name="username" placeholder="Username" required autofocus>
                    <!--<label for="password">Password: </label>-->
                    <input type="password" class="form-control" id="password" name="password"  placeholder="Password" required>
                     <button class="btn  btn-primary" type="submit">Sign in</button>
                </form>
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

