import java.util.Scanner;

public class Min_Max_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int n3 = sc.nextInt();
        System.out.println("Enter the fourth number: ");
        int n4 = sc.nextInt();
        System.out.println("Enter the fifth number: ");
        int n5 = sc.nextInt();

        int max = n1;
        int min = n1;

        if (n2 > max) {
            max = n2;
        } 
        if (n3 > max) {
            max = n3;
        }
        if (n4 > max) {
            max = n4;
        }
        if (n5 > max) {
            max = n5;
        }

        if (n2 < min) {
            min = n2;
        }
        if (n3 < min) {
            min = n3;
        }
        if (n4 < min) {
            min = n4;
        }
        if (n5 < min) {
            min = n5;
        }

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);

    }
}
