package com.makingdevs

import grails.transaction.Transactional
import static java.lang.Math.*

@Transactional
class ConverterService {

  def convertNumber(typeOfConversion,number){
    if(typeOfConversion == 1)
      return convertBinaryToDecimal(number)       
    else
      convertDecimalToBinary(number)
  }

  def convertBinaryToDecimal(number){
    def decimalNumber = 0
    def stringNumber = String.valueOf(number).reverse()
    
    stringNumber.length().times{ i -> 
      decimalNumber += Integer.parseInt(stringNumber[i])*pow(2,i)
    }
    
    decimalNumber
  }
  
  def convertDecimalToBinary(number){
    def binaryNumber = ""
    while(number >= 1){
      binaryNumber += (number.intValue()%2)
      number /= 2
    }
    Integer.parseInt(binaryNumber.reverse())
  }
}