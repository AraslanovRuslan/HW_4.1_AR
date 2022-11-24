package tests;

import org.junit.jupiter.api.Test;

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
        registrationPage.setStateCity();
        registrationPage.setSubmit();
        registrationPage.verifyResultsModalApperas();
        registrationPage.verifyResults("Student Name",userName + " Ivanov");
        registrationPage.verifyResults("Student Email", "Ivanov@mail.ru");
        registrationPage.verifyResults("Gender", "Other");
        registrationPage.verifyResults("Mobile", "8900076543");
        registrationPage.verifyResults("Date of Birth", "26 May,1990");
        registrationPage.verifyResults("Subjects", "Physics");
        registrationPage.verifyResults("Hobbies", "Reading");
        registrationPage.verifyResults("Picture", "paddington-g51aae444a_640.jpg");
        registrationPage.verifyResults("Address", "Some Address111");
        registrationPage.verifyResults("State and City", "NCR Delhi");
    }
}
