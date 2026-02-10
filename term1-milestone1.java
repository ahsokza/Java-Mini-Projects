// 302679
//khaled kanaan albreiki 
//grade 11 cai 01

public class Employee {

    private String name;
    private String id;
    private int joiningYear;
    private String type;
    
    //set method
    public void setEmployeeInfo(String empName, String empID, int empJoiningYear, String empType){
        if (empName == null || empID == null || empJoiningYear < 2000 || empType == null)
          System.out.println("Invalid data");
        else
          name = empName;
          id = empID;
          joiningYear = empJoiningYear;
          type = empType;
    }

  public static void main(String[] args) {

    Employee librarian1 = new Employee();

    librarian1.setEmployeeInfo("khaled", "kh302679", 2008, "supervisor");

    librarian1.setEmployeeInfo(null, null, 2008, null);
  }
}
