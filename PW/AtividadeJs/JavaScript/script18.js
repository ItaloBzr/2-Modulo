let numeros = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1];
    let par = 0;

    for (let i = 0; i < numeros.length; i++) {
        if (numeros[i] % 2 === 0) {
            par++;
        }
    }
    console.log("A array apresenta", par, "números pares");