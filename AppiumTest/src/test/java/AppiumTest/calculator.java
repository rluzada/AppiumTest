package AppiumTest;

import java.io.IOException;
//import java.net.MalformedURLException;
import java.net.URL;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;

public class calculator {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OpenCalculator();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
		
	}
		
		public static void OpenCalculator() throws IOException {
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "PulbosMan");
			cap.setCapability("udid", "RBUNW19112005875");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion","9.1.0");
			
			cap.setCapability("appPackage", "com.android.calculator2");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			
			driver = new AppiumDriver<MobileElement>(url,cap);			
			
			System.out.println("Application starting..");
			
			
			
			
		}

	

}
