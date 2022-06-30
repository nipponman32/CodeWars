public class FindOutlier{
  
  static int find(int[] integers){
    //Create an array of booleans to tag each elem in integers
    boolean[] even_array=new boolean[integers.length];
    int odd_one=-1;
    
    //for every elem in integers determine if the elem is even
    for(int i = 0; i < integers.length; i++){
      even_array[i]=isEven(integers[i]);    
    }
    
    //determine if the majority of the array is even or odd
    //if it is even, assign the odd value too the return var
    if(chirality(integers)=="even"){
      for(int i = 0;i< even_array.length;i++){
        if(isEven(integers[i])==true){
          continue;
        }else{
          odd_one=integers[i];
        }            
      }
    }//else if the chirality of the array is odd, assign the return value to the even var
    else if(chirality(integers)=="odd"){
      for(int i = 0;i< even_array.length;i++){
        if(isEven(integers[i])==false){
          continue;
        }else{
          odd_one=integers[i];
        }            
      }
    }
        
    return odd_one; 
  }
  
  //Determine the majority of the values, even or odd
  //if majority are even then return "even" else return "odd"
  static String chirality(int[] arr){
    
    int even_count = 0;
    int odd_count = 0;
    
    for(int i = 0; i < arr.length; i++){
      if(isEven(arr[i])){
        even_count++;
      }else{
        odd_count++;
      }
    }
    
    if(even_count>odd_count){
      return "even";
    }else{
      return "odd";
    }
  }
  
  //Determine is a particular number is even or odd
  static boolean isEven(int val){
    return(val%2==0);    
  }
}
