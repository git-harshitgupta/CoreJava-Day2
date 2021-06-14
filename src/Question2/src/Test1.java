

class Test1 {
    public static void main(String[] args) {
        Emp emp1 = new Emp(1,"Ajay",1000);
        System.out.println("Before updating the salary");
        emp1.show();
        updateSalary(emp1.salaryGet(),100);
        
    }   
    static void updateSalary(double salary, double increment) {
        System.out.println("salary after increment"+(salary+increment));
    } 
    
}
