texto = "Subi no onibus"
let letras = texto.replace(/ /g, '').toLowerCase()
let letrasInvertidas = [...letras].reverse()
let textoInvertido = letrasInvertidas.join('')
let textoOriginal = letras

if (textoOriginal === textoInvertido) {
    console.log("a frase é um palindromo")
} else {
    console.log("a frase não é um palindromo")
}
