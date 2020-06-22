package Tuesday lab assignment Eerceise 3

import java.util.Scanner;

public class Exercise 3 {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number);
	int num = scan.nextInt();
	String numStr = String.valueOf(num);
	System.out.println("String str1 = " +str1);
}
		
	static String checkIncrease(int num){
	//if the number is not a true number
	if(num<0)
		return"Error:input is not a natural number";
			String numStr = num +" ";
			chartemp = numStr.charAt(0);;
				for(i=1; i<numStr.length(); i++) {
				if(temp <= numStr.charAt(i)){
					temp = numStr.charAt(i);
				}else{
					return "this is not an increasing number";
				}
			}
			
			return "this is an increasing number";
			}
		}
}




