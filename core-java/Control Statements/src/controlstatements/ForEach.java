package controlstatements;

public class ForEach {

	public static void main(String args[]) {
		int number[] = { 1, 2, 3, 4, 5, };
		String name[] = { "Maitri", "Aastha", "Bhumi", "Helly", "Kinjal", "Mittal" };
		for (int e : number) {
			System.out.print(e + " ");
		}
		System.out.println(" ");
		for (String i : name) {
			System.out.print(i + " ");
		}
	}
}
