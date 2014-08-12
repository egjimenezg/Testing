<!DOCTYPE html>
<html lang="es">
	<head>
    <title>Geb example</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <asset:stylesheet href="bootstrap/css/bootstrap.css"/>
    <asset:stylesheet href="bootstrap/css/bootstrap-theme.css"/>
    <asset:javascript src="application.js"/>
    <asset:stylesheet src="custom.css"/>
  </head>
  <body>
    <div class="container-fluid">
      <g:form controller="Converter" action="convert" name="conversionForm" id="converter">
        <div class="row">
          <div class="col-xs-7">
            <h4>Escribe un número y elecciona el tipo de conversión          
            <input type="text" name="numericValue" id="numericValue" /> 
          </div>
          <div class="col-md-1">
            <g:select class="form-control" name="type" from="${[[key:1,value:'Binario a Decimal'],
                                       [key:2,value:'Decimal a Binario']]}" optionKey="key" optionValue="value"></g:select>
          </div>
        </div>
        <div class="row">
          <div class="col-md-1">
            <button type="submit" class="btn btn-info">
              Convertir
            </button>
          </div>

          <g:if test="${flash.message}">
            <div class="alert alert-danger result col-md-1">
            ${flash.message}
            </div>
          </g:if>
          <g:else>
            <div class="alert alert-info result col-md-1">
              <p id="result">Resultado: ${result}</p>
            </div>
          </g:else>
        </div>
      </g:form>
    </div> 
  </body>
</html>
