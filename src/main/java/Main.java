// dev branch for Y.Practicum
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        counter();
        calculator();
// я вернулся к тому, с чем обратился в пачку, вносимые изменения делали только хуже
        // Есть подозрение, что у меня будут проблемы с областью видимости при использовании переменных
        // из метода calculator
        // абсолютно не понимаю как реализовать класс калькулятор с логикой подсчёта, поэтому делаю как получается/
    }

    public static void counter() {
        Scanner scanner = new Scanner(System.in);
        int numOfPersons;
        System.out.println("На скольких человек необходимо разделить счёт?");
        while (true) {
            if (scanner.hasNextInt()) {
                numOfPersons = scanner.nextInt();
                if (numOfPersons == 1) {
                    System.out.println("Тут нечего делить! Попробуйте снова: ");
                } else if (numOfPersons < 1) {
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

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        String productList = "Добавленные товары: +\n";
        String productName;
        double price;
        double sum = 0;

        System.out.println("Введите название товара:");

        while(true) {
           if( scanner.hasNextLine()) {
               productName = scanner.nextLine();
               if(productName.equalsIgnoreCase("Завершить")) {
                   break;
               } else {
                   productList += productName +"\n" ;
               }
               System.out.println("Введите стоимость товара: ");

               while (true) {
                   if (scanner.hasNextDouble()){
                       price = scanner.nextDouble();
                       if(price >= 0) {
                           sum += price;
                           System.out.println("Товар успешно добавлен!");
                           break;
                       } else if (price < 0) {
                           System.out.println("Введёная цена некорректна, попробуйте снова.");
                       } else {
                           System.out.println("Это не число. Попробуйте снова.");
                       }
                   }
               }
                }
            }
        }
    }

