public class Main {
    public static void main(String[] args) {

        int statusQuo = 100; //  начальный счёт,
        int plus = 1100; // сумма пополнения и тп
        int bonus = 0;
        if (plus > 1000) {
            bonus = plus / 100;
        }

        System.out.println("бонус составил " + bonus + " руб.");
        int result = statusQuo + plus + bonus;
        System.out.println("Сумма на счете после пополнения " + result + " руб.");
    }
}