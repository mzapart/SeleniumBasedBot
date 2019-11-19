import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Visit  {
	private String city;
	private String branch;
	private String category;
	private String service;
	private WebDriver driver;
	//private Doctor doctor;
	
	
	public Visit(WebDriver driver,String city, /*String branch*/ String category, String service) {
		this.driver = driver;
		this.city = city;
		this.branch = branch;
		this.category = category;
		this.service = service;
		
	} 	





	public void TeeUp () throws InterruptedException{
	
		Select city = new Select(driver.findElement(By.id("City")));
		city.selectByVisibleText(this.city);
		Thread.sleep(4000);
		Select category = new Select(driver.findElement(By.id("ListOfTypes")));
		category.selectByVisibleText(this.category);
		Thread.sleep(4000);
		Select service = new Select(driver.findElement(By.id("ListOfServices")));
		service.selectByVisibleText(this.service);
		driver.findElement(By.id("AcptRul")).click();

	}

}
