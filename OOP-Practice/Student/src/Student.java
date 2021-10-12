public class Student {
    int id;
    String name;
    int classId;
    String email;
    double mathScore;
    double historyScore;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, int classId, double mathScore, double historyScore) {
        this.id = id;
        this.classId = classId;
        this.mathScore = mathScore;
        this.historyScore = historyScore;
    }
    public String toString() {
        return "id: " + id +
                "; name: " + name +
                "; classId: " + classId +
                "; email: " + email +
                "; mathScore: " + mathScore +
                "; historyScore: " + historyScore;
    }
    public double gpa() {
        return (this.mathScore+this.historyScore)/2;
    }
}
