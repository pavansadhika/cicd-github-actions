package com.javatechie.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootTest
class GithubCicdActionsApplicationTests {

	public WebDriver driver; 
	public String baseUrl = "https://www.lambdatest.com/"; 
	@Test
	void contextLoads() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  
		driver.manage().window().maximize();  
		driver.get(baseUrl);
		driver.close();
	}

}










