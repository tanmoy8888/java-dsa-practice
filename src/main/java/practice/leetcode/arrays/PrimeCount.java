package practice.leetcode.arrays;

/**
 *  Leetcode :  204. Count Primes
 */
public class PrimeCount {
    public static void main(String[] args) {
        System.out.println("countPrimes(10) = " + countPrimes(10));
    }

    public static int countPrimes(int n) {
       if(n == 0 || n ==1) return  0;
       else {
           int count = 0;
           for (int i = 2; i < n; i++) {
               if(!(i%2==0)){
                   count++;
               }
           }
           return count;
       }
    }
}
