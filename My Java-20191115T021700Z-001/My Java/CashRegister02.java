class CashRegister02{
	public static void main(String[] args){
		int sum = 4132;
		System.out.println("Sum = "+sum);
		int a = Ohya.inputNumber("[cash input]");
		int change=a-sum;
		System.out.println("change = "+change);
		System.out.println("1000en = "+(change/1000)+"–‡");
	}
}