<!DOC-TYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
     <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/3df637a2f2.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="Teste.css">
        <title>Page Academia</title>
</head>

<header>
    <div class="menu-content">
        <img src="Imagem2.png">
        <h1 class="logo"> GYM-CENTER</h1>
        <nav class="header-menu">

            <ul class="list-itens">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="#">serviços</a></li>
                <li><a href="#">Sobre</a></li>
                <li><a href="#">contatos</a></li>
                <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                <li><a href="#"><i class="fab fa-instagram"></i></a></li>
            </ul>
        </nav>
    </div>
</header>
<body>


  <div>
      <form class = "form" method="post">
    <h1>Cars</h1>

<div class="id">
 <select>
    <c:forEach var="car" items="${cars}">
    <option value="${car.id}">${car.id}</option>

    </c:forEach>
 </select>
 </div>

 <label>Escolha o exercicio 2:</label>
  <select>
     <c:forEach var="car" items="${cars}">
     <option value="${car.name}">${car.name}</option>

     </c:forEach>
  </select>


<label>Escolha a quantidade de repeticao 2:</label>
    <select>
       <c:forEach var="car" items="${cars}">
       <option value="${car.repeticao}">${car.repeticao}</option>

       </c:forEach>
    </select>

    <label>Escolha a quantidade de CARGA 2:</label>
        <select>
           <c:forEach var="car" items="${cars}">
           <option value="${car.carga}">${car.carga}</option>

           </c:forEach>
        </select>

    <button type="submit" class = "botao" form="form" value="Submit">CADASTRAR</button>

</form>

  </div>
</body>
</html>