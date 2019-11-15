class CodeOrg030608{
	public static void main(String[] args){	
		System.out.println("move forward");
		Getandmake();
		for(int i=1;i<=3;i++){
			System.out.println("move forward");
		}
		Getandmake();	
	}
	static void Getandmake(){
		System.out.println("turn right");
		System.out.println("move forward");
		for(int j=1;j<=7;j++){	
			System.out.println("get nectar");
			System.out.println("move forward");
			System.out.println("make honey");
			System.out.println("move forward");
		}
		System.out.println("move forward");	
		System.out.println("turn left");
	}
}
