public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(2,"Tran Ngoc Huu");
        Student student3 = new Student(3,8,9.0,8.0);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
