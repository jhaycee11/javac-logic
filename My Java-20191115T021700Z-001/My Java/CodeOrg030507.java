class CodeOrg030507{
	public static void main(String[] args){

		for(int j=1; j<=3 ;j++){
			drawFlower();
			System.out.println("jump forward 100");
		}

	}

	static void drawFlower(){
		System.out.println("turn left 90");
		System.out.println("move forward 100");
		for(int i=1;i<=10;i++){
			System.out.println("turn left 36");
			drawFlower1();
			drawFlower1();
		}
		System.out.println("jump backward 100");
		System.out.println("turn right 90");
	}
	static void drawFlower1(){
		System.out.println("move forward 25");
		System.out.println("turn left 36");
		System.out.println("move forward 25");
		System.out.println("turn left 144");
	}
}