package week2.assignments.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		//Initialize the Chromedriver
		ChromeDriver driver = new ChromeDriver();

		//Launch URL "http://leaftaps.com/opentaps"
		driver.get("http://leaftaps.com/opentaps");

		//To maximize the browser window
		driver.manage().window().maximize();

		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		//Click on Accounts Button
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();

		//Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();

		//Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Ltd Acc");

		//Enter Description as "Selenium Automation Tester"
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");

		//Enter LocalName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Testleaf");

		//Enter SiteName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");

		//Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("1000000");

		//Select Industry as ComputerSoftware
		WebElement industryDD = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select ind = new Select(industryDD);
		ind.selectByIndex(3);

		//Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement ownershipDD =driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select own = new Select(ownershipDD);
		own.selectByVisibleText("S-Corporation");

		//Select Source as Employee using SelectByValue
		WebElement sourceDD = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select src =new Select(sourceDD);
		src.selectByValue("LEAD_EMPLOYEE");

		//Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		WebElement campaignDD = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select camp = new Select(campaignDD);
		camp.selectByIndex(6);

		//Select State/Province as Texas using SelectByValue 
		WebElement provinceDD = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select pro = new Select(provinceDD);
		pro.selectByValue("TX");

		//Click on Create Account using Xpath Locator
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String text = driver.findElement(By.xpath("//span[text()='Account Name']/following::span")).getText();
		System.out.println("Account name : " + text );

		//close the browser
		driver.close();

	}
}
