public class Main {
    public static void main(String[] args) {
        Student std01 = new Student();
        Student std02 = new Student("Nguyen Quoc Huy", 19);

        System.err.println("Ten cua std01: " + std01.fullName);
        System.err.println("Ten cua std02: " + std02.fullName);
    }
}
