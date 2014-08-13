package com.makingdevs

import geb.*

class ConverterPage extends Page{

  static url = "converter/index"
  
  static content = {
    number { $("form#converter").find("input#numericValue") }
    calculate { $("form#converter").find("button[type=submit]") }
    result { $("#result") }
  } 
}
