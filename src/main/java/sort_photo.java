import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class sort_photo {
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
        driver.findElement(By.partialLinkText("排序")).click();
        driver.findElement(By.partialLinkText("自定义排序")).click();
        WebElement C = driver.findElement(By.xpath("//div[@title='C']"));
        WebElement A=driver.findElement(By.xpath("//div[@title='B'"));
        Actions act=new Actions(driver);
        act.dragAndDrop(C,A).perform();
    }
}
