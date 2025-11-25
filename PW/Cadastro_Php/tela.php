
<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Quiosque</title>
  <style>
    * {
      margin: 0;
      box-sizing: border-box;
    }
    body {
      display: flex;
      flex-direction: column; 
      height: 100vh;
      align-items: center;
      justify-content: center;
    }

  </style>
</head>

<?php 
  include("conexao.php");
?>

<body>
    <h1>Bem-vindo! Login realizado com sucesso!</h1>
    <?php
echo '<a href="Login.php">Sair</a>';
?>
</body>
</html>


