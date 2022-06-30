import java.lang.Math;

class Kata {
  public static String getMiddle(String word) {
    System.out.println(isEven(word));
    String ret_str="";
    double len = Math.round((double)(word.length())/2.0);
    
    System.out.println(""+len);
    
    if(isEven(word)){
      ret_str=word.substring(word.length()/2-1,(word.length()/2)+1);
    }else{
      ret_str=word.substring((int)len-1,(int)len);
    }
    
    return ret_str;
    
  }
  
  public static boolean isEven(String w){
    if(w.length()%2==0){
      return true;
    }else{
      return false;
    }
  }
}
