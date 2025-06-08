import java.util.Scanner;

public class StudentPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter registration number: ");
        String registrationNumber = scanner.nextLine();
        String password = generatePassword(studentName, registrationNumber);
        System.out.println("Generated Password: " + password);
        scanner.close();
    }

    public static String generatePassword(String name, String regNo) {
        if (name.length() < 2 || regNo.length() < 2) {
            return "Invalid Input";
        }
        String firstTwoLetters = name.substring(0, 2).toUpperCase();
        String lastTwoDigits = regNo.substring(regNo.length() - 2);
        return firstTwoLetters + lastTwoDigits;
    }
}