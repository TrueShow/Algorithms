package Lesson_1;

public class Avarage {
    public static void main(String[] args) {
        int[] arr = {22, 5, 8, 34, 11, 7, 33, 10};
        System.out.println(searchAverage(arr));
    }

    public static double searchAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / (double) arr.length;

    /* Суммируем каждый элемент массива - в нашем случае это уже 8 операций + 1 на выделенние переменной суммы
        + Операция на деление. Всего 10 операций для массива в 8 элементов.
    */
    }
}
