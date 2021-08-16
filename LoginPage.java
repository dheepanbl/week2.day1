package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.Messages.Source;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		String title= driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HI");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("dheepan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		WebElement marketingCampignId=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpdwn = new Select( marketingCampignId);
		drpdwn.selectByIndex(2);
		WebElement  source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpdwn1= new Select(source);
		drpdwn1.selectByVisibleText("Employee");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("dheepan");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/26/1995");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("selenium");
		WebElement ownerShip =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select drpdwn2=new Select(ownerShip);
	drpdwn2.selectByIndex(6);
	WebElement industry =driver.findElement(By.id("createLeadForm_industryEnumId"));
   Select drpdwn3=new Select(industry);
   drpdwn3.selectByVisibleText("Press");
   driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
   driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8667706447");
   driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("629175");
   driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.dk.com");
   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dheepan2602@gmail.com");
   driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("abanish");
   driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("dheepankumar");
   driver.findElementByName("generalAddress1").sendKeys("18/61-B 'krishna',perumalkovilroad,tky");
   driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("nagerkovil");
   driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("629175");
   WebElement countryName=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
   Select drpdwn4=new Select(countryName);
  drpdwn4.selectByValue("IND");
  WebElement countryCode= driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
  countryCode.clear();
  countryCode.sendKeys("+91");
  driver.findElement(By.className("smallSubmit")).click();
  
 
  
   
   
   
	


			}
			

		}
