package Practice;
import java.util.Scanner;
public class Palindromechk {
	public static void main(String[] args) {
		System.out.println("Enter sring to check");
		Scanner s = new Scanner (System.in);
		String str= s.nextLine();
		Palindromechk.isPalindromString(str);
	}
public static void isPalindromString(String text){
	String reverse = reverse(text);
	if(text.equals(reverse)){
		System.out.println("is palindrome");
		}
	else {
	System.out.println("is not palindrome");
	}
}
public static String reverse(String input){
	if(input == null || input.isEmpty()){
		return input;
		}
	return input.charAt(input.length()- 1)
			+ reverse(input.substring(0, input.length() - 1)); }

}