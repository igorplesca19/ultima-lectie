package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
final static String NUME="sorinsu";
    WebDriver driver=null;
    WebElement webElement=null;
    @Given("User navigates to the website homepage")
    public void user_navigate_to_the_website_homepage(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\step\\IdeaProjects\\probleme\\src\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/");
        driver.manage().window().maximize();

    }
    @And("User navigates to Register Page")
    public void userNavigatesToRegisterPage(){
        String RegisterText = driver.findElement(By.partialLinkText("Reg")).getText();
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
        assertEquals(RegisterText, driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).getText());
        String signinUpIsEasy=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1")).getText();
        assertEquals(signinUpIsEasy, driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1")).getText());
    }

    @When("User gives firstName")
    public void user_give_firstName(){
        driver.findElement(By.id("customer.firstName")).sendKeys("sorin");

    }
    @And("User gives lastName")
    public void user_give_lastName(){
        driver.findElement(By.id("customer.lastName")).sendKeys("profu");

    }
    @And("User gives sSN")
    public void user_give_sSN(){
        driver.findElement(By.id("customer.ssn")).sendKeys("4576");

    }
    @And("User click button register")
    public void user_click_button_register(){
        String RegisterText = driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).getText();
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
        assertEquals(RegisterText, driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).getText());

    }
    @And("User has errors fields")
    public void user_has_errors_fields(){
        String street=driver.findElement(By.id("customer.address.street.errors")).getText();
        assertEquals(street, driver.findElement(By.id("customer.address.street.errors")).getText());
        String city=driver.findElement(By.id("customer.address.city.errors")).getText();
        assertEquals(city, driver.findElement(By.id("customer.address.city.errors")).getText());
        String state=driver.findElement(By.id("customer.address.state.errors")).getText();
        assertEquals(state, driver.findElement(By.id("customer.address.state.errors")).getText());
        String zipcode=driver.findElement(By.id("customer.address.zipCode.errors")).getText();
        assertEquals(zipcode, driver.findElement(By.id("customer.address.zipCode.errors")).getText());
        String username=driver.findElement(By.id("customer.username.errors")).getText();
        assertEquals(username, driver.findElement(By.id("customer.username.errors")).getText());
        String pasword=driver.findElement(By.id("customer.password.errors")).getText();
        assertEquals(pasword, driver.findElement(By.id("customer.password.errors")).getText());
        String repeatpasword=driver.findElement(By.id("repeatedPassword.errors")).getText();
        assertEquals(repeatpasword, driver.findElement(By.id("repeatedPassword.errors")).getText());

    }
    @And("User gives address")
    public void user_gives_address(){
        driver.findElement(By.id("customer.address.street")).sendKeys("34decebal");

    }
    @And("User gives city")
    public void user_gives_city(){
        driver.findElement(By.id("customer.address.city")).sendKeys("chisinau");

    }
    @And("User gives state")
    public void user_gives_state(){
        driver.findElement(By.id("customer.address.state")).sendKeys("moldova");

    }
    @And("User gives zip code")
    public void user_gives_zip_code(){
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("2038");

    }
    @And("User gives username")
    public void user_gives_username(){
        driver.findElement(By.id("customer.username")).sendKeys(NUME);

    }
    @And("User gives password")
    public void user_gives_password(){
        driver.findElement(By.id("customer.password")).sendKeys("klgfmn");

    }
    @And("User confirm password")
    public void user_confirm_password(){
        driver.findElement(By.id("repeatedPassword")).sendKeys("klgfmn");
        driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
    }
    @And("User has account confirmation")
    public void userHasAccountConfirmation() {
        String confirm=driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/h1")).getText();
        assertEquals(confirm, driver.findElement((By.xpath("//*[@id=\"rightPanel\"]/h1"))).getText());
    }
    @Then("User closes the window")
    public void user_closes_the_window()throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
        driver.quit();

    }
    @And("User has account duplication error")
    public void user_has_account_duplication_error(){
        driver.findElement(By.id("customer.username.errors")).isDisplayed();
    }
    @And("User insert username")
    public void user_insert_username(){
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys(NUME);

    }
    @And("User insert password")
    public void user_insert_password(){
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("klgfmn");

    }
    @And("User click login")
    public void user_click_login(){
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }
    @And("User has entry confirmation")
    public void userHasentryConfirmation() {
        String confirm=driver.findElement(By.xpath("//*[@id=\"showOverview\"]/h1")).getText();
        assertEquals(confirm, driver.findElement((By.xpath("//*[@id=\"showOverview\"]/h1"))).getText());
    }
    @And("User open new account")
    public void user_open_new_account(){
        driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
    }
    @And("User click type field")
    public void UserClickTypeField() {
        driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
    }
    @And("User click saving type")
    public void userClickSavingType() {
        driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
    }
    @And("User click open new account")
    public void userClickOpenNewAccount() {
        driver.findElement(By.xpath("//*[@id=\"openAccountForm\"]/form/div/input")).click();
    }
    @And("User has open account confirmation")
    public void userHasOpenAccountConfirmation() {
        String confirm=driver.findElement(By.xpath("//*[@id=\"openAccountResult\"]/h1")).getText();
        assertEquals(confirm, driver.findElement((By.xpath("//*[@id=\"openAccountResult\"]/h1"))).getText());
    }

}