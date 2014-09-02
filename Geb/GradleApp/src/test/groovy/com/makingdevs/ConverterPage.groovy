package com.makingdevs

import geb.*

class ConverterPage extends Page{

  static content = {
    number { $("form#converter").find("input") }
    typeOfConversion { $("#typeOfConversion") }
    calculate { $("form#converter").find("button[type=submit]") }
    result { $("#result") }
  } 
}
