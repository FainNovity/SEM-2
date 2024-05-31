import java.io.*;

public class FileIO {
	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("shape_of_you.mp3");
			FileOutputStream fos = new FileOutputStream("shape_of_you.jpg");
			int temp=fis.read();
			while(temp>-1){
				fos.write(temp);
				temp=fis.read();
				}
			
			fis.close();
			fos.close();
			}
		catch(Exception e){
			e.printStackTrace();
			}
	}
}