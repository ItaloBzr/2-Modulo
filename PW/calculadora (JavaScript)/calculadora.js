function somar(){
    n1 = document.getElementById("n1").value
    n2 = document.getElementById("n2").value

    calculo = Number(n1) + Number(n2)
    let resultado = document.getElementById("resultado");
    resultado.innerHTML = "Resultado = " + calculo; 
}

function subtrair(){
    n1 = document.getElementById("n1").value
    n2 = document.getElementById("n2").value

    calculo = Number(n1) - Number(n2)
    let resultado = document.getElementById("resultado");
    resultado.innerHTML = "Resultado = " + calculo; 
}

function dividir(){
    n1 = document.getElementById("n1").value
    n2 = document.getElementById("n2").value

    calculo = Number(n1) / Number(n2)
    let resultado = document.getElementById("resultado");
    resultado.innerHTML = "Resultado = " + calculo; 
}

function multiplicar(){
    n1 = document.getElementById("n1").value
    n2 = document.getElementById("n2").value

    calculo = Number(n1) * Number(n2)
    let resultado = document.getElementById("resultado");
    resultado.innerHTML = "Resultado = " + calculo; 
}

function deletar(){
    n1 = document.getElementById("n1").value = ""
    n2 = document.getElementById("n2").value = ""

    let resultado = document.getElementById("resultado");
    resultado.innerHTML = "Resultado = "; 
}