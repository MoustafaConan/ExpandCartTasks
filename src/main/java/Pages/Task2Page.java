package Pages;

import com.aventstack.extentreports.App;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Task2Page extends PageBase {

    public Task2Page(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    @FindBy(id = "action-dropdown-parent-Categories")
    WebElement CategoriesMenu;

    @FindBy(linkText = "Educational")
    WebElement educationLink;

    @FindBy(xpath = "//*[@id='action-dropdown-parent-Educational']/span[1]")
   public WebElement element;

    @FindBy(className = "pvVVcb")
    public WebElement Apps;

    public void clickOneducationLink() {

        CategoriesMenu.click();
        educationLink.click();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public void clickOnApps(){
        Apps.click();
    }



}
