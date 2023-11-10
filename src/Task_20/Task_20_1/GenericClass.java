package Task_20.Task_20_1;

public class GenericClass<T, V, K> {
    private T firstValue;
    private V secondValue;
    private K thirdValue;

    public GenericClass(T firstValue, V secondValue, K thirdValue) {
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

    public void setFirstValue(T firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(V secondValue) {
        this.secondValue = secondValue;
    }

    public void setThirdValue(K thirdValue) {
        this.thirdValue = thirdValue;
    }

    public void displayValues() {
        System.out.println("First Value: " + firstValue);
        System.out.println("Second Value: " + secondValue);
        System.out.println("Third Value: " + thirdValue);
    }

    public static void main(String[] args) {
        // Пример использования
        GenericClass<Integer, String, Double> myGenericObject = new GenericClass<>(10, "Hello", 3.14);
        myGenericObject.displayValues();
        GenericClass<String, Double, Double> myGenericObject2 = new GenericClass<>("10", 4.5, 3.14);
        myGenericObject.displayValues();
        myGenericObject2.displayValues();
    }
}