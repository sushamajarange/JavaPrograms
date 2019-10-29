import java.io.File;

public class GetListOfFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\pc admin\\Documents\\JavaPrograms");
		String str[] = f.list();
		for(String fileNames : str) {
			System.out.println(fileNames);
		}
	}

}
