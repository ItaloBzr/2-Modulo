<?php

include("conexao.php");

$name = $_POST['name'];
$idade = $_POST['idade'];
$cpf = $_POST['cpf'];
$email = $_POST['email'];
$tell = $_POST['tell'];
$cel = $_POST['cel'];
$abrir = $_POST['abrir'];
$dobrar = $_POST['dobrar'];

$inserir = $pdo->prepare("insert into demo (name,idade,cpf,email,tell,cel, abrir,dobrar)
                     values ('$name', '$idade', '$cpf', '$email', '$tell','$cel', '$abrir','$dobrar')");
$inserir->execute();

header("location:kaline.php");


?>