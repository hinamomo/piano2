import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.net.MalformedURLException
import java.net.URL
import org.openqa.selenium.remote.DesiredCapabilities

class SampleTest {

    private var driver: AndroidDriver? = null

    @Before
    @Throws(MalformedURLException::class)
    fun setUp() {
        val desiredCapabilities = DesiredCapabilities()
        desiredCapabilities.setCapability("deviceName", "P3PDU17908001398")
        desiredCapabilities.setCapability("appPackage", "com.example.piano2")
        desiredCapabilities.setCapability("appActivity", "com.example.piano2.MainActivity")
        desiredCapabilities.setCapability("platformName", "Android")
        desiredCapabilities.setCapability("automationName", "Appium")
        desiredCapabilities.setCapability("platformVersion", "7.0")
        desiredCapabilities.setCapability("app", "/Users/momoko/AndroidStudioProjects/piano2/app/debug/app-debug.apk")

        val remoteUrl = URL("http://localhost:4723/wd/hub")

        driver = AndroidDriver(remoteUrl, desiredCapabilities)
    }

    @Test
    fun sampleTest() {
        val el1 = driver!!.findElementById("com.example.piano2:id/doButton") as MobileElement
        el1.click()
        val el2 = driver!!.findElementById("com.example.piano2:id/reButton") as MobileElement
        el2.click()
        val el3 = driver!!.findElementById("com.example.piano2:id/miButton") as MobileElement
        el3.click()
        val el4 = driver!!.findElementById("com.example.piano2:id/faButton") as MobileElement
        el4.click()
        val el5 = driver!!.findElementById("com.example.piano2:id/soButton") as MobileElement
        el5.click()
        val el6 = driver!!.findElementById("com.example.piano2:id/raButton") as MobileElement
        el6.click()
        val el7 = driver!!.findElementById("com.example.piano2:id/siButton") as MobileElement
        el7.click()
        val el8 = driver!!.findElementById("com.example.piano2:id/dohButton") as MobileElement
        el8.click()
    }

    @After
    fun tearDown() {
        driver!!.quit()
    }
}
