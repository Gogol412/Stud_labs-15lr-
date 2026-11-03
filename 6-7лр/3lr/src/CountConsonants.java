import java.util.Scanner;

public class CountConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        String vowels = "аеёиоуыэюяaeiou";
        String consonants = "бвгджзйклмнпрстфхцчшщbcdfghjklmnpqrstvwxyz";

        int vowelCount = 0;
        int consonantCount = 0;

        String lower = str.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            } else if (consonants.indexOf(ch) != -1) {
                consonantCount++;
            }
        }

        System.out.println("Количество гласных: " + vowelCount);
        System.out.println("Количество согласных: " + consonantCount);
    }
}
