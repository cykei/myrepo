package com.j2.w6;

abstract public class Pizza{
  String name;
  String dough;
  String sauce;
  
  public String getName() {
    return name;
  }
  public void prepare(){
    System.out.println("preparing"+name);
  }
   public void bake(){
    System.out.println("baking"+name);
  }
    public void cut(){
    System.out.println("cuting"+name);
  }
     public void box(){
    System.out.println("boxing"+name);
     }
  public String toString() { 
   // code to display pizza name and ingredients 
   StringBuffer display = new StringBuffer(); 
   display.append("---- " + name + " ----\n"); 
   display.append(dough + "\n"); 
   display.append(sauce + "\n"); 
  
  return display.toString(); 
  }
}
