class Array13{
	public static void main(String[] args){
		System.out.println("array 3x3");
		int val =Ohya.random(99)+1;
		int[][] array=Array12.randomArray2D(3);
		Array12.printArray(array);
		boolean a = search(array,val);
		if(a == true){
			System.out.println("random value = "+val+" is true");
		}
		else{
			System.out.println("random value = "+val+" is false");
		}
	}
	public static boolean search(int[][] array,int val){

		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(val== array[i][j]){
					return true;
				}/*else{
					return false;
				}*/
			}
		}
		//return search(array,val);
		return false;
	}
}