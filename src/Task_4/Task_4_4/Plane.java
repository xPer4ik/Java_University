package Task_4.Task_4_4;

public class Plane extends Vehicle{
    Plane(int costPerHour) {
        super(costPerHour);
    }
    @Override
    public void time(int distance) {
        System.out.println("Время в пути составляет:" + distance / 1000 + "ч");

    }
    @Override
    public void price(int distance){
        System.out.println("Стоимость перевозки будет составлять: " + distance/1000 * costPerHour + "руб");
    }
}
