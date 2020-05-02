

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver=driver;
	}
	By email=By.id("email");
	By password=By.id("pass");
	By login=By.id("send2");
	public void loginAction(String un,String pwd) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(email).sendKeys(un);
		Thread.sleep(5000);
		driver.findElement(password).sendKeys(pwd);
		Thread.sleep(5000);
		driver.findElement(login).click();
	}
}
