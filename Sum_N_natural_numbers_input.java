import java.util.Scanner;

public class Sum_N_natural_numbers_input {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter N Natural number:");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum +=i;
        }
        System.out.println(sum);
        scanner.close();

    }    
}
