import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by 163 on 2017/4/21.
 */
public class comment_photo {
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
        driver.findElement(By.xpath("//img[@title='C']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='j-main']//iframe")));
        driver.findElement(By.xpath("//body")).sendKeys("hello");
        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector(".ui-btn")).click();
        driver.quit();


    }
}
