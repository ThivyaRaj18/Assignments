package week2.assignments.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbAccount {

	public static void main(String[] args) {
		//Initialize the chrome driver
		ChromeDriver driver = new ChromeDriver();

		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		//Maximize the window
		driver.manage().window().maximize();

		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Click on Create New Account button
		driver.findElement(By.linkText("Create new account")).click();

		//Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Thivya");

		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raj");

		//Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9741251527");

		//Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Thivya18");

		//Handle all three dropdowns in Date of birth

		//selecting day byindex
		WebElement dayDD = driver.findElement(By.id("day"));
		Select day = new Select(dayDD);
		day.selectByIndex(3);

		//selecting month byvisibletext
		WebElement monthDD = driver.findElement(By.id("month"));
		Select month =new Select(monthDD);
		month.selectByVisibleText("Jun");

		//Selecting year byvalue
		WebElement yearDD = driver.findElement(By.id("year"));
		Select year = new Select(yearDD);
		year.selectByValue("1967");

		//Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
