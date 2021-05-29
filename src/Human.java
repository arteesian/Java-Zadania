public class Human {
    public Animal pet;
    public Car car;
    private Double salary;

    public Double getSalary() {
        if (salary != null) {
            System.out.println(salary);
            return salary;
        } else {
            System.out.println("You don't have a salary");
            return null;
        }
    }

    public void setSalary(Double salary){
        if(salary < 0){
            System.out.println("The payment is below 0");
        }else{
            System.out.println("The new data has been sent to the accounting system");
            System.out.println("Do not forget to pick up the annex to the contract from Mrs. Hania from HR");
            System.out.println("ZUS and US already know about the change in payment");
            this.salary = salary;
        }
    }
}
