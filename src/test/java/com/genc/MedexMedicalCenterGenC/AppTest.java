/*
 * This is just a test SeleniumUnit test file
 * --- DO NOT WRITE YOUR CODE IN HERE ----
 * Please make a new JUnit test case file for your Selenium test cases
 * Run this test file to check if selenium is working on your local repository
*/

package com.genc.MedexMedicalCenterGenC;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Test Comment 1
class AppTest {

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
	void test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.close();
	}

}
