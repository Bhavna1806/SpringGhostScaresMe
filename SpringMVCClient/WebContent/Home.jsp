<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<h1>Employee List</h1>
<table>
	<c:forEach var="emp" items="${elist}">
		<tr>
			<td> ${emp.empId}</td>
			<td> ${emp.empName}</td>
			<td> ${emp.empSalary}</td>
			<td> ${emp.empDepartment}</td>
		</tr>
	</c:forEach>
</table>
<hr/>
<%@taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<s:form action="add.obj" modelAttribute="emp">
	Enter Employee id:
	<s:input path="empId"/><br/>
	Enter Employee Name:
	<s:input path="empName"/><br/>
	Enter Employee Salary:
	<s:input path="empSalary"/><br/>
	Enter Department:
	<s:input path="empDepartment"/><br/>
	<input type="submit" value="Add Employee"/>
</s:form>
</body>
</html>