import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld1 = LocalDate.now();
		System.out.println("Todays date : " +ld1);
		
		LocalDateTime ld2 = LocalDateTime.now();
		System.out.println("Current time : " +ld2);
		
		DateTimeFormatter ld3 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
	    String formattedDate = ld2.format(ld3);  

		System.out.println("Formated date and time : " +formattedDate);

	}

}

