import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class selenideRepSearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        open("https://github.com/");
        $("[placeholder='Search or jump to...']").click();
        $("[name='query-builder-test']").setValue("selenide").pressEnter();
        $$("[data-testid=results-list]").first().click();

        sleep(5000);



    }
}
