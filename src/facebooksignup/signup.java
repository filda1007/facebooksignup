package facebooksignup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) {
		
		//set the path to the ChromeDriver executable
				System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//create a new instance of the ChromeDriver
				WebDriver driver = new ChromeDriver();
		//Navigate to demoqa login page using GET method and navigate method
				driver.get("https://demoqa.com/automation-practice-form");
				
			    driver.manage().window().maximize();
			    
			    
			    //To insert values to first name
			    WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
				firstname.sendKeys("filda");
				
				//To insert values to last name
			    WebElement lastname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
				lastname.sendKeys("Rodrigues");
				
				//To insert values to Email
			    WebElement email = driver.findElement(By.id("userEmail"));
				email.sendKeys("filda@gmail.com");
				
				//To check gender click 
			    WebElement gender = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
				gender.click();
				
				//To insert values to mobile
			    WebElement mobile = driver.findElement(By.id("userNumber"));
				mobile.sendKeys("123456789");
				
				//To insert values to subjects
			    //WebElement subject = driver.findElement(By.id("userNumber"));
				//subject.sendKeys("test");
				
				//To check hobbies
				WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
				hobbies.click();
				
			   // WebElement submit = driver.findElement(By.id("submit"));
				//submit.click();
				
				//
	}

}
