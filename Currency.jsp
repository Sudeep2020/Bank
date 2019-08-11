<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login or Register</title>
</head>
<style>
div
{
  position:relative; 
  top:200px;
  display: table;
  margin-right: auto;
  margin-left: auto;
}
</style>
<body style="background-color:powderblue;">
<div style="border:5px solid black;width:400px;background:white">
<h2><center>Currency converter</center></h2>
<form action = "Convert" method = "post">
<table style = "background-color:skyblue; margin-left:20px; margin-right:20px">
<tr><td> CountryID : </td><td><input type = "number" name = "CountryID"></td></tr>
<tr><td> From Currency : </td><td><input type = "text" name = "CountryName"></td></tr>
<tr><td> To Currency : </td><td><input type = "text" name = "Type"></td></tr>
<tr><td> Enter amount to convert : </td><td><input type = "number" name = "Money"></td></tr>
<tr><td><input type = "submit" name = "submit" value = "Convert"></td></tr>
</table>
</div>
</form>
</body>
</html>
