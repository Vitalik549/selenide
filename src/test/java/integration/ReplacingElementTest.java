package integration;

import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ReplacingElementTest extends IntegrationTest {
  @Before
  public void openTestPage() {
    openFile("page_with_replacing_elements.html");
  }

  @Test
  public void shouldWaitsUntilElementIsReplaced() {
    $("#dynamic-element").shouldBe(visible);
    $("#dynamic-element").shouldHave(cssClass("reloaded"), text("I am back"));
  }
}
