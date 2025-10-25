<?php 
include("conexao.php");

$name = $_GET['name'];

$excluir = $pdo->prepare("DELETE FROM demo WHERE name = :name");
$excluir->bindParam(':name', $name, PDO::PARAM_STR);
$excluir->execute();

header("Location: kaline.php");
exit;
?>
