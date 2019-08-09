package com.genc.MedexMedicalCenterGenC;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC01WelcomeTest {

	WebDriver driver;
	String baseUrl;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver(HelperLibrary.disableImages());
		baseUrl = "http://ctsc00849530701:9000/MedexMedicalCenter/";
	}

	@AfterEach
	void tearDown() throws Exception {
		driver = null;
	}

	@Test
	void testWelcomeTest() {
		driver.get(baseUrl);

		String title = driver.getTitle();
		String expected = "Medex Medical Center";

		assertEquals(title, expected, "TC01 Fail: Title doesn't match to " + expected);

		driver.close();
	}

}
