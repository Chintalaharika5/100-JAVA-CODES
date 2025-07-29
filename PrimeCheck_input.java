import java.util.Scanner;
public class PrimeCheck_input {
    public static boolean isPrime(int n){
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if (n % i ==0)
                return false;
            }
            return true;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num = scanner.nextInt();
        if(isPrime(num)){
            System.out.println(num +  " is a prime.");
        } else {
            System.out.println(num +  " is not a prime.");       
        }

        
        scanner.close();
        }
}
