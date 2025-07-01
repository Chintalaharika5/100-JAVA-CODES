import java.util.Scanner;

public class Even_or_odd_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A number:");
        int num = scanner.nextInt();
        if (num % 2 ==0){
            System.out.println("EVEN");
        } else{ 
            System.out.println("ODD");

        }
        scanner.close();
    }
}
    

