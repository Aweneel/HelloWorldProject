import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author anil
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Current Time is: " + dateFormat.format(date)); //2016/11/16 12:08:43

	}

}