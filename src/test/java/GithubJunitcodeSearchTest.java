import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.System.out;

public class GithubJunitcodeSearchTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";

    }
    @Test
    void shouldFindJunit5code() {
            open("/selenide/selenide");
            $("#wiki-tab").click();
            $("[placeholder='Find a page…']").setValue("SoftAssertions").pressEnter();
            $$("#wiki-pages-box").findBy(text("SoftAssertions")).click();
            out.println("SoftAssertions найден");

            $(".markdown-body").$(byText("""
                    Using JUnit5 extend test class:
                    @ExtendWith({SoftAssertsExtension.class})
                    class Tests {
                      @Test
                      void test() {
                        Configuration.assertionMode = SOFT;
                        open("page.html");

                        $("#first").should(visible).click();
                        $("#second").should(visible).click();
                      }
                    }"""));
            sleep(2000);
        }

}
