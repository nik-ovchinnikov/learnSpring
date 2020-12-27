<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<style>
	.error {color:red}
	</style>
</head>
<body>

Hello Customer

<br><br>

<form:form action="confirmation" 	modelAttribute="customer">
			First name: <form:input path="firstName" />
			
			<br><br>
		
			Last name: <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error"></form:errors>
			
			<br><br>
		
			Free Passes: <form:input path="freePasses" />
			<form:errors path="freePasses" cssClass="error"></form:errors>
			
			<br><br>
		
			Postal Code: <form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error"></form:errors>
			
			<br><br>
		
			Postal Code: <form:input path="courseCode" />
			<form:errors path="courseCode" cssClass="error"></form:errors>
			
			<br><br>
	
			<input type="submit" value="Submit" />
</form:form>


</body>

</html>