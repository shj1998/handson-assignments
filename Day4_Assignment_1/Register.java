public abstract class Register {
    String name;
    String dob ;
    String gender;
    long phone;
    Address add;

    public Register(String name,String dob,String gender,long phone,Address add){
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.add = add;
    }

    public abstract void displayInformation();


}