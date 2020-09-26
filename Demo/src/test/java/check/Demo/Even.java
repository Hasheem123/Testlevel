package check.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Even {
	
	public static WebDriver driver;


	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount%3Fnc%3D1&dsh=S-66542055%3A1600767709727523&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		
		
		
        
		WebElement Firstname =driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		Firstname.sendKeys("Hasheeem");
		
		WebElement Lastname =driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		Lastname.sendKeys("S");
      
		WebElement Username =driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Lastname.sendKeys("shasheem745");
		
		WebElement pass =driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
		pass.sendKeys("Hasheem@777");
		
		WebElement Confirm =driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
		Confirm.sendKeys("Hasheem@7777");
		
		WebElement Next =driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span"));
		Next.click();

}
}





