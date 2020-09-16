class EmployeeDetails {
    public static void main(String[] args) {
        Employee[] e = new Employee[5];
        Address ap = new Address("TN", "Chennai", 1212);
        e[0] = new Employee(100,"SAM",70000,ap);
        e[1] = new Employee(200,"MAX",35000,ap);
        e[2] = new Employee(300,"SID",50000,ap);
        e[3] = new Employee(400,"TOM",40000,ap);
        Address aq = new Address("MH", "Mumbai", 2325); 
        e[4] = new Employee(500,"SEB",80000,aq);

        for (int i = 0; i<5; i++){
            if(e[i].salary > 50000){
                e[i].display();
            }
        }
    }
}