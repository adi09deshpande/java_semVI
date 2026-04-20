<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.List, com.employee.Employee" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Employees</title>
    <style>
        body  { font-family: Arial; background: #f2f2f2; }
        h2    { text-align: center; color: darkblue; }
        table { width: 80%; margin: 20px auto; border-collapse: collapse;
                background: white; }
        th    { background: darkblue; color: white; padding: 10px; }
        td    { padding: 9px; border: 1px solid #ccc; text-align: center; }
        tr:nth-child(even) { background: #eef; }
        .back { text-align: center; margin: 15px; }
    </style>
</head>
<body>

<h2>All Employees</h2>

<%
    List<Employee> list = (List<Employee>) request.getAttribute("list");
    if (list == null || list.isEmpty()) {
%>
    <p style="text-align:center; color:gray">No employees found.</p>
<%
    } else {
%>
<table>
    <tr>
        <th>Emp ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>
    <% for (Employee e : list) { %>
    <tr>
        <td><%= e.getEmpId() %></td>
        <td><%= e.getName() %></td>
        <td><%= e.getEmail() %></td>
        <td><%= e.getDepartment() %></td>
        <td><%= e.getSalary() %></td>
    </tr>
    <% } %>
</table>
<% } %>

<div class="back">
    <a href="index.jsp">Back to Registration</a>
</div>

</body>
</html>
