import java.util.Scanner;

/**
 Write the function drawRectangle which draws a rectangle from the symbols '+'
 Function arguments: width of a rectangle in symbols, height of a rectangle in symbols
 For example 3 to 2 Output program: + + + + + +
 */
public class dz4_2 {
    public static void drawRectangle1(int x) {

        if (x > 0) {
            System.out.print("+");
            drawRectangle1(x - 1);
        }
    }

    public static void drawRectangle2(int x) {
        System.out.print("+");
        for (int i = 2; i < x; i++) {
            System.out.print(" ");
        }
        System.out.println("+");

    }
    public static void main(String[] args) {
        System.out.println("Enter the width of the rectangle");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Enter the height of the rectangle");
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();

        drawRectangle1(x);
        System.out.println();

        if(y>2){
            for(int i=2; i < y; i++){
                drawRectangle2(x);
            }}
        drawRectangle1(x);
    }}
