package Task_4.Task_4_2;

public class Monitor {
    private final String resolution;

    Monitor(String resolution){
        this.resolution = resolution;
    }
    @Override
    public String toString(){
        return "Monitor: " + this.resolution;
    }
}
