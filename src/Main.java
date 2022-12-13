import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       String name, address;
       int age;

       Scanner scanner = new Scanner(System.in);

       System.out.printf("Enter name: ");
       name = scanner.nextLine();

       System.out.printf("Enter address: ");
       address = scanner.nextLine();

       System.out.printf("Enter age: ");
      age = Integer.parseInt(scanner.nextLine());

      pw.println(name + "," + address + "," + age);

    }
}