import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {

	private String password;
	private String login;
	private WebDriver driver;
	public User(WebDriver driver,String login,String password) {
		this.driver = driver;
		this.login = login;
		this.password = password;
	}
	
	public void zaloguj() throws InterruptedException {

		driver.get("https://online.enel.pl/Account/Login");
		driver.findElement(By.id("Login")).sendKeys(login);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("IsAcceptedRule")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("Password")).submit();
		driver.get("https://online.enel.pl/Visit/New");
		
	}
}
