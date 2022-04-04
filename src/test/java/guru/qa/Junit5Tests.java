package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Junit5Tests {

    @BeforeAll
    static void initDB() {
        System.out.println("Init DB");
    }

    @BeforeEach
    void openYaPage() {
        Selenide.open("https://ya.ru");
    }

    @AfterEach
    void close() {
        WebDriverRunner.closeWindow();
    }

    @Test
    void assertTest0() {
        // поиск в новостях

    }

    @Test
    void assertTest1() {
        // поиск в картинках
    }


}
