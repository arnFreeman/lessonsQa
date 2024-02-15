import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        open("https://github.com/");
        $("[placeholder='Search or jump to...']").click();
        $("[name='query-builder-test']").setValue("selenide").pressEnter();
        $$("results-list").first().$("/a").click();
        sleep(5000);



    }
}
