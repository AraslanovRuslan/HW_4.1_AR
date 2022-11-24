package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestutomationWithPageObjectsTests {
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }
    @Test
    void formTests(){
        String userName = "Ivan";

        registrationPage.openPage();

        registrationPage.setFirstName(userName);
        registrationPage.setLastName("Ivanov");
        registrationPage.setEmail("Ivanov@mail.ru");
        registrationPage.setGender("Other");
        registrationPage.setNumber("8900076543");
        registrationPage.setValue("Physics");
        registrationPage.setWrapper("Reading");
        registrationPage.setPicture("src/test/resources/paddington-g51aae444a_640.jpg");
        registrationPage.setAddress("Some Address111");
        registrationPage.setState();
        registrationPage.setCity();
        registrationPage.setSubmit();


        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--026").click();




     //   $("#submit").click();

        $(".modal-content").shouldBe(Condition.visible);
        $(".modal-content").shouldHave(text("Ivan Ivanov"));
        $(".modal-content").shouldHave(text("Ivanov@mail.ru"));
        $(".modal-content").shouldHave(text("Other"));
        $(".modal-content").shouldHave(text("8900076543"));
        $(".modal-content").shouldHave(text("26 May,1990"));
        $(".modal-content").shouldHave(text("Physics"));
        $(".modal-content").shouldHave(text("Reading"));
//        $(".modal-content").shouldHave(text("paddington-g51aae444a_640.html"));
        $(".modal-content").shouldHave(text("Some Address"));
        $(".modal-content").shouldHave(text("NCR Delhi"));
        $("#closeLargeModal").click();

    }



}
