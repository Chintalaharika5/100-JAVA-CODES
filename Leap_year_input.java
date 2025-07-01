import java.util.Scanner;
public class Leap_year_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (year):" );
        int year = scanner.nextInt();
        if(year % 4 == 0 && (year %100 != 0 || year % 400 == 0)){
            System.out.println("IS LEAP YEAR " + year);
        } else { 
            System.out.println("IS NOT A LEAP YEAR" + year);
        }
        scanner.close();

    
    }
}
