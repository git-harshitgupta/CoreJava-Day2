class Emp{
    private int empId;
    private String name;
    private double salary;
    public Emp(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    void show() {
        System.out.println("ID : " + empId +" Name : " + name + " Salary : " + salary);
    }

    void update(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    double salaryGet(){
        return this.salary;
    }
    void updateSalary(double salary){
        this.salary += salary;
        System.out.println("Salary after update : " + this.salary);
    }
    
}