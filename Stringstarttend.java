import java.util.Scanner;

public class StringStartEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        System.out.println("Starts with 'Java': " + str.startsWith("Java"));
        System.out.println("Ends with 'programming': " + str.endsWith("programming"));
    }
}
