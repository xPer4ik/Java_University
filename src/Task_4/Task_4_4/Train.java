package Task_4.Task_4_4;

public class Train extends Vehicle{
    Train(int costPerHour){
        super(costPerHour);
    }
    @Override
    public void time(int distance) {
        System.out.println("Время в пути составляет:" + distance / 250 + "ч");

    }
    @Override
    public void price(int distance){
        System.out.println("Стоимость перевозки будет составлять: " + distance/250 * costPerHour + "руб");
    }
}
