package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestutomationWithPageObjectsTests extends TestBase {

    @Test
    void formTests() {
        String userName = "Ivan";

        registrationPage.openPage();

        registrationPage.setFirstName(userName);
        registrationPage.setLastName("Ivanov");
        registrationPage.setEmail("Ivanov@mail.ru");
        registrationPage.setGender("Other");
        registrationPage.setNumber("8900076543");
        registrationPage.setBirthDate("26", "May", "1990");
        registrationPage.setValue("Physics");
        registrationPage.setWrapper("Reading");
        registrationPage.setPicture("src/test/resources/paddington-g51aae444a_640.jpg");
        registrationPage.setAddress("Some Address111");
        registrationPage.setState();
        registrationPage.setCity();
        registrationPage.setSubmit();
        registrationPage.verifyResultsModalApperas();
        registrationPage.verifyResults("Student Name",userName + " Ivanov");
        registrationPage.verifyResults("Student Email", "Ivanov@mail.ru");
        registrationPage.verifyResults("Gender", "Other");
        registrationPage.verifyResults("Mobile", "8900076543");
        registrationPage.verifyResults("Date of Birth", "26 May,1990");

    }


}
