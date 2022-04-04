package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUP() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {

        String name = "Pavel Pilatov";
        String currentAddress = "Russia, Khimki";

        open("/text-box");
        $("[id=userName]").setValue(name);
        $("[id=userEmail]").setValue("pilatov@gmail.com");
        $("[id=currentAddress]").setValue(currentAddress);
        $("[id=permanentAddress]").setValue("Russia, Moscow");
        $("[id=submit]").click();

//        $("[id=output]").shouldHave(text(name),text("pilatov@gmail.com"));
//        $("[id=output] [id=name]").shouldHave(text(name));
        $("[id=output]").$("[id=name]").shouldHave(text(name));
        $("p[id=currentAddress]").shouldHave(text("Current Address :"+currentAddress));


    }

}
