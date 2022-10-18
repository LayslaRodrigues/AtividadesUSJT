function calculadora(){

    var valor1 = parseInt(document.getElementById("ivalor1").value);
    var valor2 = parseInt(document.getElementById("ivalor2").value);

    var op = document.querySelector('input[name=calc]:checked').value;

    if (op == "soma"){
        var resposta = valor1 + valor2;
        alert("A soma é: " + resposta);
    }

    if (op == "subtracao"){
        var resposta = valor1 - valor2;
        alert("A Subtração é: " + resposta);
    }

    if (op == "multiplicacao"){
        var resposta = valor1 * valor2;
        alert("A multiplicação é: " + resposta);
    }

    if (op == "divisao"){
        var resposta = valor1 / valor2;
        alert("A divisão é: " + resposta);
    }
}