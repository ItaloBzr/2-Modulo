numeros = []
    for (let x = 1; x <= 10; x++) {
        let numero = Math.floor(Math.random() * 10) + 1;
        console.log(`Número aleatório ${x}:`, numero);
        numeros.push(numero)
    }