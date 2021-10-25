import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args){
        System.out.println("text");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");
        String searchFiledXpath = "//input";
        WebElement searchElement = driver.findElement(By.xpath(searchFiledXpath));
        searchElement.sendKeys("softserve learning and certification");
        searchElement.submit();
        String search1FiledXpath = "//h3";
        WebElement search1Element = driver.findElement(By.xpath(search1FiledXpath));
        search1Element.click();
        String url = driver.getCurrentUrl();
        if (url.contains("softserve")) {
            System.out.println("OK");
        }
        else {
            System.out.println("Error");
        }
        driver.quit();
    }
}
