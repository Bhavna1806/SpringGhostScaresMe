<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Login PAGE</h1>
<c:url var="myAction" value="checkLogin.obj" />

<form:form method="post" modelAttribute="login" action="${myAction}">
  Enter Name:<form:input path="userName"/><br/>
  Enter Password:<form:password path="password"/><br/>
  <input type="submit" value="Login"/>
</form:form>

</body>
</html>