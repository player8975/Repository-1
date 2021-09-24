package exercise1;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите код города: ");
        int num = in.nextInt();
        if (num == 905) {
            System.out.printf("Москва. Стоимость разговора: 4.15");
        }
        if (num == 194) {
            System.out.printf("Ростов. Стоимость разговора: 1.98");
        }
        if (num == 491) {
            System.out.printf("Краснодар. Стоимость разговора: 2.69");
        }
        if (num == 800) {
            System.out.printf("Киров. Стоимость разговора: 5.00");
        }
    }
}