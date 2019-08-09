package com.genc.MedexMedicalCenterGenC;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HelperLibrary {

	public static DesiredCapabilities disableImages() {
		final DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		final ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		Map<String, Object> prefs = new LinkedHashMap<>();
		prefs.put("profile.default_content_setting_values.images", 2);
		chromeOptions.setExperimentalOption("prefs", prefs);
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

		return capabilities;

	}

}
