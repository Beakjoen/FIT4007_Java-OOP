package Rectangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the height of the rectangle: ");
            double height = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            Rectangle rect = new Rectangle(height, width);
            System.out.println(rect);
        }
    }
}
