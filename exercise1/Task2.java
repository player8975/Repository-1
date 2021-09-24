package exercise1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int num = in.nextInt();
        int n1 = num / 100;
        int n2 = (num % 100) / 10;
        int n3 = num % 10;
        int sum = n1 + n2 + n3;
        System.out.printf("Сумма цмфр этого числа равна: %d \n", sum);
        in.close();
    }
}