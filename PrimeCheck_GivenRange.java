public class PrimeCheck_GivenRange {
    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
             
        }   
    return true;
}
 public static void checkPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            } else {
                System.out.println(i + " is not a prime number.");
            }
        }
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        checkPrimesInRange(start, end);
    }
}
