import java.io.IOException;
import java.util.Date;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import sun.net.www.http.HttpClient;


/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args)  {
		String s = "https://shop.48.cn/tickets/item/";
		int num = 1007;
		//String s6 = "http://www.snh48.com/html/allnews/zixun/2016/0928/1960.html";
		while (true)
		{
			try 
			{
				System.out.println(1);
				for (int i = 0 ; i <= 10 ; i++)
				{
					String s1 = s + (num + i);
					get(s1);
				}
				
				System.out.println(2);
				Thread.sleep(3000);
				System.out.println(new Date());
			}
			catch(Exception e)
			{
				
			}
			
		}
	}
	
	private static void get(String s) throws ClientProtocolException, IOException 
	{
		DefaultHttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(s);
		post.setHeader("User-Agent", "Mozilla/5.0");
		StringEntity se = new StringEntity("", "UTF-8");
		post.setEntity(se);
		// Send the post request and get the response
		HttpResponse response = client.execute(post);
		if (response.getStatusLine().getStatusCode() == 200)
		{
			System.out.println(s);
			System.out.println(s);
		}
	}
	

}
