class program2{
	
	public static void main(String []args){
		
		int row = 4;
		int num = 4;
		for(int i =1; i<=row; i++){
			
			for(int j = 1; j<= row; j++){
				
				System.out.print(num + "  ");
			}
			System.out.println();
			num = num +1;
		}
	}
}