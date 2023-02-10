// dev branch for Y.Practicum

public class Main {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Counter counter = new Counter();
        Survey survey = new Survey();
        Product product = new Product();
        Declension declension = new Declension();
        counter.startCounter();
        survey.surveyCustomer(product, calculator);
        calculator.shareSum(counter);
        declension.showResult(calculator);


    }
}











