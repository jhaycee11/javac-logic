class CodeOrg041407{
	public static void main(String[] args){	
		drawTriangle(25);
		System.out.println("jump forward 50");
		drawTriangle(50);
		System.out.println("jump forward 75");
		drawTriangle(75);
	}
	static void drawTriangle(int length){
		for(int i=1;i<=3;i++){
			System.out.println("move forward "+length);
			System.out.println("turn left 120");
		}
	}			
}
