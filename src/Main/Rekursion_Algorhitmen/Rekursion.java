package Main.Rekursion_Algorhitmen;

public class Rekursion {

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
    
    public static int Quersumme(int Value){
      int x = Value;
      
      if(x%10 == 0){
        return 0;
      }
         
      return x%10+Quersumme(x/10);
    }

    public static double Potenzenberechnen(double basis, int exponent){
     double x = basis;
     if(exponent == 0){
      return 1;
     }
     else if(exponent > 0){
      return x * Potenzenberechnen(x,exponent-1);
     }
     else{
      return 1/ Potenzenberechnen(x,-exponent);
    }

    }
    
  public static boolean Palendorm(String Palendorm){
    if(Palendorm.length() <= 1){
      return true;
    }
    else if(Palendorm.charAt(0)!= Palendorm.charAt(Palendorm.length()-1)){
    return false;
    }
    else{
      return Palendorm(Palendorm.substring(1, Palendorm.length()-1));
    }
  }  

  public static int anzahlbuchstabe(String name, char buchstabe){
  int zahler = 0;
  if(name.length() <= 1 && name.charAt(0) != buchstabe){
  return 0;
  }
  if (name.length() <= 1 && name.charAt(0) == buchstabe) {
    return 1;
  }
  else{
    if( name.charAt(0) == buchstabe){
      zahler++;
      return zahler + anzahlbuchstabe(name.substring(1, name.length()), buchstabe);
    }
    else{
      return anzahlbuchstabe(name.substring(1, name.length()), buchstabe);
    }
  }  
  }

  
    
}