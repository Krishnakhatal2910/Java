package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
//		 FileWriter myWriter = new FileWriter("E:\\Java\\filename.txt");
//		 myWriter.write("Files in Java might be tricky, but it is fun enough!");
//		 myWriter.close();
		
		File file=new File("E:\\Java\\filename.txt");
		 Scanner myReader = new Scanner(file);
		 while(myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		 }
		
	}

}
