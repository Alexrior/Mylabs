
package lab3;

import java.util.Scanner;

public 1point {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(Введите целое число от 1 до 7 );
        int number = in.nextInt();
        switch (number) {
            case 1
                System.out.println(Понедельник);
                break;
            case 2
                System.out.println(Вторник);
                break;
            case 3
                System.out.println(Среда);
                break;
            case 4
                System.out.println(Четверг);
                break;
            case 5
                System.out.println(Пятница);
                break;
            case 6
                System.out.println(Суббота);
                break;
            case 7
                System.out.println(Воскресенье);
                break;
            default
                System.out.println(Введено некорректное число);
                break;
        }
    }
}
