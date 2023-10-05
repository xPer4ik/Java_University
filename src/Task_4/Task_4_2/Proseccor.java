package Task_4.Task_4_2;

public class Proseccor {
    private final String model;

    Proseccor(String model){
        this.model = model;
    }
    @Override
    public String toString(){
        return "Proseccor: " + this.model;
    }
}
