class Loan {
	// Static Variable
	static int x = 10;

	// Instance Variable - variables binded with object
	int age = 12;
	public static void main(String args[]) {

		int i = 1; 	// Local Variable

		// static variables or methods are binded with class, not with object
		System.out.println("Hello Using Java..." + x + "," + i);
	}
}
