<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1 style="color:Green;font-style:Italic;">User Registration</h1>

 <form action="save" method="post">
  <div>
   <label>Name*</label>
<input type="text" placeholder="Full name" name="name" required="required">
  </div>
  <br>
 <div>
 <label>Email Address*</label>
 <input type="email" placeholder="ram@gmail.com" name="email" required="required">
</div>
<br>
<div>
 <label> Confirm Email Address*</label>
 <input type="email" placeholder="ram@gmail.com" name="confrimEmail" required="required">
</div>
<br>
<div>
<label>Password*</label>
<input type="password"  name="password" required="required">
</div>
<br>
<div>
<label> Confirm Password*</label>
<input type="password"  name="Confirmpassword" required="required">
</div>
<br>
 <div>
   <label>Address*</label>
<input type="text"  name="address" required="required">
  </div>
   <div>
   <br>
   <label>Address 2(optional)</label>
<input type="text" name="address2" >
  </div>
  <br>
   <div>
   <label>City*</label>
<input type="text" name="city" required="required">
  </div>
  <br>
   <div>Region(Optional)</label>
<input type="text" name="region">
  </div>
  <br>
   <div>
   <label>Postal/ZIP Code*</label>
<input type="number" name="postalCode" required="required" minlength="6">
  </div>
  <br>
   <div>
   <label>Phone*</label>
<input type="number" minlength="10" required="required" name="phoneNumber">
  </div>
  <br>
  <label>About me</label>
  <br>
  <textarea placeholder="Enter about you" rows="3" cols="48"  name="aboutMe"></textarea><br><br>
        <input type="reset" value="clear"><br><br>
        <input type="submit" value="Submit">
        </form>
  
</body>
</html>