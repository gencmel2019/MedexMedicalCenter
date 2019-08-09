package com.genc.MedexMedicalCenterGenC;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC04AppointmentTest {

	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://ctsc00849530701:9000/MedexMedicalCenter/";
	}

	@AfterEach
	void tearDown() throws Exception {
		driver = null;
	}

	@Test
	void testAppointmentTest() {
		driver.get(baseUrl);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String URL = driver.getCurrentUrl();
		assertEquals(URL, "http://ctsc00849530701:9000/MedexMedicalCenter/index.html");
		driver.findElement(By.xpath("//*[@id='menu']/li[2]/a")).click();
		String URL1 = driver.getCurrentUrl();
		assertEquals(URL1, "http://ctsc00849530701:9000/MedexMedicalCenter/Patient_Login.html");
		driver.close();

	}

}
