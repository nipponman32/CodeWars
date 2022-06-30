public class DnaStrand {
  public static String makeComplement(String dna) {
    
    
    if (dna == null || dna.length()==0) {
      return "";
    }
    
    char[] init_chars = dna.toCharArray();
    char[] end_chars = new char[init_chars.length];
    int index = 0;
    
    for(char c : init_chars){
      
      switch(c){
          case 'A':
          end_chars[index]='T';
          break;
          case 'T':
          end_chars[index]='A';
          break;
          case 'G':
          end_chars[index]='C';
          break;
          case 'C':
          end_chars[index]='G';
          break;
      }
      index++;  
    }
     // String ret_str = end_chars
      return(new String(end_chars));    
  }
}
