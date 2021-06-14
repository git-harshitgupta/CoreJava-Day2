class Test2 {
    public static void main(String[] args) {
        Emp emp1 = new Emp(1,"Ajay",1000);
        System.out.println("Before update");
        emp1.show();
        update(emp1,100);

    }
    static void update(Emp e, double increment) {
        e.updateSalary((increment));
    }
        

    
}
