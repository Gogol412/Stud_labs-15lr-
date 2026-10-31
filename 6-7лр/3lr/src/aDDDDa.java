public class aDDDDa {
    public static void main(String[] args) {
        String text = "aAa aBBa aCCCa aDDDDa";
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (word.matches("a[A-Z]{2,4}a")) {
                System.out.println(word);
            }
        }
    }
}
