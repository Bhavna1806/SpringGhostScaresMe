<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registered Successfully!!!!</h1>

<h2>User Info</h2>

First Name : ${user.firstName}<br/>
Last Name : ${user.lastName}<br/>
Gender: ${user.gender}<br/>
eMail : ${user.email}<br/>
Skills: 
<c:forEach items="${user.skillSet}" var="skill">
${skill}
</c:forEach>
<br/>
City: ${user.city}<br/>
</body>
</html>