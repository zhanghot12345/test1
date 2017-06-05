import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.http.client.ClientProtocolException;


/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class CopyOftest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args)  {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		
		System.out.println(sdf.format(System.currentTimeMillis()));
	}
	
	
	

}
