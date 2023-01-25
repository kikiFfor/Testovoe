/**
 * Программа реализует консольное приложение "Кредитный калькулятор". Приложение должно читать из консоли
 * данные о параметрах кредита (сумма взятых в кредит денег ,ежемесячный платеж, процентная ставка, тип клиента)
 * и выводить в консоль посчитанную переплату по кредиту
 *
 * @author kikiFfor;
 * @version 2.0; от 25.01.2023
 *
 * * Добавлены классы CreditData (отвечает за хранение данных) и CreditCalculator (метод Calculate принимает
 * * Объект класса CreditData и рассчитывает переплату по кредиту)
 * * Внесены правки по оформлению кода, удален повторяющийся код в классе CreditCalculator
 *
 */

public class Main {
    public static void main(String[] args) throws ParametrsException {

        CreditData newCredit = new CreditData();

        newCredit.vvodParametrs();
        newCredit.setParametrs();

        CheckTheData.check(newCredit);

        CreditCalculator.calculate(newCredit);

    }
}
