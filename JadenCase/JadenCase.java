public class JadenCase {

  public String toJadenCase(String phrase) {
    // TODO put your code below this comment
    
    //check for null or empty string
    if(phrase==null||phrase.equals("")){
      return null;
    } //If the string is non-null begin capitalization
    else{
      //create an array of individual words to focus on each word in String
      String[] words = phrase.split(" ");
      String return_string = new String("");
      
      //For every word in the string Array, create an array of characters
      //For the first character in every array of characters, assign it its uppercase char value
      //Create the newly capitalized word from this transformed data
      
      for(String word : words){
        char[] chars = word.toCharArray();
        chars[0] = Character.toUpperCase(word.charAt(0));
        word=new String(chars);
       
        return_string+=word+" ";
      }
      
      //remove any trailing spaces and return completed Jaden Case String
      
      return_string=return_string.trim();
      return return_string;
    }
  }

}
