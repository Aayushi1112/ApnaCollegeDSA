package pattern;

public class numberPattern {
	public static void main(String args[]) {
		char n='A';
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
	}

}
