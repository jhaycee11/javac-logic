class Array03{
	public static void main(String[] args){
		int[] a1= new int[2];
		int[] a2= new int[2];
		for(int i=0;i<2;i++){
			a1[i]= Ohya.random(10);
			a2[i]= Ohya.random(10);
		}
		printArray(a1);
		printArray(a2);
 
		boolean same = equals(a1,a2);
		if(same == true){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}
 	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print("[" + i + "]="); 
			System.out.print(array[i]+ "\t");
		}
		
		System.out.println();
	}
	public static boolean equals(int[] a1, int[] a2) {
		boolean result = true;
		
		if (a1[0] == a2[0] && a1[1] == a2[1]) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
} 
