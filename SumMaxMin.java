class SumMaxMin {
	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]);
		int min = Integer.parseInt(args[0]);
		int i;
		int sum = 0;
		for( i = 0; i< args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
			if(Integer.parseInt(args[i]) < Integer.parseInt(args[i+1])){
			max = Integer.parseInt(args[i+1]);
			}
		}
		for( i = 0; i<args.length; i++){
			if(Integer.parseInt(args[i]) > Integer.parseInt(args[i+1])){
			min = Integer.parseInt(args[i+1]);
			}
		}
		System.out.println("Sum :" + sum + "Max :" + max + "Min :" + min);

} 

}