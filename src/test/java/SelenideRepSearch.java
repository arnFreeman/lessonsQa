
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepSearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        open("https://github.com/");
        $("[placeholder='Search or jump to...']").click();
        $("[name='query-builder-test']").setValue("selenide").pressEnter();
        $$("[data-testid=results-list]").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        $("div.Layout-sidebar").$(byText("Contributors"))
                        .closest(".BorderGrid-cell").$$("ul li").first().hover();
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
        sleep(5000);
    }
}
