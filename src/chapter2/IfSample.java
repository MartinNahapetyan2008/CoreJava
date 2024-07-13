package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x is less than y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x is now equal y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("X is bigger than y");
        }
        if (x == y) {
            System.out.println("You can`t see this stroke of code");
        }
    }
}
