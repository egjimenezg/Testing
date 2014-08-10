package com.makingdevs

class ConverterController {
  
  def converterService 

  def index(){}
  
  def convert(){
    def convertedNumber

    try{
      convertedNumber = converterService.convertNumber(params.type,Integer.parseInt(params.numericValue)) 
    }
    catch(NumberFormatException numberFormatException){
      flash.message = 'The number can`t be converted'   
    }

    redirect action:"index"
  }       
  
}
