public class Demo{
    public static void main(String[] args) {
        
        Address add = new Address("TN", "Chennai", 1212);
        Manager manager = new Manager("Sam", "1st May 1985","male",555555L,add,100,70000);
        Student student = new Student("Cheryl", "14th Feb 2010","female",6666666L,add,5);
        Admin admin = new Admin("Dan", "9th May 1990","male",7777777L,add,300,50000);
        Programmer programmer = new Programmer("Max", "8th jan 1970","male",8888888L,add,400,60000);
        Customer customer = new Customer("Laura", "3rd april 1998","male",9999999L,add,1111L,50000.0);
        student.updateGrade(2);
        programmer.updateSalary(15);
        test(admin);
        test(manager);
        test(programmer);
        test(customer);
        test(student);
    }

    public static void test(Register register){
        System.out.println("------------------------------------------------------------------------------------");
        register.displayInformation();
        System.out.println("------------------------------------------------------------------------------------");

        if(register instanceof Student){
            Student stud = (Student)register;
            stud.updateGrade(2);
        }

        if(register instanceof Admin){
            Admin ad = (Admin)register;
            ad.updateSalary(10);
        }
        else if(register instanceof Programmer){
            Programmer prog = (Programmer)register;
            prog.updateSalary(15);
        }
        else if(register instanceof Manager){
            Manager mag = (Manager)register;
            mag.updateSalary(20);
        }

        if(register instanceof Customer){
            Customer cust = (Customer)register;
            cust.updateBalance(1000);
        }

        register.displayInformation();
        

    }
}