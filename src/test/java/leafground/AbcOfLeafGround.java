package leafground;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbcOfLeafGround {
	
	WebDriver driver;
	
	@Before
	public void beforeTest() throws InterruptedException {
		//
		driver=new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(Duration.ofSeconds(3));
		
	}
	
	@After
	public void afterTest() throws InterruptedException {
		Thread.sleep(Duration.ofSeconds(3));
		driver.quit();
		
	}

	@Test
	public void basicTest() {
		System.out.println("testleaf - testground");
	}
}
