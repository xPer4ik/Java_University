package Task_4.Task_4_3;

public class Person {
    private String fullName;
    private int age;



    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    Person(){}

    public void move(){
        System.out.printf("Через %s лет он переедет в собственную квартиру%n", this.age + 5);
    }
    public void talk(){
        System.out.printf("Такой-то %s говорит%n",this.fullName);
    }

    public static void main(String [] args){
        Person person1 = new Person();
        person1.setAge(25);
        person1.setFullName("Bob");
        Person person2 = new Person("Tom",30);
        System.out.println("Первый человек:");
        person1.move();
        person1.talk();
        System.out.println("Второй человек:");
        person2.move();
        person2.talk();
    }
}
