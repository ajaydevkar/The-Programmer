/* Accept the names of two files and copy the contents of the first to the second. Add Author name and Date in 
 * comments in the beginning of file. Add the comment ‘end of file’ at the end*/
package ass2pro1;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

public class MainFileComments {

	public static void main(String[] args) {
		Date date = new Date();
		try (FileReader file = new FileReader("/home/ajaydevkar/FileHandling/Stud.dat");
				FileWriter file1 = new FileWriter("/home/ajaydevkar/FileHandling/reverse1.txt");
				FileOutputStream obj = new FileOutputStream("/home/ajaydevkar/FileHandling/reverse1.txt");) {

			int data;
			file1.append("/*******Kathy Sierra  Date-");
			file1.write(date.toString());
			file1.write("*******************/");
			while ((data = file.read()) != -1) {
				file1.write(data);
			}
			file1.append("/********************end of file******************/");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}