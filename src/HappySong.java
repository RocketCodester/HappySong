/* 
   10/6/14  
   JDK 1.7
   Print "If You're Happy and You Know It" song  using a method 
   Print quoted words and pass in arguments to the method
*/
public class HappySong {
    public static void main(String[] args) {
        happyVerse("clap your hands", "clap clap");
        happyVerse("stomp your feet", "stomp stomp");
        happyVerse("shout \"Hurray!\"", "hoo-ray! hoo-ray!");
    }
    public static void happyVerse(String action, String sound){
      System.out.println("If you're happy and you know it, " +action+"("+sound+")"
               +"\nIf you're happy and you know it, "+action+"("+sound+")"
               +"\nIf you're happy and you know it, then your face will surely show it"
               +"\nIf you're happy and you know it, "+action+"("+sound+")"+"\n");
    }
}
