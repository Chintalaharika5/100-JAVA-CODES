public class Greatest_of_3nums {
    public static void main(String[] args){
        int a = 10, b = 20, c = 30;

        if(a > b && a > c){
            System.out.println("Greatest number is: " +a);
        } else if (b > a && b > c){
            System.out.println("Greatest number is: " +b);
        } else if (c > a && c > b){
            System.out.println("Greatest number is: " +c);
        } else {
            System.out.println("ALL ARE EQUAL");
        }
    }

}


