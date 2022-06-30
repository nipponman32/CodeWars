import java.lang.Math;

public class Solution {

public static int zeros(int n) {
    int z=0;
    for(int k=1;k<log5(n);k++){
      z += n/Math.pow(5,k);
    }
    
    return z;
  }
  
  public static double log5(int t){
    return Math.log((double)t)/Math.log(5.0);
  }
}
