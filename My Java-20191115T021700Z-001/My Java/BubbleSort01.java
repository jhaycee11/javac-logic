class BubbleSort01{
//debug
static int count=0;
	public static void main(String[] args){
		int[] a={3,7,9,6,1,8,2,4,5};
		Ohya.cls();
        for(int i=0; i < a.length; i++){  
			for(int j=1; j < (a.length-i); j++){  
				if(a[j-1] > a[j]){ 
					int temp = a[j-1];  
					a[j-1] = a[j];  
					a[j] = temp; 
					Ohya.sleep(0.5);	
					Ohya.cls();
					printBarArray(a,j,j-1);
//debug
count++; 
				}
			}
		}
System.out.println("count=" + count);
	}

	public static void printBarArray(int[] array, int swapA, int swapB){
		for(int i = 0; i < array.length; i++){
		
			System.out.print(array[i] + "\t");
			
			if(i == swapA || i == swapB){
				printBar(array[i],' ');
			}else{
				printBar(array[i],'¡');
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	//New •\Ž¦‚·‚é•¶Žš‚ð‚¦‚ç‚×‚éprintBar
	public static void printBar(int value, char c){
		for(int i = 0; i < value; i++){
			System.out.print(c);
		}
	}

}