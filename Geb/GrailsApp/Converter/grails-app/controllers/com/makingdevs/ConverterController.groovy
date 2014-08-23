package com.makingdevs

class ConverterController {
  
  def converterService 

  def index(){
    [result:params.result]
  }
  
  def convert(){
    
    BigInteger convertedNumber    
    try{
      convertedNumber = converterService.convertNumber(params.int('type'),Integer.parseInt(params.numericValue))
    }
    catch(Exception exception){
      flash.message = 'El número no puede ser convertido'
    }

    redirect action:'index',params:[result:convertedNumber]
  }
  
}
