class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}

void init(){
  Car car1= new Car("Tesla","Black","Model X", 2009, 1);
  Car car2= new Car("Tesla","White","Model S", 2020, 2);

car1.honk();
car2.honk();

}