import java.util.Scanner;
public class PrimeCheck_GivenRange_input {
    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
             
        }   
    return true;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        
        checkPrimesInRange(start, end);
        
        scanner.close();
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
}
