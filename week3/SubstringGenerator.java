import java.util.Scanner;

public class SubstringGenerator {

    public static void generateSubstrings(String str) {
        generateSubstringsHelper(str, 0, "");
    }

    private static void generateSubstringsHelper(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        
        generateSubstringsHelper(str, index + 1, current + str.charAt(index));
        generateSubstringsHelper(str, index + 1, current);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        generateSubstrings(input);
    }
}
