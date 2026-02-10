//Name: Khaled Kanaan Albreiki
//Id: 302679
//Emirates ID:
//Grade: CAI 1 -11 

public class StudentRecord {
    private String studentName;
    private int studentID;
    private double grade;

    // Constructor to initialize student details
    public StudentRecord(String name, int id, double grade) {
        this.studentName = name;
        this.studentID = id;
        this.grade = grade;
    }

    // Getter for grade
    public double getGrade() {
        return this.grade;
    }

    // Setter for grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to display student details
    public void displayStudentInfo() {
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Grade: " + this.grade);
    }
        
        
        //Modifying Student Record
        public static void modifyStudentRecord(StudentRecord originalRecord, double newGrade){
                StudentRecord modifiedRecord = new StudentRecord(originalRecord.studentName, originalRecord.studentID, newGrade);
                System.out.println("Modified Record");
                modifiedRecord.displayStudentInfo();
        }
        
        //Adding 15 marks to grade 
        public static void updatePrimitiveGrade(double grade){
                grade +=15; 
                System.out.println("Inside Method, grade updated to: " + grade); 
        }
        
        
        //Changing Student Grade
        public static void changeStudentGrade(StudentRecord record, double newGrade){ 
                record.setGrade(newGrade); 
        }
   
    
    
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
        // Create an original StudentRecord object
        StudentRecord student = new StudentRecord("John Doe", 101, 85.0);

        // Display the original student record
        System.out.println("Original Record:");
        student.displayStudentInfo();

        // PC3.1: Pass a mutable object but do not modify the original
        System.out.println("\nTesting PC3.1:");
        modifyStudentRecord(student, 95.0);

        // Verify the original object remains unchanged
        System.out.println("After PC3.1, Original Record:");
        student.displayStudentInfo();

        // PC3.2: Pass a primitive type and demonstrate behavior
        System.out.println("\nTesting PC3.2:");
        double grade = student.getGrade();
        updatePrimitiveGrade(grade);
        System.out.println("Outside method, grade remains: " + grade);

        // PC3.3: Pass an object reference and modify it
        System.out.println("\nTesting PC3.3:");
        changeStudentGrade(student, 90.0);

        // Verify the original object has been modified
        System.out.println("After PC3.3, Original Record:");
        student.displayStudentInfo();
    }
}
