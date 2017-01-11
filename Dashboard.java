package Test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class Dashboard {
	private static AndroidDriver driver;
	public static void swipe() throws InterruptedException
	{
		Dimension size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;
		driver.swipe(startx, starty, startx, endy, 3000);
		Thread.sleep(2000);
		driver.swipe(startx, endy, startx, starty, 3000);

	}
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot,"/Apps/EE/");
		File app = new File(appDir,"truxField-release.apk");
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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(10000);
		//Login
		driver.findElement(By.id("com.trux.app.truxfield:id/etUsername")).sendKeys("9953205665");
		driver.findElement(By.id("com.trux.app.truxfield:id/etPassword")).sendKeys("1234");
		driver.navigate().back();
		driver.findElement(By.name("Remember Me")).click();
		driver.findElement(By.name("Select Region")).click();
		driver.findElement(By.name("India Region")).click();
		//driver.findElement(By.name("MENA Region")).click();
		driver.findElement(By.name("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Birthdays")).click();
		swipe();
		driver.findElement(By.name("LeaderBoard")).click();
		swipe();
		driver.findElement(By.name("Announcement")).click();
		swipe();
		driver.findElement(By.className("android.widget.ImageButton")).click();
		//Logout
		driver.findElement(By.name("Logout")).click();
		driver.findElement(By.name("Yes")).click();
	}

}
