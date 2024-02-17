import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class dragAndDropTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();
        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
        $("#column-a").shouldBe(text("B"));
        sleep(2000);
    }
}
