package com.j2.w12.tpm_caramel;

import com.j2.w11.templatemethod.Coffee;
import com.j2.w11.templatemethod.CaffeineBeverage;

public class CaramelMacchiato extends Coffee {
  public void addCondiments(){
    System.out.println("Adding Sugar and Milk");
    System.out.println("Adding Vanilla syrup, Milk, Caramel");
  }
}