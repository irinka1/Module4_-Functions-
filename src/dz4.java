import java.util.Scanner;
/*Write a function that counts  in the console numbers before the X number.
Arguments of the function: the number X

For example, X = 5.
Output of the program:
1
2
3
4
5*/

/**
 * Created by i on 11.07.2017.
 */
public class dz4 {
    public static void printCifra(int x) {


        if (x > 0) {
            System.out.print(x+"; ");
            printCifra(x - 1);
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        printCifra(x);
}
}
