import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число в виде строки: ");
        String str = scanner.nextLine();

        int number = Integer.parseInt(str);
        System.out.println("Удвоенное значение: " + (number * 2));
    }
}
