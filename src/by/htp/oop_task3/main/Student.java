package by.htp.oop_task3.main;

public class Student {
    private String surname;
    private String initials;
    private int groupNumber;
    private int[] marks;

    public Student(String surname, String initials, int groupNumber, int[] marks) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.marks = marks;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}
