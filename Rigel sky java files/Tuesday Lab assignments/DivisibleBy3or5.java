package tuesday lab assignment exercise 1

import java.util.Scanner;
	
public class DivisibleBy3or5 {
	
		public static void main(String[] args) {
			
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number);
	String num = sc.nextLine();
	int digitSum - 0;
	
	for(int i = 0; i<num.length; i++) {
		digitSum = digitSum + num.charAt(i)-'0';
	}
	if(digitSum % 3 == 0 || digitSum % 5 ==0) {
		System.out.println("Given number is divisible by 3 or 5);
	}else{
		System.out.println("Given number is not divisible is not divisible by 3 or 5);
		}
	}
}


	 