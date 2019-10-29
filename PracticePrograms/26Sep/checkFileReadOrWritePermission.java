import java.io.File;

public class checkFileReadOrWritePermission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\pc admin\\Desktop\\Temp.txt");
		if(f.canRead()) {
			System.out.println(f.getAbsolutePath() + " Can read");
		}
		else {
			System.out.println(f.getAbsolutePath() + " Can not read");
		}
		
		if(f.canWrite()) {
			System.out.println(f.getAbsolutePath() + " Can write");
		}
		else {
			System.out.println(f.getAbsolutePath() + " Can not write");
		}
		
	}

}
