function cadastro(){
    var nome = document.getElementById("nome").value
    var email = document.getElementById("email").value
    var rg = document.getElementById("rg").value
    var cpf = document.getElementById("cpf").value

    console.log("nome: " + nome + "\nemail: "+ email + "\nrg: " + rg + "\ncpf: "+ cpf);

    if (nome !== '' && email !== '' && idade != '') {
        document.getElementById("btn").style.display = 'none';
        document.getElementById("nome").style.display = 'none';
        document.getElementById("email").style.display = 'none';
        document.getElementById("rg").style.display = 'none';
        document.getElementById("cpf").style.display = 'none';

        document.getElementById("txt").innerHTML = 'Cadastro Realizado com Sucesso';
        alert('Formulário preenchido com sucesso!');
      } else {
        alert('Por favor, preencha todos os campos.');
      }

} 

