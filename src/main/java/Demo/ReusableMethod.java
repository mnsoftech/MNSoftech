package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ReusableMethod {

	static WebDriver driver;
	static Properties prop;
	
	
	public void loadProperty() throws IOException {
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("D:\\mvn\\AutoEnginee\\Property.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void loadBrowser() {
		
		try {
			if(prop.getProperty("BrowserName").equalsIgnoreCase("Chrome")) {
				
				driver=new ChromeDriver();
				maximize() ;
			}else if (prop.getProperty("BrowserName").equalsIgnoreCase("Edge")) {
				driver=new EdgeDriver();
				maximize() ;
				
			}
			else if (prop.getProperty("BrowserName").equalsIgnoreCase("FireFox")) {
				driver=new FirefoxDriver();
				maximize() ;
				
			}
			else {
				
				System.out.println("The browser provide is not found in my list ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void loadURl() {
		
		driver.get(prop.getProperty("url"));
	}
	
	public void maximize() {
		
		driver.manage().window().maximize();
	}
	public void click(String xpath) {
		implictwiat(40);
		WebElement ele=driver.findElement(By.xpath(prop.getProperty(xpath)));
		
		ele.click();
	}
public void enterText(String xpath,String value) {
	implictwiat(30);
		WebElement ele=driver.findElement(By.xpath(prop.getProperty(xpath)));
		
		ele.sendKeys(value);;
	}

public void implictwiat(int waittime) {
	
	
	driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
}
}
