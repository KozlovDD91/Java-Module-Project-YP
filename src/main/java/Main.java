// dev branch for Y.Practicum
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Counter counter = new Counter();
        Survey survey = new Survey();
        Product product = new Product();
        counter.startCounter();
        survey.surveyCustomer(product,calculator);
        calculator.shareSum(counter);


    }
}











