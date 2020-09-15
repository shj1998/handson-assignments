class taxation{
	public static void main(String[] args) {
		String state =  args[0];
		int amount = Integer.parseInt(args[1]);
		double tax = 0;
		switch(state){
			case "mh":
			 	tax = 0.1;
				System.out.println("total amt for maharashtra is" + (amount+(amount*tax)));
				break;
			case "ka":
				tax = 0.08;
				System.out.println("total amt for Karnataka is" + (amount+(amount*tax)));
				break;
			case "gj":
				tax = 0.12;
				System.out.println("total amt for Gujrat is" + (amount+(amount*tax))); 	
				break;
			case "up":
				tax = 0.05;
				System.out.println("total amt for Uttar Pradesh is" + (amount+(amount*tax)));
				break;
			default:
				System.out.println("Invalid input");
		}
	}

}