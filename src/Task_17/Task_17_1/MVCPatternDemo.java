package Task_17.Task_17_1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveCourseFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);
        controller.updateView();
        controller.setStudentName("Tom");
        System.out.println("After updating:");
        controller.updateView();
    }

    private static Student retriveCourseFromDatabase(){
        Student student = new Student();
        student.setName("Bob");
        student.setRollNo("01");
        return student;
    }
}
