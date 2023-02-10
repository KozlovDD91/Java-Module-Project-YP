import java.util.ArrayList;

public class Calculator {
    //поля
    ArrayList<String> fullList = new ArrayList<>();
    double sum;


    //методы
    void addToList(Product product) {
        fullList.add("\n" + product.name + "\n");
    }

    public void showFullList() {
        System.out.println("Вот, что вы купили: " + fullList);
    }

    public void sumAddition(Product product) {
        sum += product.price;
    }

    public void shareSum(Counter counter) {
        double share = sum / counter.guests;
        String rub = null;
        int y = (int) (share % 10);
        if (y == 0 || y > 4) {
            rub = "рублей";
        }
        if (y > 1) {
            rub = "рубля";
        }

            String finalMessage = String.format("С каждого гостя %.2f %s.Оплата карточкой?", share, rub);
            System.out.println(finalMessage);
    }
}
