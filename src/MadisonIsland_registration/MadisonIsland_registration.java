package MadisonIsland_registration;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MadisonIsland_registration {

   public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://magento-demo.lexiconn.com/customer/account/create/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Ahmed");
driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Assem");
driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("eng.ahmedassem96@gmail.com");
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("bmw010@#$");
driver.findElement(By.xpath("//*[@id=\"confirmation\"]")).sendKeys("bmw010@#$");
driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button")).click();
    }
    
}

