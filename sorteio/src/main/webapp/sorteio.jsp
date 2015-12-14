<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">

<div class="jumbotron">
    <h1>Sorteio de 1 a 10</h1> 
    <p>Click em sortear
         </p> 
  </div>
  <br>
  <br>
  <br>
   </h1> <% String t = (String) request.getAttribute("valor"); 
    if(t == null){%><h1>
    <div class="alert alert-info">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <strong>Click no botão Sortear!</strong> 
    </div>
    <%}else{%>
    <div class="alert alert-info">
    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    <strong><%out.println(t);%></strong> 
    </div>
    <%}%>
  
  <button type="button" class="btn btn-success"  name="acao">Sortear</button>
  <button type="button" class="btn btn-danger"  name="acao">Reiniciar</button>
</div>  

</body>
</html>