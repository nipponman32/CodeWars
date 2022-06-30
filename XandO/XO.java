public class XO {
  
  public static boolean getXO (String str) {
    
    if(str==null){
      return false;
    }else if(str==""){
      return true;
    }   
    
    char[] chars = str.toCharArray();
    int x_count = 0, o_count = 0;
    
    for(char c : chars){
      if (c=='X'||c=='x'){
        x_count++;
      }else if(c=='O'||c=='o'){
        o_count++; 
      } 
    }
    
    return (x_count==o_count);
    
  }
}
