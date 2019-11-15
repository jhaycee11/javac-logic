class Array15{
	public static void main(String[] args){
		System.out.println("array 3x3");
		int[][] a=Array12.randomArray2D(3);
		Array12.printArray(a);
		System.out.println("searchArray 1x100");
		int[] searcha= Array02.randomArray(100);
		Array01.printArray(searcha);

		System.out.println("clear");
		Array14.searchArray(a,searcha);
		Array12.printArray(a);
		
		//boolean b = search(a);
		if(search(a)){
			System.out.println("isBingo -> true");
		}
		else{
			System.out.println("isBingo -> false");
		}
	}
	public static boolean search(int[][] array){

		for(int i=0;i<array.length;i++){
			if((array[i][0]==0) && (array[i][1]==0) && (array[i][2]==0)){
				return true;
			}else if((array[0][i]==0) && (array[1][i]==0) && (array[2][i]==0)){
				return true;
			}
		}
		if((array[0][0]==0) && (array[1][1]==0) && (array[2][2]==0)){
				return true;
		}else if((array[0][2]==0) && (array[1][1]==0) && (array[2][0]==0)){
				return true;
		}
		return false;
	}
}