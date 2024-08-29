package Methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Demo.ReusableMethod;

public class Engine  {
	
	
	@Test
	
	public void pavani() {
		
		System.out.println(1);
		
	}
	
	@BeforeTest
	
	public void madhu() {
		
		System.out.println(2);
	}
	
	@AfterTest
	public void karthik() {
		System.out.println(3);
	}
	@BeforeMethod
	public void ram() {
		
		System.out.println(4);
	}
	@AfterMethod
	public void rajesh() {
		
		System.out.println(5);
	}
	
}
