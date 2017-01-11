package Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Deployment {
	private static AndroidDriver driver;
	public static void swipe() throws InterruptedException
	{
		Dimension size = driver.manage().window().getSize();
		//System.out.println(size);
		//Find swipe start and end point from screen's with and height.
		//Find starty point which is at bottom side of screen.
		int starty = (int) (size.height * 0.80);
		//Find endy point which is at top side of screen.
		int endy = (int) (size.height * 0.20);
		//Find horizontal point where you wants to swipe. It is in middle of screen width.
		int startx = size.width / 2;
		//System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
		//Swipe from Bottom to Top.
		driver.swipe(startx, starty, startx, endy, 3000);
		Thread.sleep(2000);
		//Swipe from Top to Bottom.
		driver.swipe(startx, endy, startx, starty, 3000);

	}

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.name("Deployment")).click();
		driver.findElement(By.name("Ad-Hoc Request (Leased)")).click();
		driver.findElement(By.id("com.trux.app.truxfield:id/orderIdET")).sendKeys("1235");
		driver.findElement(By.id("com.trux.app.truxfield:id/submitBT")).click();
		driver.findElement(By.id("com.trux.app.truxfield:id/firstRL")).click();
		WebElement element_doc = driver.findElementById("com.trux.app.truxfield:id/documentTypeSpinner");
		element_doc.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("Parking");
		driver.findElementByName("Parking").click();
		driver.findElementByName("Submit").click();
		driver.findElement(By.id("com.trux.app.truxfield:id/clientOrderNumberET")).sendKeys("5679");
		driver.findElement(By.id("com.trux.app.truxfield:id/ammountET")).sendKeys("9765");
		driver.findElement(By.id("com.trux.app.truxfield:id/podGrNumberET")).sendKeys("6759");
		driver.findElement(By.id("com.trux.app.truxfield:id/btnPick")).click();
		driver.findElementByName("Camera").click();
		driver.findElementById("com.android.gallery3d:id/shutter_button_photo").click();
		driver.findElementById("com.android.gallery3d:id/btn_done").click();
		Thread.sleep(1000);
		driver.findElementById("com.trux.app.truxfield:id/uploadTripSheetBT").click();
		
		

	}

}
