package day8;

public class SwitchExample {
    public static void main(String[] args) {
		int babiesCount = 4;
		
		//           4
		switch ( babiesCount ) {
		case 2:
			System.out.println("Great, you got 2 babies");
			break;
		case 3:
			System.out.println("Great, you got 3 babies");
			break;
		case 4:
			System.out.println("4 babies");
			break;
		case 5:
			System.out.println("Woow, you got 5 babies");
			break;
		default:
			System.out.println("Hmm.. you got "+babiesCount+" babies");
		}	
		
	}
}
