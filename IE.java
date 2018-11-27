package sample;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IE {

	public static void main(String[] args)  {
		
		//Connecting with browser
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		WebDriver driver1=new ChromeDriver();
		
		 //Maximizing the window
      	driver1.manage().window().maximize();
		//Launching google.com
		driver.get("https://www.google.com/");
		driver1.get("https://www.google.com/");
		
	   

	}

}
