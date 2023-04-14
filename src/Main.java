public class Main {
    public static void main(String[] args) {

        int q = 1000; // начальная сумма счета
        int w = 12000; // сумма пополнения счета
        double r = 0.01; // коэффициент бонуса
        double b = (int) w * r; // сумма с бонусом
        int i = q + w + (int) b;
        System.out.println("Ваш баланс равен:"); System.out.println(i);


    }
}