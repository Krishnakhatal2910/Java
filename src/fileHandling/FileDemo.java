package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException  {

		File file=new File("E:\\Java\\ab");
		File f=new File("E:\\Java\\ab\\ab.txt");
		System.out.println(file.createNewFile());
//		System.out.println(file.length());
//		System.out.println(file.exists());
		//System.out.println(file.delete());
//		System.out.println(file.exists());
//		System.out.println(file.getName());
//		System.out.println(file.getAbsolutePath());
//		File abFile = file.getAbsoluteFile();
//		System.out.println(abFile.canRead());
//		System.out.println(abFile.canWrite());
		
//		String[] files = file.list();
		
		if(!file.exists()) {
			file.mkdir();
			
		}
		f.createNewFile();
	}

}
