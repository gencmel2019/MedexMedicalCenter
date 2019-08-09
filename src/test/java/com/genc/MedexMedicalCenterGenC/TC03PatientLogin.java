package com.genc.MedexMedicalCenterGenC;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TC03PatientLogin {

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
	void testPatientLogin() {
		// step 1: User enters correct url
		driver.get(baseUrl);

		// step 2: User clicks patient link
		driver.findElement(By.linkText("PATIENT")).click();

		// step 3: User enters correct user id and password
		driver.findElement(By.id("loginID")).sendKeys("p230");
		driver.findElement(By.id("loginPass")).sendKeys("Pass1234");

		driver.findElement(By.id("pateintLogin")).submit();

		// assert to check that the patient successfully logs in
		String title = driver.getTitle();
		String expected = "Patient Home - Medex Medical Center";
		String errorMsg = "TC03 Fail: Titles don't match.";

		assertEquals(title, expected, errorMsg);

		// close the window
		driver.close();

	}

}
