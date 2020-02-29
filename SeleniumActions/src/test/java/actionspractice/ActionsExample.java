package actionspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExample {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	
		@Test
		public void gmailTest() throws InterruptedException {
			driver.get("http://www.gmail.com");
			driver.findElement(By.id("identifierId")).sendKeys("alikodirov9");
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("homedepot2011");
			driver.findElement(By.id("passwordNext")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//table[@id=':34']/tbody/tr[1]/td[4]")).click();
		}

//	// @Test
//	public void doubleClickTest() {
//		// how to work with double clicking on elements.
//		driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
//		
//		Select dropdown = new Select(driver.findElement(By.id("")));
//
//		WebElement slides = driver.findElement(By.id("slide_header"));// id: "shake_header"
//
//		Actions action = new Actions(driver);
//		// doubleClick--> double click on an element perform() method clicks on it.
//		action.doubleClick(slides).perform();
//		
//		
//
//	}
//
//	// @Test
//	public void hoverOverTest1() throws InterruptedException {
//		driver.get("https://www.amazon.com/");
//		WebElement hello = driver.findElement(By.xpath("//span[.='Hello. Sign in']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(hello).perform();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("Your Garage")).click();
//
//	}
//
//	// @Test
//	public void hoverTest2() {
//		driver.get("http://amazon.com");
//		Actions action = new Actions(driver);
//		// action.moveToElement(driver.findElement(By.xpath("//span[.='Back to
//		// top']"))).perform();
//		// action.moveByOffset(5, 5);
//		// action.moveToElement(null, 5, 5);
//		action.sendKeys(Keys.PAGE_DOWN).perform();
//		// press on key without letting it go
//
//	}
//
//	// @Test
//	public void dragDownTest1() {
//		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
//		Actions action = new Actions(driver);
//
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droptarget"));
//		action.dragAndDrop(source, target).perform();
//
//	}
//
//	@Test
//	public void dragDownTest2() {
//		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
//		Actions action = new Actions(driver);
//
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droptarget"));
//		action.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
//
//		action.dragAndDropBy(source, 0, -200).pause(1000).dragAndDropBy(source, 200, 0).pause(1000)
//				.dragAndDropBy(source, 0, -200).build().perform();
//
//	}

//	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
