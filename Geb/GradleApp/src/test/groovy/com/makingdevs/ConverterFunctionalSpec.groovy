package com.makingdevs

import geb.junit4.GebReportingTest
import spock.lang.*
import geb.*
import geb.spock.*

class ConverterFunctionalSpec extends GebSpec { 

  def "Conversion of a binary number to decimal"(){
    when:
      to ConverterPage
    and: "I write a binary number"
      number << "10"
    and: "I press the calculate button"
      calculate.click()
      waitFor { result }
    then: "I should see 2 as the result"
      result.text() == "2"
  }
  
  @Unroll("If I write the number #_binaryNumber I must see the number #_decimalNumber as the result")
  def "Convert a binary number to decimal"(){
    when:
      to ConverterPage
    and: "I write a binary number"
      number << _binaryNumber
    and: "I press the calculate button"
      calculate.click()
      waitFor {result}
    then: "I should see the decimal value"
      assert result.text() == _decimalNumber
    where:
      _binaryNumber || _decimalNumber
      "101"           ||  "5"
      "111"           ||  "7"
      "1000"          ||  "8"
      "10001"         ||  "17"
  }

  def "Conversion of a decimal number to binary"(){
    when:
      to ConverterPage
    and: "I write a decimal number"
      number << "8"
    and: "I select the option to convert decimal to binary"
      typeOfConversion = 2
    and: "I press the calculate button"
      calculate.click()
      waitFor { result }
    then: "I should see 1000 as the result"
      result.text() == "1000"
  }

  def "Conversion of a decimal number to binary"(){
    when:
      to ConverterPage
    and: "I write a decimal number"
      number << "25"
    and: "I press the calculate button"
      calculate.click()
      waitFor { result }
    then:"I should see an error message"
      result.text() == "El número no puede ser convertido" 
  }
}
