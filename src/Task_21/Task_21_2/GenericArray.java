package Task_21.Task_21_2;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        // Создаем массив с нужным размером
        this.array = (T[]) new Object[size];
    }

    public void setElement(int index, T value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public T getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public static void main(String[] args) {
        // Пример использования
        GenericArray<Integer> integerArray = new GenericArray<>(5);
        integerArray.setElement(0, 10);
        integerArray.setElement(1, 20);
        integerArray.setElement(2, 30);

        System.out.println("Element at index 1: " + integerArray.getElement(1));

        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.setElement(0, "Java");
        stringArray.setElement(1, "C++");
        stringArray.setElement(2, "Python");

        System.out.println("Element at index 2: " + stringArray.getElement(2));
    }
}