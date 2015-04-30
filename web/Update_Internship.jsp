<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
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
   
    <jsp:include page="header.jsp" />

    

    <div class="container">
        <div class="body">
            <div class="page-header">
                <h3>Add/Replace TextBook :</h3>
            </div>       
               

            
                
                <form action="add" method="post">
                    <div class="panel panel-width">
                    <div class="panel-title">Book Details Details :</div>
                    
                    <div class="panel-body">
                    <div class="form-group">
                        <label for="Book ISBN"> ISBN </label>
                        <input type="text" class="form-control" id="Book ISBN" name="Book ISBN" value="${book.isbn}"> 
                        <label for="Book Title"> Title </label>
                        <input type="text" class="form-control" id="Book Title" name="Book Title" value="${book.title}">
                        <label for="Book Authors"> Authors (please separate  the authors with a ,) </label>
                        <input type="email" class="form-control" id="Book Authors" name="Book Authors" value="${book.authors}">
                        <label for="Book Date"> Publishing Date </label>
                        <input type="number" class="form-control" id="Book Date" name="Book Date" value="${book.date}">
                        <label for="Book Publisher"> Publisher </label>
                        <input type="number" class="form-control" id="Book Publisher" name="Book Publisher" value="${book.publisher}">
                        <label for="Book Price"> Price </label>
                        <input type="number" class="form-control" id="Book Price" name="Book Price" value="${book.price}">
                        <label for="Book Image"> Image link </label>
                        <input type="number" class="form-control" id="Book Image" name="Book Image" value="${book.image}">
                    </div>    
                    </div>
                    </div>
                     
                    <input type="submit" class="btn btn-primary" name="submit" id="submit">
                    
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

