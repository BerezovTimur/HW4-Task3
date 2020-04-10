public class CreditPaymentService {
    public double calculate (int month, double credit, double yearPercent){
        double monthPercent = yearPercent/12/100;
        double tmp = Math.pow((1+monthPercent), month);
        double monthPayment = (credit*monthPercent*tmp)/(tmp-1);
        return monthPayment;
    }
}
