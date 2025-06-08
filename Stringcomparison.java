import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        scanner.close();

        System.out.println(
            str1.equalsIgnoreCase(str2) 
                ? "Strings are equal" 
                : "Strings are not equal"
        );
    }
}
