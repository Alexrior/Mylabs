package lab6.task04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();

        Test test = new Test();
        Test.doubleFactorial(number);
    }
}