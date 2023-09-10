package Task_2.Task_2_4;


import java.util.ArrayList;

public class Shop {
    private final ArrayList<String> list = new ArrayList<>();

    public void addComputer(String name){
        list.add(name);
    }
    public void removeComputer(String name){
        list.remove(name);
    }
    public boolean containsComputer(String name){
        return list.contains(name);
    }
}
