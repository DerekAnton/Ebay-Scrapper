import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class eBayHandler {

	private String queryString = "";
	private String content = "";

	public eBayHandler(String s)
	{
		queryString = s;
	}

	public void getURL()
	{
		// http://www.ebay.com/sch/i.html?_sacat=0&_from=R40&_nkw=buffalo+nickel&_sop=10	
		URLConnection connection = null;
		try 
		{
			connection =  new URL(buildURL()).openConnection();
			Scanner scanner = new Scanner(connection.getInputStream());
			scanner.useDelimiter("\\Z");
			content = scanner.next();
		} catch ( Exception ex )
		{
			ex.printStackTrace();
		}
		// To test received HTML
		System.out.println(content);
	}
	
	// Method that builds a URL to request eBay HTML
	public String buildURL()
	{
		queryString = queryString.replace(" ", "+");
		
		String URL = "http://www.ebay.com/sch/i.html?_sacat=0&_from=R40&_nkw=" + queryString + "&_sop=10";

		return URL;
	}
}

