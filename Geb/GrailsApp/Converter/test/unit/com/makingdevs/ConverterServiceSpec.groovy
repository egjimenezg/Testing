package com.makingdevs

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

@TestFor(ConverterService)
class ConverterServiceSpec extends Specification {
 
  @Unroll("La conversión del número binario #_binaryNumber a decimal eigual a #_convertedNumber")  
  def "Convert a binary number to decimal"(){
    given:"a binary number"
      def binaryNumber = _binaryNumber
    when:
      def convertedNumber = service.convertBinaryToDecimal(binaryNumber) 
    then:  
      assert convertedNumber == _convertedNumber
    where:
      _binaryNumber   || _convertedNumber  
          1010        ||  10
          10          ||  2 
          1           ||  1
  }

  @Unroll("La conversion del número decimal #_decimalNumber a binario es igual a #_convertedNumber")
  def "Conver a decimal number to binary"(){
    given:"a decimal number"
      def decimalNumber = _decimalNumber 
    when:
      def convertedNumber = service.convertDecimalToBinary(decimalNumber) 
    then:
      convertedNumber == _convertedNumber 
    where:
      _decimalNumber  || _convertedNumber
          2           ||  10
          1           ||  1
          9           ||  1001  
  }
}
