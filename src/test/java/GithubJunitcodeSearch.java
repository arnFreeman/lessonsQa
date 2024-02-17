import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.System.*;

public class GithubJunitcodeSearch {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://github.com/";

    }
    @Test
    void shouldFindJunit5code() {
            open("/selenide/selenide");
            $("#wiki-tab").click();
            $("[placeholder='Find a page…']").setValue("SoftAssertions").pressEnter();
            $$("ul.filterable-active div a").findBy(text("SoftAssertions")).click();

            $(".markdown-body").$(byText("Using JUnit5 extend test class:\n"+
                    "@ExtendWith({SoftAssertsExtension.class})\n"+
                    "class Tests {\n" +
                    "  @Test\n" +
                    "  void test() {\n" +
                    "    Configuration.assertionMode = SOFT;\n" +
                    "    open(\"page.html\");\n" +
                    "\n" +
                    "    $(\"#first\").should(visible).click();\n" +
                    "    $(\"#second\").should(visible).click();\n" +
                    "  }\n" +
                    "}"));
        sleep(2000);
        }

}
