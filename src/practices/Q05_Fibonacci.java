package practices;

import java.util.Scanner;

public class Q05_Fibonacci {
    public static void main(String[] args) {
    /*
    Ask user how many fibonacci numbers he wants to see. Then type the code that prints
    these fibonacci numbers.
    Ex: if user enters 6 output will be 112358
 */
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to see : ");
  int n= input.nextInt();


  int fibo1=1;
  int fibo2=1;
        int fibonacci = 0;
        System.out.print(fibo1+" ");
        System.out.print(fibo2+" ");
        for (int i=1; i<n-1; i++){
      fibonacci=fibo1+fibo2;
      fibo1=fibo2;
      fibo2=fibonacci;

            System.out.print(fibonacci+" ");

        }









    }

}
