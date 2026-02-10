//Name: Khaled Kanaan Albreiki
//ID: 302679
//School: ATHS - Bani Yas
//Grade: 11 CAI 1

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name; //Logic error you need to write this.grade 
        this.age = age;  //Logic error you need to write this.grade and remove one equal
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) //Syntax error we shouls remove semicolon
            this.age = age; 
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100)
            this.grade = grade;
        else
            this.grade = -1;  // Logic error you need to write this.grade
    }

    public String getStudentInfo() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    public static void main(String[] args) {
        Student student = new Student("John", 20, 85.5);
        student.setAge(5); // Compilation error change a number with out decimal
        System.out.println(student.getStudentInfo());
    }
}


