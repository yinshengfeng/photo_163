import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class alert {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://photo.163.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='http://blog.163.com/newpage/ursweb/tmpl2/loginurs.html']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("#x-URS-iframe")));
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("selenium88@126.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("123456abc");
        driver.findElement(By.cssSelector("#dologin")).click();
        System.out.println("hello");
        driver.findElement(By.className("album")).click();
        driver.findElement(By.partialLinkText("创建相册")).click();
        driver.findElement(By.name("fm-a")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("win");
    }
}
