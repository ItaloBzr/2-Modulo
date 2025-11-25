<?php 
  
    include("conexao.php");

    $name = $_POST['nome'];
    $email = $_POST['email'];
    $senha = $_POST['senha'];


    $inserir = $pdo->prepare("insert into demo (name,email,senha)
                     values ('$name', '$email', '$senha')");
    $inserir->execute();

    header("location:Login.php");


?>