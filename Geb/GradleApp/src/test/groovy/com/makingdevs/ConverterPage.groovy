package com.makingdevs

import geb.*

class ConverterPage extends Page{

  static content = {
    currentForm {  $("#converter") }
    number { $("form#conversionForm").find("input") }
    typeOfConversion { $("#typeOfConversion") }
    calculate { $("form#conversionForm").find("button[type=submit]") }
    result { $("#result") }
  } 
}
