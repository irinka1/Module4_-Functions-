import java.util.Scanner;

/**
 Overload the function drawRectangle (task 2) in such a way that it could only take in the input one parameter (the width of the square)
 and draw a square with equal sides For example 2 Output program: + + + + For example 3 Output program: + + + + + + + + + +
 */
public class dz4_3 {
    public static void drawRectangle(int x) {

        if (x > 0) {
            System.out.print("+");
            drawRectangle(x - 1);
        }

    }

    public static void drawRectangle(double x) {
        System.out.print("+");
        for (int i = 2; i < x; i++) {
            System.out.print(" ");
        }
        System.out.println("+");


    }
    public static void main(String[] args) {
        System.out.println("Enter the length of the side of the square");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();


        drawRectangle(x);
        System.out.println();


        if(x>2){
            for(int i=2; i < x; i++){
                drawRectangle(x);

                System.out.println();
            }   }
        drawRectangle(x);
    }
}
