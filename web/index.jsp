<%-- 
    Document   : index
    Created on : Sep 13, 2016, 7:06:09 PM
    Author     : Akhila Damsari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<link href="Styles.css" rel="stylesheet" type="text/css">
</head>

<body>
<header><img src="Images/web.png" width="200" height="133" alt=""/>
	
    <nav><a href="index.html" class="navHome">Home</a> <a href="glossary.html" class="navAnimalGlossary">Animal Glossary</a> <a href="library.html" class="navTemplateLibrary">Template Library</a> <a class="navLogNoteLibrary">Log Note Library</a> <a href="login.html" class="navLogin">Login</a> <a href="search.html" class="navSearch">Search </a></nav>
    
</header>

<aside class="asideLeft">
  <h1>Introduction</h1>
   <p>With the development of the technology and busy life, people tend to use web based management systems instead of manual systems in every industry.  Scientists and nature lovers feel uncomfortable with the manual log entry system prevailing. We are introducing an Electronic Log Book for Scientists and Nature Lovers to track birds data and maintain check lists instead of the manual system. Our system consisted of a web portal for all users and mobile application which can access Scientists and nature lovers separately according to their needs.
    
    <p>Our system will help to three main parties. They are the <b>Scientists</b>, <b>Wildlife researchers</b> and the <b>Nature lovers</b> who have interest about the animals.
    
  <p>When we keep manual recordings the level of service is limited.
    Since
    
	<ol><li>The checklists may have the ability to make errors.
    	<li>Leaking of hardly gathered information in field visits.
    	<li>Time consuming and costly to maintain manual checklists.
    	<li>Reduction in sharing information about animals.
    	<li>Duplication of data entry.
    	<li>Difficulty in note down the locations, timing with respective to the animals during scrape situations
    	<li>It takes more effort and physical space to keep track of paper documents, maintain and to find gathered  			             information when needed.</ol>
    
    Our electronic log book can serve for thousands of people interested about birds in <b><i>South asia</i></b>.
    So, the system may help to animal researches and to make people known about the animals and conserve the animal life.</p> 
</aside>

<section class="sectionRight">
<style>
 #map {
   width: 100%;
   height: 400px;
   background-color: grey;
 }
</style>

  <h3>South Asia Map</h3>
  <div id="map">
   <script>

      function initMap() {
        var mapDiv = document.getElementById('map');
        var map = new google.maps.Map(mapDiv, {

           center: {lat: 7.8731, lng: 80.7718},
          zoom: 8

        });
      }

    </script>
    <script src="https://maps.googleapis.com/maps/api/js?callback=initMap"
        async defer></script></div>
</section>
  
 
    <footer>Copyrights by CURATRIX 2016</footer>
</body>
</html>
