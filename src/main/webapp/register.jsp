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
    <h2>Registration</h2>
    <form action="registermain" method="Post">
      <div class="input-box">
        <input type="text" placeholder="Enter your name" name="name">
      </div>
      <div class="input-box">
        <input type="text" placeholder="Enter your phone number" name="phno">
      </div>
      <div class="input-box">
        <input type="password" placeholder=" password" name ="pass">
      </div>
      
      <div class="policy">
        <input type="checkbox">
        <h3>I accept all terms & condition</h3>
      </div>
      <div class="input-box button">
        <input type="Submit" value="Register Now">
      </div>
      <div class="text">
        <h3>Already have an account? <a href="#">Login now</a></h3>
      </div>
    </form>
  </div>
</body>
</html>