package Task_4.Task_4_4;

public abstract class Vehicle {
    protected final int costPerHour;

    Vehicle(int costPerHour){
        this.costPerHour = costPerHour;
    }

    public void time(int distance){
        System.out.println("Время в пути составляет:" + distance/30 + "ч");
    }
    public void price(int distance){
        System.out.println("Стоимость перевозки будет составлять: " + distance/30 * costPerHour + "руб");
    }


    public static void main(String [] args){
        Vehicle vehicle1 = new Auto(500);
        vehicle1.price(700);
        vehicle1.time(700);
        Vehicle vehicle2 = new Plane(7000);
        vehicle2.price(9000);
        vehicle2.time(9000);
        Vehicle vehicle3 = new Train(250);
        vehicle3.price(1500);
        vehicle3.time(1500);
        Vehicle vehicle4 = new Ship(750);
        vehicle4.price(900);
        vehicle4.time(900);

    }

}
