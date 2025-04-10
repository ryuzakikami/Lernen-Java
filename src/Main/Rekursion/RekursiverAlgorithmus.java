package Main.Rekursion;

public class RekursiverAlgorithmus {

    public static int fib(int n) {
      if(n == 0 || n == 1){
        return 0;
      }
      else{
        return fib(n-1) +fib(n-2);
      }
    }  
    

    public static int fakultaet(int n){
     if(n == 0 || n == 1){
     return 1;
     }
     else{  
     return n*fakultaet(n-1);
     }
    }


    public static String Reverse(String s){
       if (s.length() <= 1) {
        return s;
       }
       return s.charAt(s.length()-1) + Reverse(s.substring(0, s.length()-1));
    }
}

