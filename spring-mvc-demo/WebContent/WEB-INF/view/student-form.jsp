<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>
<!-- в экшн должен стоять адрес обработчика назначения -->
	<form:form action="studentInfo" 
	modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Country:  
		<form:select path="countryName">
			<form:option value="Russia" label="Russia"></form:option> 
			<form:option value="Beloussia" label="Belorussia"></form:option> 
			<form:option value="Italy" label="Italy"></form:option> 
			<form:option value="Mongolia" label="Mongolia"></form:option> 
			<form:option value="Sweden" label="Sweden"></form:option> 
		</form:select>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>
