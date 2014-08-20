package com.makingdevs

import geb.junit4.GebReportingTest
import spock.lang.*
import geb.*
import geb.spock.*

class ConverterFunctionalSpec extends GebSpec { 

  @Ignore
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

  def "Conversion of a decimal number to binary"(){
    when:
      to ConverterPage
    and: "I write a decimal number"
      number << "8"
    and: "I select the option to convert decimal to binary"
      waitFor { typeOfConversion }
      typeOfConversion = 2
    and: "I press the calculate button"
      calculate.click()
      waitFor { result }
    then: "I should see 1000 as the result"
      result.text() == "1000"
  }
  
}
