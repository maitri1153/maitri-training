package controlstatements;

public class LabelForLoop {
	public static void main(String args[]) {
		int i = 0;
		whilelabel: while (i < 5) {
			System.out.println("outer value of i= " + i);
			i++;

			forlabel: for (int j = 0; j < 5; j++) {
				if (j > 0) {
					continue forlabel;
				}
				if (i > 1) {
					continue whilelabel;
				}
				System.out.println("inner value of i= " + i + ", j= " + j);
			}
		}
	}
}
