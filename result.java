class result {
	public static void main(String[] args){
	int marks = Integer.parseInt(args[0]);
	
	if(marks > 70){
		System.out.println("First class with Distinction");
	}
	else if(60 <= marks && marks < 70){
		System.out.println("First class");
	}
	else if(50 <= marks && marks < 60){
		System.out.println("second class");
	}
	else if(35 <= marks && marks < 50){
		System.out.println("pass");
	}
	else {
		System.out.println("Fail");
	}

	}

}
		