class program9{
	
	public static void main(String []args){
		
		int num = 1;
		for(int i = 1; i<=3; i++){
			
			char ch = 'C';
			int x = 3;
			for(int j = 1; j<=3; j++){
				
				System.out.print(num*num+""+ch-- +""+x-- + "  ");
				num = num +1;
			}
			System.out.println();
		}
		
	}
}