package QACRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3MovePages {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();

	driver.get("http://localhost:3000/");
	WebElement buscadoNname = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[1]/input"));
	buscadoNname.sendKeys("angel");
	WebElement buscadorPass = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[2]/input"));
	buscadorPass.sendKeys("1234");

	driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/div[3]/input")).click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/div[3]")).click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/div[2]")).click();
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("/html/body/div/div/nav/div[2]/div[1]")).click();
	}
}
