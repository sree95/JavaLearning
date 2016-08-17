package AdvancedTopics;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Profile {

	@Test
	public void FFProfile() {
		
		/*ProfilesIni profilesIni = new ProfilesIni();
		FirefoxProfile ffProfile = profilesIni.getProfile("Selenium");
		ffProfile.setPreference("browser.startup.homepage", "https://www.google.co.in/");
		
		ffProfile.setAcceptUntrustedCertificates(true);
		ffProfile.setAssumeUntrustedCertificateIssuer(false);
		WebDriver driver = new FirefoxDriver(ffProfile);
		
		driver.get("https://cacert.org/");*/
		
		/*DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new FirefoxDriver(dc);
		driver.get("https://cacert.org/");*/
	}
	
}
