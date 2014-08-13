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
    and: "I press the button of calculate"
      calculate.click()
      waitFor { result }
    then: "I should see 2 as the result"
      result.text().contains "2"
  }
  
}
