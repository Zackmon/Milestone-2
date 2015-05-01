<html lang="en">
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
                <div class="panel-heading"><label>Order List</label>
                    
                </div>

               <!-- The list should include the Course Code, Course Name, Textbook
details per course (ISBN, Title, Authors, Publication Year, Publisher, Distributor, and Purchase
Price in QR, Textbook cover page image)-->

                <!-- table-responsive makes the table scrollable on small screens-->
                <div class="table-responsive">
                    <table class="table table-hover" id="p-table">
                        <thead>
                            <tr>
                                <th class="col-md-1">Order #</th>
                                
                                <th class="col-md-2">ISBN</th>
                                <th class="col-md-2">Title</th>
                                <th class="col-md-1">Authors</th>
                                <th class="col-md-1">Publication Year</th>
                                <th class="col-md-1">Publisher</th>
                                <th class="col-md-1">Distributor</th>
                                <th class="col-md-1">Price(QR)</th>
                                <th class="col-md-1"># copies</th>
                                <th class="col-md-1">Estimated arrival</th>
                                
                            </tr>
                        </thead>
                        <tbody>

                            <tr >
                                <td >343746348</td>
                                
                                <td >978-3-16-148410-0</td>
                                <td >Introduction to Java</td>
                                <td>Author</td>
                                <td>2005</td>
                                <td>Pearsons</td>
                                <td>Dsitrbutor</td>
                                <td>100 QR</td>
                                <td>200</td>
                                <td>30/4/2015</td>
                                
                            </tr>
                            
                            <tr >
                                <td >374638741</td>
                                
                                <td >978-3-16-148410-0</td>
                                <td >Introduction to Java</td>
                                <td>Author</td>
                                <td>2005</td>
                                <td>Pearsons</td>
                                <td>Dsitrbutor</td>
                                <td>100 QR</td>
                                <td>200</td>
                                <td>30/4/2015</td>
                                
                            </tr>
                            <!--
                            <tr >
                                <td >CMPS305</td>
                                <td >Data structures</td>
                                <td >Not assigned</td>
                                <td >Not assigned</td>
                                <td>Not assigned</td>
                                
                            </tr>
                             <tr >
                                <td >CMPS111</td>
                                <td >Programming</td>
                                <td >Not assigned</td>
                                <td >Not assigned</td>
                                <td>Ordered, Est. arrival: 20/april/2015</td>
                                
                            </tr>
                            -->
                            
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

