public class Main {
    public static void main(String[] args){
        CreditPaymentService creditPaymentService = new CreditPaymentService();
        double monthPaymentOneYear = creditPaymentService.calculate(12, 1_000_000, 9.99);
        System.out.println("Ежемесячный платеж ипотека 1 год: " + monthPaymentOneYear);
        double monthPaymentTwoYear = creditPaymentService.calculate(24, 1_000_000, 9.99);
        System.out.println("Ежемесячный платеж ипотека 2 года: " + monthPaymentTwoYear);
        double monthPaymentTreeYear = creditPaymentService.calculate(36, 1_000_000, 9.99);
        System.out.println("Ежемесячный платеж ипотека 3 года: " + monthPaymentTreeYear);
    }
}
