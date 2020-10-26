public class Tester {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(12345, "password");
		System.out.println(ba1.getBalance() == 0);
		System.out.println(!ba1.withdraw(50));
		System.out.println(!ba1.deposit(-50));
		System.out.println(ba1.deposit(50));
		System.out.println(ba1.getBalance() == 50);
		System.out.println(ba1.getAccountID() == 12345);
		System.out.println(ba1.withdraw(25));
		System.out.println(ba1.getBalance() == 25);
		System.out.println(ba1.toString().equals("12345\t25.0"));
	}
}
