<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
  <title>admin</title>

  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
  <meta name="mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-capable" content="yes">

  <script src="../bower_components/webcomponentsjs/webcomponents.js"></script>
  
  <link rel="import" href="../bower_components/core-icons/core-icons.html">
  <link rel="import" href="../bower_components/sampler-scaffold/sampler-scaffold.html">
  <link rel="import" href="../bower_components/core-item/core-item.html">

  <style>
    body {
      font-family: 'Helvetica Neue', Helvetica, Arial;
      margin: 0;
    }
    
    section {
      padding: 40px;
      min-height: 300px;
    }
  </style>

</head>

<body unresolved>

  <sampler-scaffold label="ADMINISTRADOR">

    <core-item label="Registrar Usuario" icon="assignment-ind" url="../componentes/venta-element.html"></core-item>
    <core-item label="Registrar Prenda" icon="store" url="../componentes/regPrenda-element.html"></core-item>
    <core-item label="Catalogo" icon="receipt" url="../componentes/registro-prenda.jsp"></core-item>
    <core-item label="Reportes" icon="receipt" url="demos/checkbox.html"></core-item>
    
    
  </sampler-scaffold>

</body>
</html>
