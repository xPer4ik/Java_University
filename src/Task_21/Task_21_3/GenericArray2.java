package Task_21.Task_21_3;

// задание такое как и 21_2 т.к. в задании 21_2 использован для наглядности метод из задания 21_3
public class GenericArray2<T> {
    private T[] array;

    public GenericArray2(int size) {
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
        GenericArray2<Integer> integerArray = new GenericArray2<>(5);
        integerArray.setElement(0, 10);
        integerArray.setElement(1, 20);
        integerArray.setElement(2, 30);

        System.out.println("Element at index 1: " + integerArray.getElement(1));

        Task_21.Task_21_2.GenericArray<String> stringArray = new Task_21.Task_21_2.GenericArray<>(3);
        stringArray.setElement(0, "Java");
        stringArray.setElement(1, "C++");
        stringArray.setElement(2, "Python");

        System.out.println("Element at index 2: " + stringArray.getElement(2));
    }
}
