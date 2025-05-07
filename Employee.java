public class Employee {
    String name;
    int id;
    double salary;
    int number;
    public Employee(String name,int id, double salary,int number)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.number=number;
    }
    public void displayInfo(){
        System.out.println("Employee Id: "+ id);
        System.out.println("Employee Name: "+ name);
        System.out.println("Salary : "+ salary);
        System.out.println("number :"+number);
        
    }
    public static void main(String[]args)
    {
        Employee emp1=new Employee("XYZ",101,50000.0,990246);
        Employee emp2=new Employee("ABC",102,50000.0,815205);
        emp1.displayInfo();
        emp2.displayInfo();
    }
}
