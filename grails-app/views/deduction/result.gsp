<!DOCTYPE html>
<html>
<head>
    <title>Transaction Result</title>
</head>
<body>

<h3>Only one transaction is being saved and not multiple </h3>
    <p>Name: ${name}</p>
    <p>Total: ${total}</p>
    <p>Amount to Deduct: ${amount}</p>
    <p>Time: ${time}</p>
    <p>Result: ${result}</p>
    <p>Conversionof withdraw Amount: ${convert}</p>
    <a href="${createLink(controller: 'Deduction', action: 'calculate', params: [name: name, total: total, amount: amount, time: time, convert: convert,download: 'true'])}">Download this transaction as CSV</a>
    <p><a href="${createLink(controller: 'Deduction', action: 'index')}">Make a new Transaction</a></p>

</body>
</html>