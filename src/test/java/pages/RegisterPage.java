package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class RegisterPage extends pages.PageObjects{


    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement enterCustomerFirstName;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
}
