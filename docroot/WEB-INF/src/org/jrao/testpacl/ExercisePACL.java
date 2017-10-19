package org.jrao.testpacl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExercisePACL {

	public static void exercisePACL(String testFilePath) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(testFilePath));

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
