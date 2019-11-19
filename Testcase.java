import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//C:\Users\Maciej\Desktop\selenium
public class Testcase extends Thread{
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maciej\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		User uzytkownik = new User(driver,Constants.username,Constants.password);
		uzytkownik.zaloguj();
		Visit wizyta = new Visit(driver,"Kraków","Konsultacje", "Konsultacja okulistyczna");
		wizyta.TeeUp();
		
	}
}

