class CashRegister01{
	public static void main(String[] args){
		int a = Ohya.inputNumber("[apple input]");
		int b = Ohya.inputNumber("[banana input]");
		int applePrice = 108;
		int bananaPrice = 138;
		System.out.print("applePrice = "+applePrice);
		System.out.print("\t");
		System.out.println("bananaPrice = "+bananaPrice);
		System.out.println("Sum = "+(applePrice*a)+" + "+ (bananaPrice*b)+" = "+(applePrice*a+bananaPrice*b));
	}
}