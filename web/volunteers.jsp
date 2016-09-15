<!DOCTYPE html>
<!--
Template Name: Academic Education V2
Author: <a href="http://www.os-templates.com/">OS Templates</a>
Author URI: http://www.os-templates.com/
Licence: Free to use under our free template licence terms
Licence URI: http://www.os-templates.com/template-terms
-->
<html>
<head>
<title>Rowan Jazz and Blues Society</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
</head>
<body id="top">
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row0">
  <div id="topbar" class="clear"> 
    <!-- ################################################################################################ -->
    <nav>
      <ul>
          <li><a href="#">Home</a></li>
        <li><a href="#">Contact Us</a></li>
        <li><a href="#">A - Z Index</a></li>
        <li><a href="#">Hello,${name}!</a></li>
        <li><a href="#">Logout</a></li>
      </ul>
    </nav>
    <!-- ################################################################################################ --> 
  </div>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row1">
  <header id="header" class="clear"> 
    <!-- ################################################################################################ -->
    <div id="logo" class="fl_left">
      <h1><a href="index.jsp">Rowan Jazz and Blues Society</a></h1>
      <p></p>
    </div>
    <div class="fl_right">
      <form class="clear" method="post" action="#">
        <fieldset>
          <legend>Search:</legend>
          <input type="text" value="" placeholder="Search Here">
          <button class="fa fa-search" type="submit" title="Search"><em>Search</em></button>
        </fieldset>
      </form>
    </div>
    <!-- ################################################################################################ --> 
  </header>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row2">
  <div class="rounded">
    <nav id="mainav" class="clear"> 
      <!-- ################################################################################################ -->
      <ul class="clear">
          
        <li class="active"><a href="index.jsp">Home</a></li>
        <li><a href="login.jsp">Login</a></li>
        <li><a href="events.jsp">Events</a></li>
        <li><a href="contact.jsp">Contact</a></li>
        
        <li><a class="drop" href="#">Links</a>
          <ul>
            <li><a href="pages/gallery.html">Gallery</a></li>
            
          </ul>
        </li>
        <li><a class="drop" href="#">Participants</a>
          <ul>
            <li><a href="sponsors.jsp">Sponsors</a></li>
            
              
                <li><a href="vendors.jsp">Vendors</a></li>
                <li><a href="volunteers.jsp">Volunteers</a></li>
              </ul>
            
          </ul>
        </li>
        
      </ul>
      <!-- ################################################################################################ --> 
    </nav>
  </div>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper">
  <div id="slider">
    <div id="slide-wrapper" class="rounded clear"> 
      <!-- ################################################################################################ -->
      <img src="images/demo/Rowan.jpg"/>
      <!-- ################################################################################################ -->
      
      <!-- ################################################################################################ --> 
    </div>
  </div>
</div>
<!-- ################################################################################################ --> 
<!-- ################################################################################################ --> 
<!-- ################################################################################################ -->
<div class="wrapper row3">
  <div class="rounded">
    <main class="container clear"> 
      <!-- main body --> 
      <!-- ################################################################################################ -->
      <div class="group btmspace-30"> 
        <!-- Left Column -->
        <div class="one_quarter first"> 
          <!-- ################################################################################################ -->
          
          <!-- ################################################################################################ --> 
        </div>
        <!-- / Left Column --> 
        <!-- Middle Column -->
        <div class="one_half"> 
            <form name="volunteer" action="volunteer" method="POST">
                First Name(required)<input type="text" name="firstName" value="" /><br><br>
                Last Name(required)<input type="text" name="lastName" value="" /><br><br>
                Your Address(required)<input type="text" name="address" value="" /><br><br>
                Your Email(required)<input type="text" name="email" value="" /><br><br>
                Phone Number<input type="text" name="phoneNumber" value="" /><br><br>
                Volunteer Opportunities<br><br><br><br>
                Select the volunteer opportunities you are interested in.(Must choose atleast 1)<br><br>
                <input type="checkbox" name="Festival" value="festival" />Festival<br><br>
                <input type="checkbox" name="Promotion and Publicity" value="promotion" />Promotion and Publicity<br><br>
                <input type="checkbox" name="Board Member" value="board" />Board Member<br><br>
                <input type="checkbox" name="Clerical" value="clerical" />Clerical<br><br>
                <input type="checkbox" name="Fund Raiser" value="fund" />Fund Raiser<br><br>
                <input type="checkbox" name="Membership Drive" value="drive" />Membership Drive<br><br>
                <input type="checkbox" name="Education Program" value="education" />Education Program<br><br><br><br>
                What do you want to do in your role?<br><br>
                <textarea name="role" rows="4" cols="20">
                </textarea><br><br><br><br>
                When are you available to volunteer?
                <textarea name="time" rows="4" cols="20">
                </textarea><br><br><br><br>
                
                <input type="submit" value="Send" />
                
            </form>
            
        </div>     </div></main></div></div>
      
    </body>
</html>
