package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.DroppableDraggablePage;

public class DragAndDropTests extends BaseTest {

    DroppableDraggablePage droppableDraggablePage;

    @Test
    public void dragAndDropTest() {
        droppableDraggablePage = new DroppableDraggablePage(driver);
        droppableDraggablePage.openDroppablePage();
        droppableDraggablePage.switchToFrame();
        droppableDraggablePage.dragElement();
        Assert.assertEquals(droppableDraggablePage.textMessage(),"Dropped!", "Text is not changed");
    }
}
