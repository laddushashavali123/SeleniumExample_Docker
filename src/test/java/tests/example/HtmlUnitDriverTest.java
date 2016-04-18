package tests.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverTest {

@Test
public void as() {
                WebDriver driver = new HtmlUnitDriver(true);

		driver.get("http://www.google.com");
		driver.navigate().to("http://www.google.com");

		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("docker");
		element.submit();
		// Should see: "docker - Google Search"
		Assert.assertEquals("docker - Google Search", driver.getTitle());
		//Close the browser
		driver.quit();
	}

}
