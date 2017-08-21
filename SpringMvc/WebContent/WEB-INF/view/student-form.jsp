<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>

<title>STUDENT REGISTRATION FORM </title>

</head>
<body>
<form:form  action="processForm" modelAttribute="student">
FirstName:<form:input path="firstName"/>

<br><br>

LastName:<form:input path="lastName"/>

<br><br>
Country:
<form:select path="country">
<form:options items="${student.countryOptions }"/>
</form:select>
<br><br>
Favorite Language:
java<form:radiobutton path="favoriteLanguage"  value="Java	"/>
C#<form:radiobutton path="favoriteLanguage"  value="C#"/>
php<form:radiobutton path="favoriteLanguage"  value="PHP"/>
ruby<form:radiobutton path="favoriteLanguage"  value="Java"/>
<br><br>
Linux<form:checkbox path ="operatingSystems" value="Linux"/>
Mac os<form:checkbox path ="operatingSystems" value="Mac"/>
MS Window<form:checkbox path ="operatingSystems" value="MS Window "/>
<input type="submit" value="Submit"/>
</form:form>


</body>


</html>