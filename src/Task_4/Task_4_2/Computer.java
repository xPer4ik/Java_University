package Task_4.Task_4_2;

public class Computer {
    private final Brand brand;
    private final Memory memory;
    private final Monitor monitor;
    private final Proseccor proseccor;

    public Computer(Brand brand,Memory memory,Monitor monitor,Proseccor proseccor){
        this.brand = brand;
        this.memory = memory;
        this.monitor = monitor;
        this.proseccor = proseccor;
    }

    public Brand getBrand() {
        return brand;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Proseccor getProseccor() {
        return proseccor;
    }
    public String toString(){
        return "Computer: " + brand + "\n    " + "processor: " + proseccor + "\n    " + "memory: " + memory + "\n    " + "processor: " + proseccor;
    }
}

