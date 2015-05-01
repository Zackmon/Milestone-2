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
            <br>
            <br>
            <div class="panel panel-default">
                <div class="panel-heading"><label>Course List</label>
                    
                </div>

               <!-- The list should include the Course Code, Course Name, Textbook
details per course (ISBN, Title, Authors, Publication Year, Publisher, Distributor, and Purchase
Price in QR, Textbook cover page image)-->

                <!-- table-responsive makes the table scrollable on small screens-->
                <div class="table-responsive">
                    <table class="table table-hover" id="p-table">
                        <thead>
                            <tr>
                                <th class="col-md-1">Course Code</th>
                                <th class="col-md-3">Course Name</th>
                                <th class="col-md-2">ISBN</th>
                                <th class="col-md-2">Title</th>
                                <th class="col-md-1">Authors</th>
                                <th class="col-md-1">Publication Date</th>
                                <th class="col-md-1">Publisher</th>
                                <th class="col-md-1">Price(QR)</th>
                                <th class="col-md-1">Cover Image</th>
                                <th class="col-md-1">Add/Replace</th>
                                
                            </tr>
                        </thead>
                        <tbody>
                           <c:forEach var="course" items="${requestScope.course}">
                            <tr >
                                <td >${course.coursecode}</td>
                                <td >${course.name}</td>
                                <td >${course.textbook.isbn}</td>
                                <td >${course.textbook.title}</td>
                                <td>${course.textbook.authors}</td>
                                <td>${course.textbook.publishedDate}</td>
                                <td>${course.textbook.publisher}</td>
                                <td>${course.textbook.price} QR</td>
                                <td><img src="${course.textbook.img_url}" style="width: 150;height: 150"></td>
                                <td><a href="assign?id=${course.courseid}">Add/Replace</a></td>
                                
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

