import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by 163 on 2017/4/23.
 */
public class hello {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.baidu.com");
    }
}
