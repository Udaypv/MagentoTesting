

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver=driver;
	}
	By logout=By.linkText("Log Out");
	public void clckOnLogout() {
		driver.findElement(logout).click();
	}
}
