class CodeOrg041404{
	public static void main(String[] args){	
		drawTriangle(150);
		System.out.println("jump forward 175");
		drawTriangle(75);
		System.out.println("jump forward 100");
		drawTriangle(25);
	}
	static void drawTriangle(int length){
		for(int i=1;i<=3;i++){
			System.out.println("move forward "+length);
			System.out.println("turn left 120");
		}
	}			
}
