package Task_17.Task_17_2;

public class MVCEmployeeExample {
    public static void main(String[] args) {
        // Создаем модель, представление и контроллер
        Employee model = new Employee("Bob", 2.0, 20);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        // Выводим начальное состояние
        controller.updateView();

        // Меняем данные модели через контроллер
        controller.setEmployeeName("Lena");
        controller.setEmployeeHourlyRate(25.0);
        controller.setEmployeeHoursWorked(34);

        // Выводим обновленное состояние
        controller.updateView();
    }
}
