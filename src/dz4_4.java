import java.util.Scanner;

/**
 Написать функцию getMax которая принимает на вход два аргумента в виде чисел. А возврыщает максимальное из этих двух.
 Так же, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float)
 */
public class dz4_4 {

    public static int getMax(int x, int y){
        int max = 0;
        if (x>y) {
            max = x;
        }
        else {
            max = y;
        }
        return max;
    }
    public static float getMax(float a, float b){
        float max1 = 0;
        if (a>b) {
            max1 = a;
        }
        else {
            max1 = b;
        }
        return max1;
    }

    public static void main(String[] args) {
        System.out.println("Введите первое число int");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println("Введите второе число int");
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();

        System.out.println("Введите первое число float");
        Scanner sc2 = new Scanner(System.in);
        float a = sc2.nextFloat();

        System.out.println("Введите второе число float");
        Scanner sc3 = new Scanner(System.in);
        float b = sc3.nextFloat();

        int maxInt=getMax(x,y);
        float maxFloat = getMax(a,b);


        System.out.println("Максимальное число = " + maxInt);
        System.out.println("Максимальное число float= " + maxFloat);

    }

}
