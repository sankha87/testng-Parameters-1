package example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	@Parameters({"browser", "url"})
  @Test
  public void f(String browser, String url) {
	  if(browser.equals("chrome"))
	  {
		  System.out.println("launch chrome");
		  System.out.println(url);
	  }
	  if(browser.equals("firefox"))
	  {
		  System.out.println("launch firefox");
		  System.out.println(url);
	  }
	  if(browser.equals("edge"))
	  {
		  System.out.println("launch edge");
		  System.out.println(url);
	  }  
  }
}
