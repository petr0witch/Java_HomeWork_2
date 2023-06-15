import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Four_Calculator {
    public static void main(String[] args) throws IOException {
//        4) К калькулятору из предыдущего ДЗ добавить логирование.
//        3+4=7
//        1+2=3
//        6/3=2

        FileWriter writer = new FileWriter("Calculator.txt", true);
        try {
            writer = new FileWriter("Calculator.txt", true);
        } catch (Exception e){
            System.out.println("Ошибка создания лог-файла: ");
        }


        System.out.println("Введите первое число: ");
        Scanner sc1 = new Scanner(System.in);
        double first = sc1.nextInt();
        System.out.println("Введите второе число: ");
        Scanner sc2 = new Scanner(System.in);
        double second = sc2.nextInt();
        System.out.println("Введите операцию для этих чисел:\n 1: +\n 2: -\n 3: *\n 4: / ");
        Scanner sc3 = new Scanner(System.in);
        String operation = sc3.next();

        try {
            String res = first + " " + operation + " " + second + " = " + (first + second) + "\n";
            if (operation.equals("+")) writer.write(res);
            if (operation.equals("-")) writer.write(res);
            if (operation.equals("*")) writer.write(res);
            if (operation.equals("/")) {
                if (second != 0) writer.write(res);
                else writer.write("Делить на 0 нельзя :с" + "\n");
            }
        } catch (Exception e) {
            System.out.println("Ошибка записи в лог-файл: \n");
        }
        writer.close();

    }
}
