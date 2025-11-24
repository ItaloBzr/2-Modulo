<?php 
  
    include("conexao.php");

    $name = $_POST['nome'];
    $idade = $_POST['idade'];
    $cpf = $_POST['cpf'];
    $rg = $_POST['rg'];
    $email = $_POST['email'];
    $celular = $_POST['celular'];


    $inserir = $pdo->prepare("insert into demo (name,idade,cpf,rg,email,celular)
                     values ('$name', '$idade', '$cpf', '$rg', '$email', '$celular')");
    $inserir->execute();

    header("location:kaline.php");


?>