package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	String path =System.getProperty("user.dir");

	public static WebDriver driver;
	@Test
	public void captureScreenShot() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		// step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot) driver);

		// step2: call getScreenshotAs method to create image file

		File src = screenshot.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\Sarvadnya\\eclipse-workspace\\SameerBDD\\src\\main\\resources\\abc.png");

		// step3: copy image file to destination

		org.openqa.selenium.io.FileHandler.copy(src, dest);

		
	}

}
