package org.example;

public class OddEven {
    private int num;

    public OddEven(int num) {
        this.num = num;
    }
    public boolean isEven() {
        return num % 2 == 0;
    }
    public void countEven() {
        while (num >= 0) {
            System.out.println(num);
            num -= 2;
        }
    }public void countOdd() {
        while (num >= 1) {
            System.out.println(num);
            num -= 1;
        }
    }
}
