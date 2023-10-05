package Task_4.Task_4_2;

public class Processor {
    private final String model;

    Processor(String model){
        this.model = model;
    }
    @Override
    public String toString(){
        return "Proseccor: " + this.model;
    }
}
