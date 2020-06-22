package Lab asignment exercise 4

import java.util.Scanner

	public class checkNumber {
	
		public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt;
		
		try {
		
		boolean powerofTwo = isPowerOfTwo(n);
		if (powerOfTwo)
			System.out.println(number +"is power of 2");
		}else{
			System.out.println(nmber +"is not a power of 2");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isPowerofTwo(int number) {
		return (number > 0) && ((number & (number - 1)) == 0);
	}
}

