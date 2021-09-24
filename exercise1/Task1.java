package exercise1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        int last_num = num % 10;
        System.out.printf("Последняя цифра этого числа: %d \n", last_num);
        in.close();
    }
}