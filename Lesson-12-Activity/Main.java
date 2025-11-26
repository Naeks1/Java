class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
String creditCardType(String number){
 if (number.substring(0,1).equals("4")){
  return "visa";
 }
 else if (number.substring(0,2).equals("37")||number.substring(0,2).equals("34")){
  return "America Express"
 }
}

String pigLatin(String word){
  return word.substring(1)+ word.substring(0,1)+"ay";
}





  
String nycLocate(String number){
  if(number.substring(0,3))
}
  
}