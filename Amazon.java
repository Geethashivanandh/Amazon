package seleniumprog;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		//this is to set system property to acess the browser
		System.setProperty("webdriver.edge.driver", "C://Selenium//msedgedriver.exe");
		EdgeDriver driver;
		driver = new EdgeDriver();  //this is object
		driver.get("https://www.amazon.in/"); //opens the url
		driver.manage().window().maximize();      //to maximize the screen
		
		driver.findElement(By.xpath("//*[@class='nav-line-2 ']")).click(); //this will go click on menu Hello sign in
		
		//we are finding the elemnt by id
	driver.findElement(By.id("ap_email")).sendKeys("gita.mech295@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Getin123");
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(3000); //sleep time duration
	//driver.findElement(By.id("searchDropdownBox")).click();
	//Thread.sleep(3000); //sleep time duration
	//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("think like a monk");
	Thread.sleep(3000); //sleep time duration
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000); //sleep time duration
	
	//VERICAL SCROLL
	//i want to scroll the page little down 
			//it will scroll 1000 pixel down
	JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,1000)");
     Thread.sleep(2000);
     //HORIZONTAL SCROLL
    // WebElement Element = driver.findElement(By.linkText("VBScript"));
     //This will scroll the page Horizontally till the element is found		
     //js.executeScript("arguments[0].scrollIntoView();", Element);
    
    // driver.navigate().refresh(); //refresh the page
    // Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div")).click();
	 Thread.sleep(3000);
	//driver.findElement(By.id("add-to-cart-button")).click();
	// driver.navigate().refresh(); //refresh the page
	 //Thread.sleep(2000);
	 String parenttab = driver.getWindowHandle();
	 Set<String> tabs = driver.getWindowHandles();
 for(String handles:tabs)
 {
	 driver.switchTo().window(handles);
	 Thread.sleep(3000);
	 
	}
 
	 driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
	}

}
