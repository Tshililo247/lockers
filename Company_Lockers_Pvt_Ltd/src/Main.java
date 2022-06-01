import java.io.File;
import java.util.Scanner;

public class Main {

    public static Scanner kb = new Scanner(System.in);
    public static File ff = new File("C:\\Users\\User\\Documents\\Projects\\lockers\\Company_Lockers_Pvt_Ltd\\src\\sample.txt");
    public static void AppMenu() {
        System.out.println("1. List Files");
        System.out.println("2. Add/Delete/Search Files");
        System.out.println("3. Close");

    }

    public static void listFiles() {
        System.out.println(ff.getAbsolutePath());
        System.out.println(ff.getName());
        System.out.println(ff.isFile());
        System.out.println(ff.isDirectory());
        System.out.println(ff.canRead());
        System.out.println(ff.canWrite());
    }

    public static void userOperations() {
        while (true) {
            userOperationsMenu();
            int userInput = kb.nextInt();
            switch (userInput) {

                case 1 -> {
                    System.out.println("added file");
                    continue;
                }
                case 2 -> {
                    System.out.println("deleted file");
                    continue;
                }
                case 3 -> {
                    System.out.println("search file");
                    continue;
                }
                case 4 -> {
                    break;
                }
            }
        }
    }

    public static void userOperationsMenu() {
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Back");

    }

    public static void main(String[] args) {
        System.out.println("Company Lockers Pvt Ltd\nBy Tshililo");

        while (true) {
            AppMenu();
            int userInput = kb.nextInt();
            System.out.print("Input: ");
            System.out.println(userInput);
            switch (userInput) {

                case 1 -> {
                    listFiles();
                    continue;
                }
                case 2 -> {
                    System.out.println("Option 2");
                    userOperations();
                    continue;
                }
                case 3 -> System.exit(0);
            }
        }

    }
}
