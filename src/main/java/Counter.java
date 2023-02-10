import java.util.Scanner;
public class Counter {
    // Записывет количество гостей. Проверка значений.
    Scanner scanner = new Scanner(System.in);
    //поле
    int guests;

    public void startCounter() {
        System.out.println("На скольких человек необходимо разделить счёт?");
        while (true) {
            if (scanner.hasNextInt()) {
                guests = scanner.nextInt();
                if (guests == 1) {
                    System.out.println("Тут нечего делить! Попробуйте снова: ");
                } else if (guests < 1) {
                    System.out.println("Некорректное значение для подсчёта. Попробуйте снова: ");
                } else {
                    break;
                }
            } else {
                System.out.println("Введёное значение не является числом.");
                scanner.next();
            }
        }
    }
}
