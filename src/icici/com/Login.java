package icici.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\ICICIBank4\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.icicibank.com/");
String title = driver.getTitle();
System.out.println(title);

String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

WebElement btnlogin = driver.findElement(By.xpath("//a[@id = 'login-btn']"));
btnlogin.click();

WebElement Txtid = driver.findElement(By.xpath("//input[@id = 'DUMMY1']"));
Txtid.sendKeys("mohamed");


	}

}
