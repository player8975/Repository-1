package exercise1;

public class Task8 {
    public static void main(String[] args) {
        int m[] = new int[] {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
        int max = -999;
        int sum_p = 0;
        int sum_cho = 0;
        int positive_number = 0;
        double sum_arithmetic = 0;
        double count_arithmetic = 0;

        for (int i = 0; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        System.out.printf("Максимальное значение: %d \n", max);

        for (int i = 0; i < m.length; i++) {
            if (m[i] > 0) {
                sum_p += m[i];
                positive_number += 1;
            }
        }
        System.out.printf("Сумма положительных элементов: %d \n", sum_p);


        for (int i = 0; i < m.length; i++) {
            if (m[i] < 0 && m[i] % 2 == 0) {
                sum_cho += m[i];
            }
        }
        System.out.printf("Сумма четных отрицательных элементов: %d \n", sum_cho);

        System.out.printf("Количество положительных элементов: %d \n", positive_number);

        for (int i = 0; i < m.length; i++){
            if (m[i] < 0){
                sum_arithmetic += m[i];
                count_arithmetic += 1;
            }
        }
        sum_arithmetic = sum_arithmetic / count_arithmetic;
        System.out.println("Среднее арифметическое отрицательных элементов: ");
        System.out.println(sum_arithmetic);
    }
}