<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="reg.css" />

</head>
<body>
<div class="wrapper">
    <h2>Loginpage</h2>
    <form action="registermain" method="Get">
      <div class="input-box">
        <input type="text" placeholder="Enter your name" name="name">
      </div>
     
      <div class="input-box">
        <input type="password" placeholder=" password" name ="pass">
      </div>
      
      
      <div class="input-box button">
        <input type="Submit" value="Login now">
      </div>
     
  
 
           <div class="input-box button" id="submit">
		<a href ="http://localhost:8080/task/pass.jsp">
          Forgetten password</a>
          </div>
</form>

</body>
</html>