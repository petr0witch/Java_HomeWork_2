import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Second {
    public static void main(String[] args) throws IOException {
        //2) Реализуйте алгоритм сортировки пузырьком числового массива,
        // результат после каждой итерации запишите в лог-файл.
        //1 3 4 2
        //1 3 2 4
        //1 2 3 4

        int[] arr = {1, 3, 4, 2};

        FileWriter fw = new FileWriter("log.txt");
        try {
            fw = new FileWriter("log.txt");
        } catch (Exception e){
            System.out.println("Ошибка создания лог-файла: " + e.getMessage());
        }

        for (int i = 0; i < (arr.length - 1); i++) {
            try {
                fw.write("Итерация " + (i + 1) + ": " + Arrays.toString(arr) + "\n");
            } catch (Exception e) {
                System.out.println("Ошибка записи в лог-файл: ");
            }

            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        fw.close();
    }
}
