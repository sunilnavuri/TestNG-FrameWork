package sep7;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil;

public class SecondTestNGClass extends AppUtil  {
@Test
public void addition() throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("54612");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='+']")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("display")).sendKeys("652");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='=']")).click();
	Thread.sleep(1000);
	String adds = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(adds,true);
}
@Test
public void division() throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("6666666");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='/']")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("display")).sendKeys("62");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='=']")).click();
	Thread.sleep(1000);
	String divs = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(divs,true);
}
@Test
public void multiplication() throws Throwable
{
	driver.findElement(By.name("display")).sendKeys("54");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='x']")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("display")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='=']")).click();
	Thread.sleep(1000);
	String mults = driver.findElement(By.name("display")).getAttribute("value");
	Reporter.log(mults,true);
}
}
