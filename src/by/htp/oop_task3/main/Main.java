package by.htp.oop_task3.main;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sarafanov", "R.A.", 153, new int[] {5, 2, 7, 6, 3});
        Student student2 = new Student("Gorbunov", "S.R.", 512, new int[] {9, 9, 10, 9, 10});
        Student student3 = new Student("Zadornov", "A.D.", 322, new int[] {3, 4, 1, 2, 6});
        Student student4 = new Student("Malisheva", "M.I.", 616, new int[] {6, 1, 6, 2, 5});
        Student student5 = new Student("Samsonova", "A.Z.", 944, new int[] {7, 1, 8, 10, 2});
        Student student6 = new Student("Medvedeva", "O.N.", 185, new int[] {9, 2, 9, 6, 3});
        Student student7 = new Student("Medyanik", "S.M.", 457, new int[] {10, 2, 7, 6, 10});
        Student student8 = new Student("Samoylova", "D.A.", 351, new int[] {4, 2, 7, 6, 4});
        Student student9 = new Student("Alekseev", "P.I.", 445, new int[] {2, 7, 7, 1, 3});
        Student student10 = new Student("Demchog", "V.E.", 762, new int[] {10, 9, 9, 10, 10});

        Student[] students = new Student[]
        {
                student1,
                student2,
                student3,
                student4,
                student5,
                student6,
                student7,
                student8,
                student9,
                student10

        };

        for (Student student: students) {
            StudentLogic logic = new StudentLogic(student);
            logic.printSuccessfulStudent();
        }

    }
}
