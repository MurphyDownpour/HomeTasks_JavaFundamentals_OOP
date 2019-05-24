package by.htp.oop_task5.main;

public class Counter {
    private int maxValue;
    private int minValue;
    private int currentValue;

    public Counter() {
        maxValue = 10;
        minValue = 0;
        currentValue = 0;
    }

    public Counter(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        currentValue = 0;
    }

    public void increment() {
        if (currentValue < maxValue) {
            currentValue++;
        } else {
            System.out.println("Достигнуто максимальное значение диапазона.");
        }
    }

    public void decrement() {
        if (currentValue >= minValue) {
            currentValue--;
        } else {
            System.out.println("Достигнуто минимальное значение диапазона.");
        }
    }

    public void getCurrent() {
        System.out.println("Текущее значение: " + currentValue);
    }
}
