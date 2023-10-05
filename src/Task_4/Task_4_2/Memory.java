package Task_4.Task_4_2;

public class Memory{
    private final String capacity;

    Memory(String capacity){
        this.capacity = capacity;
    }
    @Override
    public String toString(){
        return "Memory: " + this.capacity;
    }
}
