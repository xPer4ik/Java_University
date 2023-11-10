package Task_20.Task_20_3;

import java.io.Serializable;



public class GenericClass3<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T firstValue;
    private V secondValue;
    private K thirdValue;

    public GenericClass3(T firstValue, V secondValue, K thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }

    public K getThirdValue() {
        return thirdValue;
    }

    public void displayClassNames() {
        System.out.println("Class type of firstValue: " + firstValue.getClass().getName());
        System.out.println("Class type of secondValue: " + secondValue.getClass().getName());
        System.out.println("Class type of thirdValue: " + thirdValue.getClass().getName());
    }

    public static void main(String[] args) {
        // Пример использования
        Animal animal = new Animal("Lion");
        GenericClass3<Integer, Animal, Double> myGenericObject = new GenericClass3<>(10, animal, 3.14);
        System.out.println(myGenericObject.secondValue.getName());
        System.out.println("    "+myGenericObject.getFirstValue());
        System.out.println("    "+myGenericObject.getSecondValue());
        System.out.println("    "+myGenericObject.getThirdValue());
        myGenericObject.displayClassNames();
    }
}
