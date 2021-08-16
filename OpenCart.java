package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.opencart.com/index.php?route=account/register");
driver.manage().window().maximize();
driver.findElement(By.id("input-username")).sendKeys("dheepan");
driver.findElement(By.id("input-firstname")).sendKeys("dheepankumar");
driver.findElement(By.id("input-lastname")).sendKeys("dk");
driver.findElement(By.id("input-email")).sendKeys("dheepan@yahoo.com");
WebElement country=driver.findElement(By.id("input-country"));
Select drpdwn=new Select(country);
drpdwn.selectByVisibleText("India");
driver.findElement(By.id("input-password")).sendKeys("asdd");
driver.findElement(By.linkText("Register")).click();

	}

}
