public class Programmer extends Register {
    private int id;
    private double salary;
    public Programmer (String name,String dob,String gender,long phone,Address add,int id,double salary){
        super(name,dob,gender,phone,add);
        this.id = id;
        this.salary = salary;
    }
    public void setSalary(double balance){
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void updateSalary(double percentage){
        this.salary = getSalary() + (0.01*percentage*salary);
        System.out.println("Salary update by " + percentage + " percent. New salary is = " + salary);
    }

    @Override
    public void displayInformation(){
        System.out.println("Name = " + name +" Salary = " + salary + " Dob = " + dob + " gender = " +  gender + " phone = " + phone + " Id = " + id);
        System.out.println("State = " + add.state + "City = " + add.city + "Pin = " + add.pin);
    }

}