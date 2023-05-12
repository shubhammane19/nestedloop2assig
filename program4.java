class program4{
	
	public static void main(String []args){
		
		int row =3;
		for(int i = 1; i<=row; i++){
			
			int num = 1;
			char ch ='A';
			for(int j = 1; j<=row; j++){
				
				System.out.print(num+""+ch+ "  ");
				num = num+1;
				ch++;
			}
			System.out.println();
		}
	}
}