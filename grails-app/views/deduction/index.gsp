<!DOCTYPE html>
<html>
<head>
    <title>Deduction</title>
</head>
<body>
    <h1>Here you can enter your name,total salary and how much you want to withdraw!</h1>
<h3>Unfortunately I am unable to create a continuous balance.</h3>
    <form action="${createLink(controller: 'Deduction', action: 'calculate')}" method="post">
        <p>User Name: <input type="text" name="name" required /></p>
        <p>Total amount: <input type="number" step="0.01" name="total" required /></p>
        <p>Amount to Deduct: <input type="number" step="0.01" name="amount" required /></p>
        <p>Time when deducted: <input type="text" name="time" required /></p>
        <input type="submit" value="Calculate" />
    </form>
</body>
</html>