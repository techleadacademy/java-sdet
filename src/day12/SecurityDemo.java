package day12;

public class SecurityDemo {
	public static void main(String[] args) {
		Security.printWord();
		
		Security obj = new Security();
		obj.printWord();
		
		obj.printWordReg();
		
		String word = Security.getWord("hi");
		System.out.println(word);
		
		System.out.println(Security.getWord("TechLead"));
	}
}
