import java.util.Scanner;
public class Even_Odd {
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int n;
                System.out.println("Enter the number: ");
                n = sc.nextInt();
                if(n%2==0)
                {
                        System.out.println("even");
                }
                else
                {
                        System.out.println("odd");
                }
        }

}
