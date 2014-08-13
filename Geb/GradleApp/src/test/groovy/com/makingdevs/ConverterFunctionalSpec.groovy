package com.makingdevs

import geb.junit4.GebReportingTest
import spock.lang.*
import geb.*
import geb.spock.*

class ConverterFunctionalSpec extends GebReportingTest{ 

  def "Conversion of a binary number to decimal"(){
    when:
      to ConverterPage
    and: "I write a binary number"
      number << "10"
    when: "I press the button of calculate"
      calculate.click()
      waitFor { result }
    then: "I should see 2 as the result"
      assert result == "2"
  }
}
