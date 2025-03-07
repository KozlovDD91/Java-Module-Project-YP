import java.util.ArrayList;

public class Calculator {
    //Calculator описывает логику записи покупок и их стоимости
    //поля
    ArrayList<String> fullList = new ArrayList<>();
    double sum;
    double share;

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
        share = sum / counter.guests;
    }
}


