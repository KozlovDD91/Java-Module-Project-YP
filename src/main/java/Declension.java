public class Declension {
    //Склонялка + вывод результата
    public String toIncline(Calculator calculator) {
        int preLastDigit = (int) Math.floor(calculator.share) % 100 / 10;

        if (preLastDigit == 1) {
            return "рублей";
        }

        switch ((int) Math.floor(calculator.share) % 10) {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";


        }
    }
    public void showResult(Calculator calculator){

        String finalMessage = String.format("С каждого гостя %.2f %s.\nОплата карточкой?", calculator.share, toIncline(calculator));
        System.out.println(finalMessage);
    }
}

