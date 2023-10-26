package Task_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA {
    private ArrayList<Student> students = new ArrayList<>();

    public void setArray(ArrayList<Student> students) {
        this.students = students;
    }

    public void quicksort() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                // Сортировка в порядке убывания среднего балла
                return Double.compare(student2.getGpa(), student1.getGpa());
            }
        });
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void sortStudentsByField(List<Student> students, Comparator<Student> comparator) {
        mergeSort(students, comparator);
    }

    private void mergeSort(List<Student> students, Comparator<Student> comparator) {
        if (students.size() <= 1) {
            return;
        }

        int middle = students.size() / 2;
        List<Student> left = new ArrayList<>(students.subList(0, middle)); // Создаем копии подсписков
        List<Student> right = new ArrayList<>(students.subList(middle, students.size()));

        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(students, left, right, comparator);
    }

    private void merge(List<Student> students, List<Student> left, List<Student> right, Comparator<Student> comparator) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (comparator.compare(left.get(leftIndex), right.get(rightIndex)) < 0) {
                students.set(resultIndex++, left.get(leftIndex++));
            } else {
                students.set(resultIndex++, right.get(rightIndex++));
            }
        }

        while (leftIndex < left.size()) {
            students.set(resultIndex++, left.get(leftIndex++));
        }

        while (rightIndex < right.size()) {
            students.set(resultIndex++, right.get(rightIndex++));
        }
    }

//    public void sortStudentsByField(Comparator<Student> comparator) {
//        Collections.sort(students, comparator);
//    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("John", "Doe", "Computer Science", 2, "CS101", 3.8));
        studentsList.add(new Student("Alice", "Smith", "Mathematics", 3, "Math202", 3.7));
        studentsList.add(new Student("Bob", "Johnson", "Physics", 1, "Phys101", 4.0));

        sorter.setArray(studentsList);

        System.out.println("Unsorted:");
        sorter.outArray();

        sorter.quicksort();

        System.out.println("\nSorted by GPA (Descending):");
        sorter.outArray();

        // Sorting by another field, e.g., first name
        sorter.sortStudentsByField(studentsList,Comparator.comparing(Student::getFirstName));

        System.out.println("\nSorted by First Name:");
        sorter.outArray();
    }
}