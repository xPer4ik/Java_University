package Task_20.Task_20_2;

public class GenericClass2<T, V, K> {
    private T firstValue;
    private V secondValue;
    private K thirdValue;

    public GenericClass2(T firstValue, V secondValue, K thirdValue) {
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
        GenericClass2<Integer, String, Double> myGenericObject = new GenericClass2<>(10, "Hello", 3.14);
        myGenericObject.displayClassNames();
    }
}