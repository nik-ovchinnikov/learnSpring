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
			<form:options items="${student.countryOptions}"></form:options> 
			
		</form:select>
		
		<br><br>
		
	Favourite language::  
	 <form:radiobuttons path="favLang" items="${student.langs}"/> 
		
		<br><br>
		
	What system do you know?:  
	 <form:checkboxes path="opSystems"  items="${student.opSystemsChoose}"/> 
		
		<br><br>
		
		
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>
