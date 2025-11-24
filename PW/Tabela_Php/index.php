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
    }
    h2 {
      height: 60px;
      background-color: #1877f2;
      color: white;
      display: flex;
      align-items: center;
      justify-content: center;
      font-size: 1.5rem;
      flex-shrink: 0;
    }
    main {
      flex: 1; 
      display: flex;
      justify-content: center;
      align-items: center;
    }
    form {
      padding: 20px 40px;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      gap: 15px;
      background-color: white;
      border-radius: 5px;
      width: 350px; 
    }
    .grupo-campo {
      width: 100%;
    }
    .grupo-campo input {
      width: 100%;
      padding: 8px 10px;
      font-size: 16px;
      border: 1px solid #1877f2;
      border-radius: 5px;
      outline-color: #1877f2; 
      box-sizing: border-box;
    }
    .grupo-campo input::placeholder {
      color: #999999;
    }
    .btn-primary {
      background-color: #1877f2;
      color: white;
      border: none;
      padding: 10px 20px;
      font-size: 16px;
      border-radius: 5px;
      cursor: pointer;
      width: 100%;
    }
    .btn-primary:hover {
      background-color: #145dbf;
    }
  </style>
</head>

<?php 
  include("conexao.php");
?>

<body>
  <h2 class="titulo-formulario">Entre na sua conta</h2>
  <main>
    <form action="inserirCheck.php" method="post" id="formulario-usuario">

      <div class="grupo-campo" id="campo-nome">
        <input type="text" id="nome" name="nome" placeholder="Nome" />
      </div>

      <div class="grupo-campo" id="campo-idade">
        <input type="text" id="idade" name="idade" placeholder="Idade" />
      </div>

      <div class="grupo-campo" id="campo-cpf">
        <input type="text" id="cpf" name="cpf" placeholder="CPF" />
      </div>

      <div class="grupo-campo" id="campo-rg">
        <input type="text" id="rg" name="rg" placeholder="RG" />
      </div>

      <div class="grupo-campo" id="campo-email">
        <input type="email" id="email" name="email" placeholder="Email" />
      </div>

      <div class="grupo-campo" id="campo-celular">
        <input type="text" id="celular" name="celular" placeholder="Celular" />
      </div>

      <div class="grupo-campo" id="campo-submit">
        <input type="submit" name="submit" class="btn btn-primary" value="Salvar" />
      </div>
    </form>
  </main>
</body>
</html>
