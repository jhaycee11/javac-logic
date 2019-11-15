class CodeOrg030504{
	public static void main(String[] args){

		for(int j=1; j<=3 ;j++){
			drawSquare();
			System.out.println("turn left 120");
		}

	}

	static void drawSquare(){

		for(int i=1;i<=4;i++){
			System.out.println("move forward 100");
			System.out.println("turn right 90");
		}
	}
}