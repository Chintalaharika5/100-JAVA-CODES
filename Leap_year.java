public class Leap_year {
    public static void main(String[] args){
        int year = 2020;
        if(year % 4 == 0 && (year %100 != 0 || year % 400 == 0)){
            System.out.println("IS LEAP YEAR " + year);
        } else { 
            System.out.println("IS NOT A LEAP YEAR" + year);
        }
        }
}

