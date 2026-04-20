<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Registration</title>
    <style>
        body { font-family: Arial; background: #f2f2f2; }
        h2   { text-align: center; color: darkblue; }
        form { background: white; width: 350px; margin: 40px auto;
               padding: 25px; border: 1px solid #ccc; }
        input, select { width: 100%; padding: 7px; margin: 6px 0 14px 0;
                        box-sizing: border-box; }
        button { width: 100%; padding: 9px; background: darkblue;
                 color: white; border: none; font-size: 15px; cursor: pointer; }
        .error { color: red; text-align: center; }
        .link  { text-align: center; margin-top: 10px; }
    </style>
</head>
<body>

<h2>Employee Registration</h2>

<% String err = (String) request.getAttribute("error");
   if (err != null) { %>
    <p class="error"><%= err %></p>
<% } %>

<form action="register" method="post">

    <label>Employee ID</label>
    <input type="text" name="empId" placeholder="e.g. E001" required />

    <label>Full Name</label>
    <input type="text" name="name" placeholder="e.g. Rahul Sharma" required />

    <label>Email</label>
    <input type="email" name="email" placeholder="e.g. rahul@mail.com" required />

    <label>Department</label>
    <select name="department" required>
        <option value="">-- Select --</option>
        <option>IT</option>
        <option>HR</option>
        <option>Finance</option>
        <option>Marketing</option>
    </select>

    <label>Salary</label>
    <input type="number" name="salary" placeholder="e.g. 50000" required />

    <button type="submit">Register</button>
</form>

<div class="link">
    <a href="view">View All Employees</a>
</div>

</body>
</html>
