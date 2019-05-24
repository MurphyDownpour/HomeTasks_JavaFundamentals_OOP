package by.htp.oop_task3.main;

public class StudentLogic {
    private Student student;

    public StudentLogic(Student student) {
        this.student = student;
    }

    public void printSuccessfulStudent() {
        for (int mark: student.getMarks()) {
            if (mark != 9 && mark != 10) {
                return;
            }
        }

        System.out.println("Group: " + student.getGroupNumber() + " Student: " + student.getSurname());
    }
}
