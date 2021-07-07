package Lesson_1;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {22, 5, 8, 34, 11, 7, 33, 10};
        System.out.println(minElement(arr));
    }

    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        /* Мы сравниваем первый элемент с каждым следующим +
         дополнительные действия, где новый минимум записываем и потом уже его сравниваем со следующим элементами.
         Операции: 1) Записать минимум - 1 операция 2) Сравнить со всеми элементами - 7 операций 3) Записывать новый мимнимум,
         при худшем случае это еще 7 операций - итого 15 операций с данным массивом.
         */
        return min;
    }
}
