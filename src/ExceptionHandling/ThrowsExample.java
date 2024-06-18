import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ReadAndWriteTest
{
	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
}

class ThrowsExample
{
	public static void main(String[] args) throws FileNotFoundException {
		ReadAndWriteTest rw = new ReadAndWriteTest();
		try{
			rw.readFile();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		System.out.println("Exception is handled");

		ReadAndWriteTest rw2 = new ReadAndWriteTest();
		rw2.readFile();
	}
}