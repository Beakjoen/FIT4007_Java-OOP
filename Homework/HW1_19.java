import java.util.Scanner;
public class HW1_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String string = scanner.nextLine();
        int numberAppearance = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                numberAppearance++;
            }
        }
        System.out.println("So lan 'a' xuat hien: " + numberAppearance);
        scanner.close();
    }
}
