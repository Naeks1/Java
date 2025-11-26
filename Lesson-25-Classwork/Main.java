class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
  String msg = "";
  String encodedMsg = "";
  String decodedMsg = "";
  msg = Input.readfile("Original.txt");
  encodedMsg = encode(msg);
  Input.writefile("Encoded.txt", encodedMsg);
  decodedMsg = decode(encodedMsg);
  Input.writefile("Decoded.txt", decodedMsg);

    
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.
String encode(String thing){
  String bld= "";
  for (int i=0; i<thing.length(); i+=3){
    char ch = thing.charAt(i);
    int ascii = (int)ch;
    ch=(char)(ascii+3);
    bld+=ch;
  }
  return bld;
  }
  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.
String decode(String thing){
  String bld= "";
  for (int i=0; i<thing.length(); i-=3){
    char ch = thing.charAt(i);
    int ascii = (int)ch;
    ch=(char)(ascii-3);
    bld+=ch;
  }
  return bld;
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}