package QACRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1GoodLogin {
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();

	driver.get("http://localhost:3000/");
	WebElement buscadoNname = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[1]/input"));
	buscadoNname.sendKeys("angel");
	WebElement buscadorPass = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[2]/input"));
	buscadorPass.sendKeys("1234");

	driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[3]/input")).click();
	}
}
