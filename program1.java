class program1{
	
	public static void main(String []args){
		
		int row = 3;
		for(int i = 1; i<= row; i++){
			
			int x = 1;
			for(int j = 1; j<= row; j++){
				
				System.out.print("C2W"+x+ "  ");
				x = x+1;
			}
			System.out.println();
		}
	}
}