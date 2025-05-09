package Dhanvith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice {
	WebDriver driver;
@Test()
	public void test() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("standard_user");
		driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[2]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		driver.quit();
}
	@Test
	public void m1() {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("standard_user");
	driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[2]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	driver.quit();
	}
}

