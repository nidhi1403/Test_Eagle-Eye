package Test;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sales_Force {
	private static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/EE/");
		File app = new File(appDir, "truxField-release.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		//capabilities.setCapability("deviceName", "22c96ac2");
		capabilities.setCapability("deviceName", "0123456789ABCDEF");
		//capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformVersion", "5.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.trux.app.truxfield");
		capabilities.setCapability("appActivity", "com.trux.app.truxfield.LoginActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//capabilities.setCapability("unicodeKeyboard", "true");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(10000);
		//Login
		//Enter the Username
		driver.findElement(By.id("com.trux.app.truxfield:id/etUsername")).sendKeys("9953205665");
		//Enter the Password
		driver.findElement(By.id("com.trux.app.truxfield:id/etPassword")).sendKeys("1234");
		//Hide the Keyboard
		driver.navigate().back();
		//Click Remember Me
		driver.findElement(By.name("Remember Me")).click();
		//Select the Region
		driver.findElement(By.name("Select Region")).click();
		driver.findElement(By.name("India Region")).click();
		//driver.findElement(By.name("MENA Region")).click();
		//Click Login
		driver.findElement(By.name("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.name("Sales Force")).click();
		driver.findElement(By.id("com.trux.app.truxfield:id/btnSales")).click();
		driver.findElement(By.name("New")).click();
		driver.findElement(By.id("com.trux.app.truxfield:id/editTextTitle")).sendKeys("New Testing Lead One");
		driver.findElement(By.name("Save")).click();
		driver.findElement(By.id("com.trux.app.truxfield:id/editTextContactPersonName")).sendKeys("Nidhi Gupta");
		driver.findElement(By.id("com.trux.app.truxfield:id/editTextMobileNumber")).sendKeys("9971025218");
		driver.findElement(By.id("com.trux.app.truxfield:id/editTextEmailID")).sendKeys("nidhi@gmail.com");
		driver.hideKeyboard();
		WebElement element_document = driver.findElementById("com.trux.app.truxfield:id/spinnerDocumentType");
		element_document.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("Visiting Card");
		driver.findElementByName("Visiting Card").click();
		driver.findElementByName("Upload").click();
		driver.findElementByName("Camera").click();
		driver.findElement(By.id("com.android.gallery3d:id/camera_shutter")).click();
		driver.findElement(By.id("com.android.gallery3d:id/btn_done")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Register")).click();
		driver.findElementById("com.trux.app.truxfield:id/fromDateRange").click();
		driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'1 January 2017')] ")).click();
		driver.findElement(By.name("OK")).click();
		driver.findElementById("com.trux.app.truxfield:id/toDateRange").click();
		driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'13 January 2017')] ")).click();
		driver.findElement(By.name("OK")).click();
		driver.findElement(By.name("Submit")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.id("com.trux.app.truxfield:id/btnEvents")).click();
		driver.findElement(By.name("New")).click();
		WebElement element_lead = driver.findElementById("com.trux.app.truxfield:id/spinnerLeadSelection");
		element_lead.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("New Testing Lead");
		driver.findElementByName("New Testing Lead One").click();
		WebElement element_event = driver.findElementById("com.trux.app.truxfield:id/spinnerEventType");
		element_event.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("Call");
		driver.findElementByName("Call").click();
		driver.findElement(By.id("com.trux.app.truxfield:id/editTextEventDescription")).sendKeys("New Test Lead is Created");
		driver.hideKeyboard();
		WebElement element_next = driver.findElementById("com.trux.app.truxfield:id/spinnerNextStep");
		element_next.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("Further Call");
		driver.findElementByName("Further Call").click();
		driver.findElement(By.name("Submit")).click();
		WebElement element_search = driver.findElementById("com.trux.app.truxfield:id/spinnerSearchCriteria");
		element_search.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("This Week");
		driver.findElementByName("This Week").click();
		driver.findElement(By.name("Submit")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.name("Logout")).click();
		driver.findElement(By.name("Yes")).click();

	
		
		
	}
}
