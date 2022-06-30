import java.util.Arrays;

public class Kata {
  public static String highAndLow(String numbers) {
    String[] parts = numbers.split(" ");
    String ret_str="";
    int[] converted_nums = new int[parts.length];
    
    for(int i=0;i<converted_nums.length;i++){
      converted_nums[i] = Integer.parseInt(parts[i]);
    }
    
    Arrays.sort(converted_nums,0,converted_nums.length);
    
    ret_str=""+converted_nums[converted_nums.length-1]+" "+converted_nums[0];
        
    return ret_str;
  }
}
