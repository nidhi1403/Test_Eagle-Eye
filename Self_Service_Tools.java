package Test;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;


public class Self_Service_Tools {
	private static AndroidDriver driver;
	public static void manage_city()
	{
		WebElement element_country = driver.findElementById("com.trux.app.truxfield:id/countrySpinner");
		element_country.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("India");
		driver.findElementByName("India").click();
		WebElement element_state = driver.findElementById("com.trux.app.truxfield:id/stateSpinner");
		element_state.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("Delhi");
		driver.findElementByName("Delhi").click();
		WebElement element_city = driver.findElementById("com.trux.app.truxfield:id/citySpinner");
		element_city.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("Delhi-NCR");
		driver.findElementByName("Delhi-NCR").click();
	}
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
		driver.findElement(By.id("com.trux.app.truxfield:id/etUsername")).sendKeys("9953205665");
		driver.findElement(By.id("com.trux.app.truxfield:id/etPassword")).sendKeys("1234");
		driver.navigate().back();
		driver.findElement(By.name("Remember Me")).click();
		driver.findElement(By.name("Select Region")).click();
		driver.findElement(By.name("India Region")).click();
		//driver.findElement(By.name("MENA Region")).click();
		driver.findElement(By.name("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("android.widget.ImageButton")).click();
		//Self Service 
		driver.findElement(By.name("Self Service Tools")).click();
		driver.findElement(By.id("com.trux.app.truxfield:id/vehicleAttendanceReportBT")).click();
		//driver.findElement(By.id("com.trux.app.truxfield:id/clientsSpinner")).click();
		//Select dropdown = new Select(driver.findElement(By.id("com.trux.app.truxfield:id/clientsSpinner")));
		//dropdown.selectByVisibleText("TruxApp Testing");
		WebElement element_client = driver.findElementById("com.trux.app.truxfield:id/clientsSpinner");
		element_client.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("TruxApp Testing");
		driver.findElementByName("TruxApp Testing").click();
		driver.findElementById("com.trux.app.truxfield:id/dateTV").click();
		driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'13 January 2017')] ")).click();
		driver.findElement(By.name("OK")).click();
		driver.findElement(By.name("Submit")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.trux.app.truxfield:id/eagleEyeAttendanceReportBT")).click();
		WebElement element_emp = driver.findElementById("com.trux.app.truxfield:id/empNameSpinner");
		element_emp.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("Manish  Manchanda");
		driver.findElementByName("Manish  Manchanda").click();
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("com.trux.app.truxfield:id/vehicleRunningBT")).click();
		driver.findElement(By.id("com.trux.app.truxfield:id/edtOne")).sendKeys("HR");
		driver.findElement(By.id("com.trux.app.truxfield:id/edtTwo")).sendKeys("29AF");
		driver.findElement(By.id("com.trux.app.truxfield:id/edtThree")).sendKeys("5516");
		driver.findElement(By.name("Past Data")).click();
		driver.navigate().back();
		driver.findElement(By.id("com.trux.app.truxfield:id/manageLeaveBT")).click();
		driver.findElementByName("Apply Leave").click();
		driver.findElementByName("New").click();
		driver.findElement(By.id("com.trux.app.truxfield:id/leaveTypeSp")).click();
		driver.findElementByName("Earned Leave (EL)").click();
		driver.findElementByName("From").click();
		driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'13 January 2017')] ")).click();
		driver.findElement(By.name("OK")).click();
		driver.findElementByName("To").click();
		driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'13 January 2017')] ")).click();
		driver.findElement(By.name("OK")).click();
		driver.findElement(By.name("Reason")).sendKeys("Sick");
		driver.findElement(By.id("com.trux.app.truxfield:id/applyLeaveBT")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.trux.app.truxfield:id/fromDateRange")).click();
		driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'5 January 2017')] ")).click();
		driver.findElement(By.name("OK")).click();
		driver.findElement(By.id("com.trux.app.truxfield:id/toDateRange")).click();
		driver.findElement(By.xpath("//android.view.View[contains(@content-desc,'15 January 2017')] ")).click();
		driver.findElement(By.name("OK")).click();
		driver.findElement(By.name("Search")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		//driver.findElement(By.id("com.trux.app.truxfield:id/manageLeaveBT")).click();
		//driver.findElementByName("Approve Leave").click();
		//driver.findElement(By.id("com.trux.app.truxfield:id/statusBT")).click();
		//driver.findElement(By.id("com.trux.app.truxfield:id/approveRB")).click();
		//driver.findElement(By.name("Yes")).click();
		//driver.navigate().back();
		driver.findElement(By.id("com.trux.app.truxfield:id/manageCityBT")).click();
		driver.findElement(By.name("Hub")).click();
		manage_city();
		driver.findElementByName("+ Add New Hub").click();
		driver.findElementByName("Hub Name").sendKeys("Testing Hub");
		driver.findElementByName("Register Now").click();
		driver.navigate().back();
		driver.findElement(By.id("com.trux.app.truxfield:id/manageCityBT")).click();
		driver.findElement(By.name("Cluster")).click();
		manage_city();
		WebElement element_country = driver.findElementById("com.trux.app.truxfield:id/hubSpinner");
		element_country.findElement(By.id("android:id/text1")).click();
		driver.scrollTo("abc");
		driver.findElementByName("abc").click();
		driver.findElementByName("+ Add New Cluster").click();
		driver.findElementByName("Cluster Name").sendKeys("Testing Cluster");
		driver.hideKeyboard();
		driver.findElementByName("Register Now").click();
		driver.navigate().back();
		driver.findElement(By.id("com.trux.app.truxfield:id/teamChartBT")).click();
		driver.findElement(By.id("com.trux.app.truxfield:id/topRL")).click();
		driver.navigate().back();
		driver.navigate().back();
		//Logout
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.name("Logout")).click();
		driver.findElement(By.name("Yes")).click();


	}
}
