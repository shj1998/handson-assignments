class Employee {
    int id; 
    String name;
    int salary;
    Address add;
    Employee(int id , String name, int salary, Address add){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.add = add;
    }

    void display(){
        System.out.println("Employee Id = " + id + " Name = " + name + " Salary = " + salary);
        System.out.println("State = " + add.state + "City = " + add.city + "Pin = " + add.pin);
    }
}