<?php
include("conexao.php");

$nome  = $_POST['nome'];
$senha = $_POST['senha'];

$consulta = $pdo->prepare("SELECT * FROM demo WHERE name = ? AND senha = ?");
$consulta->execute([$nome, $senha]);

if ($consulta->rowCount() > 0) {
    header("Location: tela.php");
    exit();
} else {
    echo "<script>alert('Nome ou senha incorretos!'); history.back();</script>";
}
?>
