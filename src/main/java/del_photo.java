
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class del_photo {
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
        WebElement move = driver.findElement(By.xpath("//div[class='item'][0]"));
        Actions builder = new Actions(driver);
        Action hover = builder.moveToElement(move).build();
        hover.perform();
        WebElement del = driver.findElement(By.xpath("a[@title='删除']"));
        del.click();


    }
}
