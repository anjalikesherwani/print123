document.getElementById('divisionForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const resultDiv = document.getElementById('result');

    if (isNaN(num1) || isNaN(num2)) {
        resultDiv.textContent = 'Please enter valid numbers.';
        return;
    }

    if (num2 === 0) {
        resultDiv.textContent = 'Division by zero is not allowed.';
        return;
    }

    const result = num1 / num2;
    resultDiv.textContent = `Result: ${result}`;
});