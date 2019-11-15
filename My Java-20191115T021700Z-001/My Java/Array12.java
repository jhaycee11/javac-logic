class Array12{
	public static void main(String[] args){		
		int n = Ohya.inputNumber("[ please input number]");
		int[][] a = randomArray2D(n);
		System.out.println("array "+n+"x"+n);
		printArray(a);

	}

	public static int[][] randomArray2D(int n){
		int[][] array= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				array[i][j]=Ohya.random(99)+1;
			}
		}
		return array;
	}

	public static void printArray(int[][] array){
		for(int i = 0; i < array.length; i++){
			for(int j=0;j<array.length;j++){
				System.out.print("[" + j + "]="); 
				System.out.print(array[i][j]+ "\t");
			}
			System.out.println();	
		}
		
		System.out.println();
	}
}