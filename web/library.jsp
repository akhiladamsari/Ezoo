<%-- 
    Document   : library
    Created on : Sep 13, 2016, 7:06:51 PM
    Author     : Akhila Damsari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
  <head>
  	
    <title>Curatrix</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!--Google Fonts-->
    <link href='http://fonts.googleapis.com/css?family=Duru+Sans|Actor' rel='stylesheet' type='text/css'>

    <!--Bootshape-->
    <link href="css/bootshape.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <!-- Navigation bar -->
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#"><span class="green"></span>  Template Library</a>
		 
        </div>
		
		
        <nav role="navigation" class="collapse navbar-collapse navbar-right">
		
		
          <ul class="navbar-nav nav">
            <li class="active"><a href="#">Home</a></li>
			<li><a href="#">Animal Glossary</a></li>
            <li><a href="#">Template Library</a></li>
            <li><a href="#">Log Note Library</a></li>
            <li><a href="login.html">Log In</a></li>
			 <input type="text" placeholder="search"/>
          </ul>
        </nav>
      </div>
    </div><!-- End Navigation bar -->
    <!-- Thumbnails -->
	
	
	
	<div class="site-search">
	 <tr>
    <td><strong>SELECT CATEGARY</strong></span></td>
    <td></span>
	</td>
	

    <td>
    <select style="width: 250px;" id="SELECT">
	<option selected="selected" value="SELECT">SELECT</option>
	<option>A</option>
	<option>B</option>
	<option>C</option>
	<option>D</option>
	<option>E</option>
	<option>F</option>
	</select>
    </span></td>
	</tr>

    <div class="container thumbs">
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img src="image/pic11.jpg" alt="" class="img-box">
          <div class="caption">
           
              <div class="btn-toolbar text-center">
              <a href="#" role="button" class="btn btn-success">Eagle</a>
            </div>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img src="image/pic12.jpg" alt="" class="img-box">
          <div class="caption">
           
             <div class="btn-toolbar text-center">
              <a href="#" role="button" class="btn btn-success">Parrot</a>
            </div>
          </div>
        </div>
      </div>
      <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img src="image/pic13.jpg" alt="" class="img-box">
          <div class="caption">
         
             <div class="btn-toolbar text-center">
              <a href="#" role="button" class="btn btn-success">Pigeon</a>
            </div>
          </div>
        </div>
      </div>
	   <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img src="image/pic14.jpg"  alt="" class="img-box">
          <div class="caption">
           
             <div class="btn-toolbar text-center">
              <a href="#" role="button" class="btn btn-success">Owl</a>
            </div>
          </div>
        </div>
      </div>
	   <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img src="image/pic15.jpg"  alt="" class="img-box">
          <div class="caption">
           
             <div class="btn-toolbar text-center">
              <a href="#" role="button" class="btn btn-success">Fowl</a>
            </div>
          </div>
        </div>
      </div>
	   <div class="col-sm-6 col-md-4">
        <div class="thumbnail">
          <img src="image/pic16.jpg"alt="" class="img-box">
          <div class="caption">
            
             <div class="btn-toolbar text-center">
              <a href="#" role="button" class="btn btn-success">Stork</a>
            </div>
          </div>
        </div>
      </div>
	  
    </div><!-- End Thumbnails -->
    <!-- Content -->
    <div class="container">
      <h3 class="text-center">Welcome to E Zoo</h3>
       </div><!-- End Content -->
    <!-- Footer -->
    <div class="footer text-center">
          </div><!-- End Footer -->

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <!-- // <script src="https://code.jquery.com/jquery.js"></script> -->
    <script src="js/jquery.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/bootshape.js"></script>
    
  </body>
</html>
