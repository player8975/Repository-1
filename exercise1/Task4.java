package exercise1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        if (num > 0) {
            num +=1;
        } else {
            if (num == 0) {
                num = 10;
            }
            if (num < 0) {
                num -=2;
            }
        }
        System.out.println(num);
        in.close();
    }
}