class program10{
	
	public static void main(String []args){
		
		int rows = 6;
		for(int i = 1; i<= rows; i++){
			
			int x = rows;
			char ch = 'F';
			for(int j = 1; j<=rows; j++){
				if(j%2==1){
				System.out.print(ch + "  ");
			}else{
				
				System.out.print(x + "  ");
			}
			ch--;
			x--;
		}
		System.out.println();
		}
	}
}