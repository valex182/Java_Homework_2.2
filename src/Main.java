public class Main {
    public static void main(String[] args) {

        int startBalance = 100;
        int refill = 1280;

        int bonus;
        int finalBalance;
        bonus = refill / 100;
        boolean x = refill > 1000;
        if (x) {
            finalBalance = startBalance + refill + refill / 100;
            System.out.println("Ваш баланс " + finalBalance + " рублей " + "(Из них " + bonus + " бонусных рублей)");
        } else {
            finalBalance = startBalance + refill;
            System.out.println("Ваш баланс " + finalBalance + " рублей. (Бонусных рублех начислено не было)");
        }
    }
}





