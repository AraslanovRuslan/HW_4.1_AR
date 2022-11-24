package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private final String TITLE_TEXT = "Student Registration Form";
    private SelenideElement
        firstNameInput = $("#firstName"),
         lastNameInput = $("#lastName");
    public void openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

    }
    public void setFirstName(String value){
        firstNameInput.setValue(value);
    }
    public void setLastName(String value){
        lastNameInput.setValue(value);
    }
    public void setEmail(String value){
        $("#userEmail").setValue(value);
    }

}
