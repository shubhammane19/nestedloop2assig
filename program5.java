class program5{
	
	public static void main(String []args){
		
		char ch ='Z';
		int x = 26;
		int row = 4;
	for(int i = 1; i<= row; i++){
		
		for(int j = 1; j<= row; j++){
			if(j%2==1){
				
				System.out.print(x-- +"  ");
			}else{
				
				System.out.print(ch-- +"  ");
			}
		}
		System.out.println();
	}
		
		
	}
}