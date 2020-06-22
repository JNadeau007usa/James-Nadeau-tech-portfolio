//Create a program which will accept 10 String from user. It should display all strings
//which is starting with a vowel. 

import java.utl.Scanner
public class inputStrings {
	
	Scanner input=new Scanner(System.in);
	
		System.out.println("lease Enter the 10 Strings:");
			for(i=1; i<=10; i++) {
				
				System.out.print(i+") ");
				String str=input.nextLine();
				
				String array[]=new String[10];
				
				
				for(int j=10; j>0; j++);
			}
	
public void CheckVowel {
{ 
   
static int checkIfStartsWithVowels(char []str) 
{ 
  
    if (!(str[0] == 'A' || str[0] == 'a'
        || str[0] == 'E' || str[0] == 'e'
        || str[0] == 'I' || str[0] == 'i'
        || str[0] == 'O' || str[0] == 'o'
        || str[0] == 'U' || str[0] == 'u')) 
        return 1; 
    else
        return 0; 
} 
  
// Function to check 
static void check(String str) 
{ 
    if (checkIfStartsWithVowels(str.toCharArray()) == 1) 
        System.out.print("Not Accepted\n"); 
    else
        System.out.print("Accepted\n"); 
} 
}