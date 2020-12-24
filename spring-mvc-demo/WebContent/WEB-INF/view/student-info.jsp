<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student</title>
</head>
<body>
    <h2>I have got student name</h2>
    <hr>
    ${student.firstName }
    <hr>
    ${student.lastName }
    <hr>
    ${student.countryName }
    <hr>
    ${student.favLang}
    <hr>
    <ul>
    	<c:forEach var="temp" items="${student.opSystems }">
    		<li> ${temp} </li>
    	</c:forEach>
    </ul>
    
</html>