import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Scanner используем
         * есть кофе и вы можете выбрать размер small, medium, large
         * после выбора должно выйти сообщение - какой объем у Вас
         * например small - 200
         * если у нас такого размера нет - Exception
         * <p>
         *  Scanner колдонобуз
         * кофе бар жана сиз small, medium, large өлчөмүн тандай аласыз
         * * тандалгандан кийин жооп  - сизде кандай көлөм бар
         * * мисалы кичинекей - 200
         * бизде андай колом жок болсо - exception
         */

        System.out.println("Choose the size of coffee :)");
        try {
            coffeeMethod();
        } catch (IllegalArgumentException e) {
            System.out.println("Oops, this size does not exist");
        }

    }
    public static void coffeeMethod() {
        Scanner scanner = new Scanner(System.in);
        Coffee coffee = Coffee.valueOf(scanner.nextLine().toUpperCase());

        switch (coffee) {
            case SMALL -> Coffee.SMALL.size();
            case MEDIUM -> Coffee.MEDIUM.size();
            case LARGE -> Coffee.LARGE.size();
        }
    }
}