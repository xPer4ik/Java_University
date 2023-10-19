package Task_9.Task_9_1;

public class TestStudentSort2 {
    public static void main(String[] args) {
        Student[] students1 = {
                new Student(102, "Alice"),
                new Student(104, "Eve"),
                new Student(150, "Tom"),
        };

        Student[] students2 = {
                new Student(101, "Bob"),
                new Student(103, "Charlie"),
                new Student(160, "Charlie"),
        };

        Student[] mergedStudents = mergeSort(students1, students2);

        System.out.println("Merged and sorted students:");
        for (Student student : mergedStudents) {
            System.out.println(student);
        }
    }

    public static Student[] mergeSort(Student[] arr1, Student[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        Student[] merged = new Student[len1 + len2];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i].compareTo(arr2[j]) < 0) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < len1) {
            merged[k++] = arr1[i++];
        }

        while (j < len2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}