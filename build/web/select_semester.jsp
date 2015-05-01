<html lang="en">
    ﻿<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Textbook Management System</title>

    <!--My custom CSS-->
    <link rel="stylesheet" href="style.css"> 
    <!--Bootstrap CSS-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>

<body>
    <jsp:include page="head.jsp" />


    

    <div class="container">

        <div class="body">
            <br>
            <div class="form-group">
      <form action="course" method="get" >
           <label for="sel1">Please select a semester:</label>
           <select class="form-control" id="selected_semester" name="selected_semester">
        <c:forEach var="semester" items="${requestScope.semester}">
          <option value=${semester.semesterid}> ${semester.term} ${semester.year} </option>
        </c:forEach>
      </select>

      <br>
      <br>
      <input class="btn btn-primary" type="submit"value="Submit">
      </form>
      </div>
            
        </div>
    </div>

    <footer class="footer">
        <div>All Rights Reserved</div>
    </footer>


    <script src="https://code.jquery.com/jquery-2.1.3.js"></script>
    
    <!--A script to delete tasks from task list-->
    <script type="text/javascript" src="script.js"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>



</body>
</html>

