package willo.progress.funix.willo.progress.funix.recursion;

/**
 * Created by willo on 12/2/17.
 */
public class Factorial {
  public static long factorialWithInterative(int n) {
    long res =0;
    for (long i=0; i<= n; i++) {
      if (i ==0) {
        res =1;
        continue;
      }
      res *= i;
    }
    return res;
  }
}
