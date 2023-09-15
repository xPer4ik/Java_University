package Task_2.Task_2_5;

import java.util.ArrayList;

public class DogKennel {
    private final ArrayList<Dog>dogs = new ArrayList<>();

    public static void main(String[] args){ // тестирование работы класса собака
        DogKennel kennel = new DogKennel();
        Dog Bob = new Dog("Bob",5);
        Dog Misha = new Dog("Misha",8);
        kennel.dogs.add(Bob);
        System.out.println(Misha.getAge());
        System.out.println(Misha.getNickname());
        System.out.println(Misha.ageToHuman());
        Misha.setAge(1);
        Misha.setNickname("Vova");
        kennel.dogs.add(Misha);

        for(Dog dog:kennel.dogs){ // вывод всех собак и информации о них
            System.out.println(dog.toString());
        }
    }
}
