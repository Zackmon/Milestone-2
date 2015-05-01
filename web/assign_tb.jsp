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
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"><em>Textbook Management System</em></a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                
            </div>
        </div>
    </nav>

    

    <div class="container">

        <div class="body">
            
            <br>
            
            <div class="form-group">
           <form action="find" method="post">
           <label for="isbn">Please Enter the ISBN:</label>
           <input type="text" id="isbn"  name="isbn" class="form-control">
      <input hidden="" value="${requestScope.id}" id="id" name="id">
      <br>
            <input class="btn btn-primary" type="submit" id="submit" name="submit" value="Find Book">
      <br>
      
      
      </form>
      </div>

            <br>
            <br>
            
            <div class="panel panel-default">

                <div class="panel-heading"><label></label>
                    
                </div>

               <!-- The list should include the Course Code, Course Name, Textbook
details per course (ISBN, Title, Authors, Publication Year, Publisher, Distributor, and Purchase
Price in QR, Textbook cover page image)-->

                <!-- table-responsive makes the table scrollable on small screens-->
                

                <div class="table-responsive">
                    <table class="table table-hover" id="p-table">
                        <thead>
                            <tr>
                                
                                <th class="col-md-3">ISBN</th>
                                <th class="col-md-2">Title</th>
                                <th class="col-md-1">Authors</th>
                                <th class="col-md-1">Publication Date</th>
                                <th class="col-md-1">Publisher</th>
                                <th class="col-md-1">Price(QR)</th>
                                <th class="col-md-1">Cover Image</th>
                                <th class="col-md-1"></th>
                               
                                
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="book" items="${requestScope.book}">
                            <tr >
                               
                                <td >${book.isbn}</td>
                                <td >${book.title}</td>
                                <td>${book.authors}</td>
                                <td>${book.publishedDate}</td>
                                <td>${book.publisher}</td>
                                <td>${book.price} QR</td>
                                <td><img src="${book.img_url}" style="width: 150;height: 150"></td>
                        <form action="assign" method="post">
                            <input hidden="" name="book_isbn" id="book_isbn" value="${book.isbn}">
                             <input hidden="" name="course_id" id="course_id" value="${requestScope.id}">
                                <td><input class="btn btn-primary" type="submit" id="submit" name="submit" value="Assign Book"></td>
                                 
                        </form>
                                
                            </tr>
                        </c:forEach>    
                        </tbody>
                    </table>
                </div>
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

