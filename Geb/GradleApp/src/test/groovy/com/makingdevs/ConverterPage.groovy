package com.makingdevs

import geb.*

class ConverterPage extends Page{

  static url = "converter/index"
  
  static content = {
    currentForm {  $("form#conversionForm") }
    number { $("form#conversionForm").find("input") }
    calculate { $("form#conversionForm").find("button[type=submit]") }
    result { $("#result") }
  } 
}
