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
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class eBayHandler {

	private String queryString = "";
	private String content = "";
	private String builtUrl = "";
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
			//builtUrl = buildURL(); // REMOVED due to design change
			
			/*connection =  new URL(builtUrl).openConnection();
			Scanner scanner = new Scanner(connection.getInputStream()); PULLED THIS FOR JSOUP IMPLEMENTATION
			scanner.useDelimiter("\\Z");
			content = scanner.next();
			*/
			Document dom = Jsoup.connect(queryString).get(); // A Document Object Module (DOM) object provided by JSoup //
			
			/* 
			 *  CURRENTLY TESTING
			 * 	using CSS selectors to properly select exactly what we need is something i need to do more research on
			 *  currently just stupidly fetching ALL item descriptions, date times, and prices of the requested item
			 *  
			 *  Once i have a better handle at crafting CSS selector statements i can more accurately select what we need from the provided eBay page and then turn them into strings and present them to the user
			 *  in the form of a notification or an email. 
			 * 
			 */
			
			Elements itemDescriptions = dom.select("#ResultSetItems .vip"); // elements calls the select function on the Document object which takes a CSS selector string as a parameter //
			Elements itemDateTimes = dom.select("#ResultSetItems .tme");
			Elements itemPrices = dom.select("#ResultSetItems .prc");
			System.out.print(""); // Debugging purpose only //
			
			
			
			
			
		} catch ( Exception ex )
		{
			ex.printStackTrace();
		}
		// To test received HTML
		// System.out.println(content);
	}
	
	// Method that builds a URL to request eBay HTML
	
	/*
	 * 
	 * Major design change. Client has specified they want to use a more in depth query for their search
	 * this in depth search will be done on the Ebay site itself, and the user will have to provide our program with the crafted url 
	 * The url will be very complex, we may look into making a UI around this later, but currently out of scope of project.
	 * 
	 * TL;DR -> removing any backend url building, requesting the user to provide us with the correct url to query.
	 * 
	 * */
	public String buildURL()
	{
		queryString = queryString.replace(" ", "+");
		
		String URL = "http://www.ebay.com/sch/i.html?_sacat=0&_from=R40&_nkw=" + queryString + "&_sop=10";

		return URL;
	}
}

