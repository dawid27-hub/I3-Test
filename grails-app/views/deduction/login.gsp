<!DOCTYPE html>
<html>
<head>
<!-- Login page kept giving me errors so i had to leave it alone -->
    <title>Enter name to enter website </title>
</head>
<body>
    <h1>Here you would need to enter your name and total amount</h1>
    <form action="${createLink(controller: 'Deduction', action: 'login')}" method="post">
        <p>User Name: <input type="text" name="name" required /></p>
        <p>Total amount: <input type="number" step="0.01" name="total" required /></p>

        <input type="submit" value="Login" />
    </form>
</body>
</html>