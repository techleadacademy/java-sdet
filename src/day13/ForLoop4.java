package day13;

public class ForLoop4 {
    public static void main(String[] args) {
    	
//		for(int i = 0; i < 120; i++) {
//
//				if(i%2 == 0) {
//					continue;
//				}
//            System.out.print(i+" ");
//		}
		
		String str = "qwe2rt2sd2fds2fs";
		for(int i = 0; i < str.length(); i++) {
			char ch  = str.charAt(i);
			if(ch == '2') {
				continue;
			}
			
			System.out.print(ch);
		}

	}
}
