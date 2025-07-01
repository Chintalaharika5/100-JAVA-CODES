import java.util.Scanner;

public class sum_of_numbers_range_input {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the starting nummber(a):");
        int a = scanner.nextInt();
        System.out.print("Enter the ending number(b):");
        int b = scanner.nextInt();
        int sum = 0;

        for(int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
 
        scanner.close();
    }
}