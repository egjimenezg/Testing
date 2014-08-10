<!DOCTYPE html>
<html lang="es">
	<head>
    <title>Geb example</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <asset:stylesheet href="bootstrap/css/bootstrap.css"/>
    <asset:stylesheet href="bootstrap/css/bootstrap-theme.css"/>
    <asset:javascript src="application.js"/>
  </head>
  <body>
    <div class="container-fluid">
      <div class="row">
      <g:form action="convert" name="conversionForm">
        <h4>Escribe un número y elecciona el tipo de conversión
        <input type="text" name="numericValue" /> 
        <g:select name="type" from="${[[key:1,value:'Binario a Decimal'],
                                       [key:1,value:'Decimal a Binario']]}" optionKey="key" optionValue="value"></g:select>
        <button type="submit" class="btn btn-info">
          Convertir
        </button>
      </g:form>
      </div>
      <div>
        ${flash.message}
      </div>
    </div>
  </body>
</html>
