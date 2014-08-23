package patterns.structure.composite;

import java.util.Date;

/**
 * øÕªß∂À≤‚ ‘≥Ã–Ú
 * 
 * @author Charles Chen
 * 
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create text files
		File textFile1 = new TextFile("text_file_1.txt", new Date());
		textFile1.description();
		File textFile2 = new TextFile("text_file_2.txt", new Date());
		textFile2.description();

		System.out
				.println("--------------------------------------------------------------");

		// Create directory
		File dir = new Directory("dir_1", new Date());
		// Add files into directory
		dir.addFile(textFile1);
		dir.addFile(textFile2);
		// List files
		dir.description();
		dir.listFiles();

		System.out
				.println("--------------------------------------------------------------");

		// Remove text file 1
		dir.removeFile(textFile2);
		dir.listFiles();
	}

}
