class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	String print = "Bye";
    System.out.println(print);
  }
   
    double FtoC(double fahrenheit){
		return (fahrenheit-32)/1.8;
	}
  
    double sphereVolume(double v){
		return (4.0 / 3.0)*Math.PI*Math.pow(v,3);
	}
 
    double coneVolume(double c, double r){
		return Math.PI*Math.pow(r,2)*(c/3.0);
	}

	double distance(double x1,double x2,double y1,double y2){
		return Math.sqrt(Math.pow(x2 - x1,2)+ Math.pow(y2-y1,2));
	}
}