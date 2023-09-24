package Task_3.Task_3_3;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Employee first = new Employee("Alex Mitin", 70000);
        Employee second = new Employee("Roma Fox", 120000);
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(first);
        list.add(second);
        Report.generate_Report(list);
    }
}