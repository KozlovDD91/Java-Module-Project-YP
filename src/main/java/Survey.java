import java.util.Scanner;

public class Survey {
    public void surveyCustomer(Product product, Calculator calculator) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите наименование товара: ");
        while (sc.hasNextLine()) {
            product.name = sc.nextLine();
            if (product.name.equalsIgnoreCase("Завершить")) {
                calculator.showFullList();
                break;
            } else {
                calculator.addToList(product);
            }
            System.out.println("Товар " + product.name + " успешно добавлен!");

            while (true) {
                System.out.println("Введите стоимость товара в формате \"РР,КК\":");
                if (sc.hasNextDouble()) {
                    product.price = sc.nextDouble();

                    if (product.price < 0) {
                        System.out.println("Некорректная сумма");

                    } else if (product.price >= 0) {
                        calculator.sumAddition(product);
                        System.out.println("Товар успешно добавлен!");
                        System.out.println("Введите следующий товар или завершите программу");
                        sc.nextLine();
                        break;
                    }
                } else {
                    System.out.println("Введённое значение не является числом");
                    sc.nextLine();
                }
            }
        }
    }
}

