class CodeOrg030502{
	public static void main(String[] args){

		drawSquare();

		System.out.println("move forward 175");

		drawSquare();

	}

	static void drawSquare(){

		for(int i=1;i<=4;i++){
			System.out.println("move forward 100");
			System.out.println("turn right 90");
		}
	}
}