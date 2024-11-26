package java1;

public class SwitchCase {
      Character vowel = 'p';
      public void letters() {
    	  switch (vowel) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
            break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("not a vowel");
			break;
		}
      }
	public static void main(String[] args) {
		SwitchCase condition = new SwitchCase();
		condition.letters();

	}

}
