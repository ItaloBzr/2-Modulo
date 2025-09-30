let notas = [];
    let soma = 0;
    for (let x = 1; x <= 3; x++) {
        let nota = Number(prompt(`Digite sua nota ${x}:`));
        notas.push(nota);
        soma += nota;
    }
    let media = soma / notas.length;
    console.log("A média das notas é:", media);