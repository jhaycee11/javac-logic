class ArraySample{

	public static void main(String[] args){
				
		//5個の値が入る空の配列をつくる
		int[] arrayA = new int[5];
		
		//値を指定して配列をつくる
		int[] arrayB = {1,2,3,4,5};
		
		//他の配列を参照（さんしょう:reference）する
		int[] arrayC = arrayA;
		
		
		//配列の添え字（そえじ=index)を指定して、
		//値を代入
		arrayA[0]=9;
		arrayA[1]=8;
		arrayA[2]=7;
		arrayA[3]=6;
		arrayA[4]=5;
		for (int i=0;i<5;i++){
			System.out.println("arrayA["+i+"]=" + arrayA[i]);
		}
		System.out.println();
		for (int j=0;j<5;j++){
			System.out.println("arrayB["+j+"]=" + arrayB[j]);
		}
		System.out.println();
		for (int j=0;j<5;j++){
			System.out.println("arrayC["+j+"]=" + arrayC[j]);
		}
		System.out.println();
		arrayC[0]=99;
				for (int i=0;i<5;i++){
			System.out.println("arrayA["+i+"]=" + arrayA[i]);
		}
		printArray(arrayA);
		printArray(arrayB);
		printArray(arrayC);


		//配列名.length で　配列の長さを調べる
		System.out.println("arrayA=" + arrayA.length);		
	}
	
	
	/**int配列の値を全て表示する*/
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print("[" + i + "]="); 
			System.out.print(array[i]+ "\t");
		}
		
		System.out.println();
	}
}