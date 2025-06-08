import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
