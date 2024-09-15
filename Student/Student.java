public class Student {
    @SuppressWarnings("unused") String fullName;
    @SuppressWarnings("unused")
    private int age;
    public Student(){
        this.fullName = "NNN";
        this.age = 19;
    }
    public Student(String fullName, int yourAge){
        this.fullName = fullName;
        this.age = yourAge;
    }
}
