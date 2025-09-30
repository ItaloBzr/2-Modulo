let numeros = [];
for (let x = 1; x <= 3; x++) {
    let numero = Number(prompt("Digite um número:"));
    numeros.push(numero);
}
let maiorNumero = Math.max(...numeros);
console.log("O maior número entre os digitados é:", maiorNumero);