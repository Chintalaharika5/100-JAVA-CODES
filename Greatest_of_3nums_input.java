import java.util.Scanner;
public class Greatest_of_3nums_input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number(a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number(b): ");
        int b = scanner.nextInt();
        System.out.print("Enter third number(c): ");
        int c = scanner.nextInt();

        if(a > b && a > c){
            System.out.println("Greatest number is: " +a);
        } else if (b > a && b > c){
            System.out.println("Greatest number is: " +b);
        } else if (c > a && c > b ) {
            System.out.println("Greatest number is : " +c);
        } else {
            System.out.println("ALL ARE EQUAL");
        }
        scanner.close();

    }
}
