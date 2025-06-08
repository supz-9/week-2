import java.util.Scanner;

public class CharOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter a character to search: ");
        char ch = scanner.next().charAt(0);
        
        scanner.close();
        
        System.out.println("First occurrence: " + str.indexOf(ch));
        System.out.println("Last occurrence: " + str.lastIndexOf(ch));
    }
}
