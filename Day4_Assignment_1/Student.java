public class Student extends Register{
    private int grade;
    private int id;

    public Student (String name,String dob,String gender,long phone,Address add,int grade){
        super(name,dob,gender,phone,add);
        this.grade = grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }

    
    public void updateGrade(int increment){
        this.grade = getGrade() + increment;
        System.out.println("grade update by " + increment + " . New grade is = " + grade);
    }

    @Override
    public void displayInformation(){
        System.out.println("Name = " + name + " Dob = " + dob + " gender = " +  gender +"Grade = "+ grade + " phone = " + phone);
        System.out.println("State = " + add.state + "City = " + add.city + "Pin = " + add.pin);
    }
}