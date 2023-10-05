package Task_4.Task_4_2;

public class Computer {
    private final Brand brand;
    private final Memory memory;
    private final Monitor monitor;
    private final Processor processor;

    public Computer(Brand brand, Memory memory, Monitor monitor, Processor processor){
        this.brand = brand;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    public String toString(){
        return "Computer: " + this.brand + "\n    " + this.memory + "\n    " + this.monitor + "\n    " + this.processor;
    }


    public static void main(String [] args){
        Computer hpPro = new Computer(Brand.hp, new Memory("1024Gb"), new Monitor("FullHd"),new Processor("i5-13400F"));
        Computer asus1020 = new Computer(Brand.asus, new Memory("512Gb"), new Monitor("2K"),new Processor("Razen7"));
        System.out.println(hpPro);
        System.out.println(asus1020);
    }
}

