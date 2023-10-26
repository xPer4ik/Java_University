package Task_11.Task_11_1;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class StartFinishData {
    public static void main(String[] args) throws ParseException {
        // Фамилия и имя
        String developerName = "Четин_Григорий";

        // Получение текущей даты и времени
        Date currentDate = new Date();

        // Дата и время получения задания
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String assignmentReceivedDateTime = "22.10.2023 10:00";

        // Преобразуем строку в объект Date
        Date ReceivedDate;
        ReceivedDate = dateFormat.parse(assignmentReceivedDateTime);


        System.out.println("Фамилия и имя разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + dateFormat.format(ReceivedDate));
        System.out.println("Текущая дата и время: " + dateFormat.format(currentDate));
    }
}