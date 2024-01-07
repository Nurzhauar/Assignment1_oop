package TASK_5;

public class RecursiveNumbers {

    public static void printNumbersAscending(int A, int B) {
        if (A > B) {
            return;
        }

        System.out.println(A);
        printNumbersAscending(A + 1, B);
    }

    public static void printNumbersDescending(int A, int B) {
        if (A < B) {
            return;
        }

        System.out.println(A);
        printNumbersDescending(A - 1, B);
    }

    public static void main(String[] args) {
        System.out.println("По возрастанию:");
        printNumbersAscending(1, 5);

        System.out.println("По убыванию:");
        printNumbersDescending(5, 1);
    }
}

