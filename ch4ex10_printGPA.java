import java.util.Scanner;

public class ch4ex10_printGPA {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printGPA(scanner);
        scanner.close();
    }

    public static void printGPA(Scanner scanner) {
        System.out.print("Enter a student record: ");
        String stuname = scanner.next();
        int numScore = scanner.nextInt();

        int totalScore = 0;
        for (int i = 0; i < numScore; i++) {
            totalScore += scanner.nextInt();;
        }

        double gpa = (double) totalScore / numScore;

        System.out.printf("%s's grade is %.2f%n", stuname, gpa);
    }

}
