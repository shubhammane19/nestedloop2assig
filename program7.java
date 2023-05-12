class program7{
	
	public static void main(String []args){
		
		int num = 1;
		int row = 3;
		for(int i = 1; i<= row; i++){
			
			for(int j = 1; j<= row; j++){
				
				if(num%2==1){
					
					System.out.print(num*num+" ");
					num++;
				}else{
					
					System.out.print(num+" ");
					num= num +1;
				}
			}
			System.out.println();
		}
	}
}