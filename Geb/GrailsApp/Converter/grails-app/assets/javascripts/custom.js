$('document').ready(function(){  
  $('form[name=conversionForm]').submit(function(event){
    event.preventDefault();

    if($('input[name=numericValue]').val() != ""){
      this.submit()
    }

  });
});