/**
 * Класс отвечает за обработку данных, метод Calculate() принимает объект
 * класса CreditData и производит необходимые вычисления
 */
public class CreditCalculator {

    public static void calculate(CreditData credit) {

        float initialDebt = credit.amountOfCredit;
        float paidToTheBank = 0f;
        float overpayment;

        //Начисление процентов перед первым платежом для категории "human"
        if (credit.typeOfClient.equals("human")) {
            credit.amountOfCredit *= (1f + credit.percentageRate / 100f);
        }

        for (int i = 1; credit.amountOfCredit >= credit.monthlyPayment; i++) {
            credit.amountOfCredit -= credit.monthlyPayment;
            paidToTheBank += credit.monthlyPayment;

            if (i % 12 == 0) {
                credit.amountOfCredit *= (1f + credit.percentageRate / 100f);
            }
        }

        paidToTheBank += credit.amountOfCredit;
        overpayment = paidToTheBank - initialDebt;

        System.out.println("// переплата составит: " + overpayment
                + "\n// общая сумма к оплате: " + paidToTheBank);
    }
}
