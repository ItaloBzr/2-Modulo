let frutas = ["banana", "melão", "pera", "abacaxi", "maçã"];
    let novaFruta = prompt("Fale uma fruta:");
    frutas.push(novaFruta);

    frutas.pop("banana");

    console.log("Frutas restantes:");
    console.log(frutas);