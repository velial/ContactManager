package info.velial.support.domain;

/**
 * Created by Igor on 18.03.14.
 */
public class PaymentStatus {
    public static String getStringStatus(Integer status)
    {
        String result = "";
        switch (status)
        {
            case 0: result = "Новый"; break;
            case 1: result = "Обрабатывается"; break;
            case 2: result = "Зарегистрирован"; break;
            case 3: result = "Активирован"; break;
            case 4: result = "Ошибка"; break;
            case 5: result = "Отменяется"; break;
            case 6: result = "Отменен"; break;
            case 7: result = "Проверяется"; break;
            case 8: result = "Отложен"; break;
            case 9: result = "Остановлен"; break;
            default: result = "Неизвестен"; break;
        }
        return result;
    }
}
