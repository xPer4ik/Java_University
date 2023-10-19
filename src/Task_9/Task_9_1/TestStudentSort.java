package Task_9.Task_9_1;

import java.util.Arrays;
import java.util.Comparator;
public class TestStudentSort {
    public static void main(String[] args) {
        Student[] students = {
                new Student(102, "Alice"),
                new Student(101, "Bob"),
                new Student(104, "Eve"),
                new Student(103, "Charlie"),
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void insertionSort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Comparable key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}