/**
 * Класс отвечает за обработку данных, метод Calculate() принимает объект класса CreditData и
 * производит необходимые вычисления
 */
public class CreditCalculator {

    public static void calculate(CreditData credit) {

        float nachalniyDolg = credit.summaCredita;
        float viplachenoBanku = 0f;
        float pereplata;

        //Начисление процентов перед первым платежом для категории "human"
        if (credit.typeOfClient.equals("human")) {
            credit.summaCredita *= (1f + credit.procent / 100f);
        }

        for (int i = 1; credit.summaCredita >= credit.egemesyachniyPlatej; i++) {
            credit.summaCredita -= credit.egemesyachniyPlatej;
            viplachenoBanku += credit.egemesyachniyPlatej;

            if (i % 12 == 0) {
                credit.summaCredita *= (1f + credit.procent / 100f);
            }

        }

        viplachenoBanku += credit.summaCredita;
        pereplata = viplachenoBanku - nachalniyDolg;

        System.out.println("// переплата составит: " + pereplata + "\n// общая сумма к оплате: " + viplachenoBanku);

    }

}
