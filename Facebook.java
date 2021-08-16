package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver drive= new ChromeDriver();
drive.get("https://en-gb.facebook.com/");
String Title= drive.getTitle();
System.out.println(Title);
drive.manage().window().maximize();
drive.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
drive.findElement(By.linkText("Create New Account")).click();
drive.findElement(By.name("firstname")).sendKeys("dheepan");
drive.findElement(By.name("lastname")).sendKeys("kumar");
drive.findElement(By.name("reg_email__")).sendKeys("dheepan2602@gmail.com");
drive.findElement(By.id("password_step_input")).sendKeys("abcd11");
WebElement day=drive.findElement(By.name("birthday_day"));
Select drpdwn =new Select(day);
drpdwn.selectByValue("26");
WebElement month=drive.findElement(By.id("month"));
Select drpdwn1=new Select(month);
drpdwn1.selectByIndex(1);
WebElement year=drive.findElement(By.id("year"));
Select drpdwn2=new Select(year);
drpdwn2.selectByVisibleText("1995");
WebElement radio =drive.findElement(By.linkText("Male"));
radio.click();

	}
	

}
