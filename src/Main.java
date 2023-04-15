public class Main {
    public static void main(String[] args) {

        int initialInvoiceAmount = 1000; // начальная сумма счета
        int depositAmount = 13000; // сумма пополнения счета
        double bonusCoefficient = (depositAmount > 1000) ? 0.01 : 0;
        double amountWithBonus = (int) depositAmount * bonusCoefficient; // сумма с бонусом
        System.out.println("Сумма бонуса равна:");
        System.out.println(amountWithBonus);
        int balance = initialInvoiceAmount + depositAmount + (int) amountWithBonus;
        System.out.println("Ваш баланс равен:");
        System.out.println(balance);


    }
}