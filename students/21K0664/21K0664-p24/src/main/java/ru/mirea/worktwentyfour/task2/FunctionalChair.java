package ru.mirea.worktwentyfour.task2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void gerMaterial() {
        System.out.println("Metal");
    }
}