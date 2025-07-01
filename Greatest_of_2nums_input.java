import java.util.Scanner;

public class Greatest_of_2nums_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number(a): ");
        int a = scanner.nextInt();
        System.out.println("Enter second number(b): ");
        int b = scanner.nextInt();
        if(a > b){
            System.out.println("Greatest number is: " +a);
        } else if (b > a ) {
            System.out.println("Greatest number is: " +b);
        } else {
            System.out.println("Both numbers are equal");

              }
            scanner.close();

        }
}
