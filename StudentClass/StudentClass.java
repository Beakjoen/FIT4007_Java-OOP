package StudentClass;

public class StudentClass {
    private int studentId;
    private String name;
    private float theoryScore;
    private float practiceScore;

    public StudentClass() {
        this.studentId = 0;
        this.name = "";
        this.theoryScore = 0.0f;
        this.practiceScore = 0.0f;
    }

    public StudentClass(int studentId, String name, float theoryScore, float practiceScore) {
        this.studentId = studentId;
        this.name = name;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }

    public float getPracticeScore() {
        return practiceScore;
    }

    public void setPracticeScore(float practiceScore) {
        this.practiceScore = practiceScore;
    }

    public float calculateAverageScore() {
        return (theoryScore + practiceScore) / 2;
    }

    @Override
    public String toString() {
        return String.format("%-10d %-30s %10.2f %10.2f %10.2f", studentId, name, theoryScore, practiceScore, calculateAverageScore());
    }
}
