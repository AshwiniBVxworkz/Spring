<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Successfully</title>
</head>
<body>
<h2 style="text-align:justify">Registered Successfully</h2>


<table border="4" align="center">
<tr>

<th>Name</th>
<th>Email</th>
<th>Address</th>
<th>Address2</th>
<th>City</th>
<th>Region</th>
<th>Postal/Zip code</th>
<th>Phone Number</th>
<th>About</th>
</tr> 
<tr>
<td>${Dto.name}</td>
<td>${Dto.email}</td>
<td>${Dto.address}</td>
<td>${Dto.address2}</td>
<td>${Dto.city}</td>
<td>${Dto.region}</td>
<td>${Dto.postalCode}</td>
<td>${Dto.phoneNumber}</td>
<td>${Dto.aboutMe}</td>
</tr>
</table>

</body>
</html>