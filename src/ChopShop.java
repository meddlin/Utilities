/*
 * ChopShop -- a class for string manipulation practice
 * */
public class ChopShop {
	private String asciiLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String asciiLowercase = "abcdefghijklmnopqrstuvwxyz";
	private String asciiUppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String digits = "0123456789";
	private String vowels = "aeiou";
	
	public ChopShop(){
		//meh, a constructor
	};
	
	public String getAsciiLetters() {
		return asciiLetters;
	}
	public void setAsciiLetters(String asciiLetters) {
		this.asciiLetters = asciiLetters;
	}
	public String getAsciiLowercase() {
		return asciiLowercase;
	}
	public void setAsciiLowercase(String asciiLowercase) {
		this.asciiLowercase = asciiLowercase;
	}
	public String getAsciiUppercase() {
		return asciiUppercase;
	}
	public void setAsciiUppercase(String asciiUppercase) {
		this.asciiUppercase = asciiUppercase;
	}
	public String getDigits() {
		return digits;
	}
	public void setDigits(String digits) {
		this.digits = digits;
	}
	
	public void findAllVowels(String input){
		System.out.println("vowels: ");
		for(int i = 0; i < (input.length() - 1); i++){
			if(isVowel(input.charAt(i))){
				System.out.print(" " + input.charAt(i) + " ");
			}
		}
	};
	
	public boolean isVowel(char x){
		switch(x){
		case 'a': return true;
		case 'e': return true;
		case 'i': return true;
		case 'o': return true;
		case 'y': return true;
		default: return false;
		}
	};
	
}
