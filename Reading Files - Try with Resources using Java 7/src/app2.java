import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*how is closeable used with a file*/
public class app2 {
	public static void main(String[] args){
		File file1 = new File("test.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(file1))){
			String line;
			while((line = br.readLine()) != null){
				System.out.println("line: "+line);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can find File :"+file1.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read File" +file1.toString());
		}
	}
}
