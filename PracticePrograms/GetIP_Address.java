import java.net.InetAddress;
import java.net.UnknownHostException;
public class GetIP_Address {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress obj = InetAddress.getLocalHost();
		System.out.println("My local IP address is : " +obj);
	}

}
