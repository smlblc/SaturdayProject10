package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://demoqa.com/text-box");
        WebElement app = driver.findElement(By.id("userName"));
        app.sendKeys("Automation");
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("Testing@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Testing Current Address part 1");
        WebElement currentAddress1 = driver.findElement(By.id("permanentAddress"));
        currentAddress1.sendKeys("Testing Current Address part 2");
        driver.manage().window().maximize();

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0, 300);");
        Thread.sleep(3000);
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement name = driver.findElement(By.id("name"));
        System.out.println(name.getText().substring(5));
        
        WebElement email = driver.findElement(By.id("email"));
        System.out.println(email.getText().substring(6));
    }

    /*
        1) Navigate to  http://demoqa.com/text-box

        2) Enter full name as "Automation"

        3) Enter Email as "Testing@gmail.com"

        4) Enter Current Address 1 as "Testing Current Address part 1"

        5) Enter Current Address 2 "Testing Current Address part 2"

        6) Click on submit button

        7) Print the name

        8) Print Email is containing the "Testing"

     */
}
