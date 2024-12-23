package lab1;
import java.util.Scanner;
public class Example6 {
public static void main(String[] args) {//Дико извиняюсь, за то, что переменные так названы, лень менять:(...
Scanner in = new Scanner(System.in);
System.out.println("Введите фамилию: ");
String name = in.nextLine();
System.out.println("Введите имя: ");
String age = in.nextLine();
System.out.println("Введите отчетство: ");
String height = in.nextLine();
System.out.println("Hello");
System.out.println(name);
System.out.println(age);
System.out.println(height);
in.close();
}
}