package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrls;

public class DroppableDraggablePage extends BasePage {

    Actions actions = new Actions(driver);

    @FindBy(id = "draggable")
    private WebElement draggable;

    @FindBy(id = "droppable")
    private WebElement droppable;

    @FindBy(xpath = "//div[@id='droppable']//p")
    private WebElement textMessage;

    @FindBy(xpath = "//iframe[@class='demo-frame']")
    private WebElement frame;

    public DroppableDraggablePage(WebDriver driver) {
        super(driver);
    }

    public void openDroppablePage() {
        driver.get(WebUrls.DROPPABLE_URL);
    }

    public void switchToFrame() {
        driver.switchTo().frame(frame);
    }

    public void dragElement() {
        actions.dragAndDrop(draggable, droppable).build().perform();
    }

    public String textMessage() {
        return textMessage.getText();
    }
}
