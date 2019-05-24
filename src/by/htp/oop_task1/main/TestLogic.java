package by.htp.oop_task1.main;

public class TestLogic {
    private Test1 obj;

    public TestLogic(Test1 obj) {
        this.obj = obj;
    }

    public void printValues() {
        System.out.println("x = " + obj.getX());
        System.out.println("y = " + obj.getY());
    }

    public int getSum() {
        return obj.getX() + obj.getY();
    }

    public int getMax() {
        if (obj.getX() > obj.getY()) {
            return obj.getX();
        } else {
            return obj.getY();
        }
    }
}
