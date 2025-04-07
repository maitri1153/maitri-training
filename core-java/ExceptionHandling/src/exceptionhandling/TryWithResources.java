package exceptionhandling;

import java.io.*;

public class TryWithResources {
	public static void main(String args[]) {
		try (FileOutputStream fileoutputstream = new FileOutputStream("trywithresources.txt");
				BufferedReader br = new BufferedReader(new FileReader(
						"gfgtextfile.txt"))) {/*
												 * String text = "Hello !! from Try-with-resources java file"; //
												 * Converting string to bytes byte arr[] = text.getBytes(); // Text
												 * written in the file fileoutputstream.write(arr);
												 */

			String text;
			while ((text = br.readLine()) != null) {
				byte arr[] = text.getBytes();
				// String converted to bytes
				fileoutputstream.write(arr);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Resources are closed...");
	}

}
