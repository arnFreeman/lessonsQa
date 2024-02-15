import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class selenideRepSearch {
    @Test
    void shouldFindSelenideRepositoryAtTheTop() {

        open("https://github.com/");
        $("[placeholder='Search or jump to...']").click();
        $("[name='query-builder-test']").setValue("selenide").pressEnter();
        $$("[class='Box-sc-g0xbh4-0 kXssRI']").first().$("Text-sc-17v1xeu-0 qaOIC search-match").click();

        sleep(5000);



    }
}
