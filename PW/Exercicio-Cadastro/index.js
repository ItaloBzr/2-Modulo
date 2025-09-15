let edit = 0;


function abrirlista() {
    document.getElementById('formulario').style.display = 'block';
}

function fecharlista() {
    document.getElementById('formulario').style.display = 'none';
    document.getElementById('nome').value = ""
    document.getElementById('salario').value = ""
    document.getElementById('funcao').value = ""
}

function adicionarFuncionario() {
    const nome = document.getElementById('nome').value;
    const salario = document.getElementById('salario').value;
    const funcao = document.getElementById('funcao').value;

    const tabela = document.getElementById('tabelaFuncionarios');
    

    if(edit != 0){
        edit.cells[0].innerText = nome;
        edit.cells[1].innerText = salario;
        edit.cells[2].innerText = funcao;

        fecharlista();
    }else{
        
        const novaLinha = tabela.insertRow();
        novaLinha.insertCell(0).innerText = nome;
        novaLinha.insertCell(1).innerText = salario;
        novaLinha.insertCell(2).innerText = funcao;
        novaLinha.insertCell(3).innerHTML = '<button onclick="editarFuncionario(this)">Editar</button>';
        novaLinha.insertCell(4).innerHTML = '<button onclick="excluirFuncionario(this)">Excluir</button>';
        fecharlista()
    }

}

function excluirFuncionario(button) {
    const row = button.parentNode.parentNode;
    row.parentNode.removeChild(row);
}

function editarFuncionario(button){
    const row = button.parentNode.parentNode;
    edit = 1;

    const nome = row.cells[0].innerText;
    const salario = row.cells[1].innerText;
    const funcao = row.cells[2].innerText;

    document.getElementById('nome').value = nome
    document.getElementById('salario').value = salario
    document.getElementById('funcao').value = funcao

    abrirlista()
}