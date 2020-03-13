package com.testbase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public static String path;
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() {
		try {
		FileInputStream fs= new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\POMDemo\\src\\main\\java\\com\\fb\\configuration\\configuration.properties");
		prop= new Properties();
		prop.load(fs);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		
		
	}
	}
	
	public static void initialization() {
		String browsername=prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")) {
			path= System.getProperty("user.dir")+prop.getProperty("systemproperty_2");
			System.setProperty("webdriver.chrome.driver",path);
			System.out.println(path);//System.setProperty(prop.getProperty("systemproperty_1"),prop.getProperty("systemproperty_2"));
		driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	

}
