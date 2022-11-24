package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
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
    public void setGender(String value){
        $("#genterWrapper").$(byText(value)).click();
    }
    public void setNumber(String value){
        $("#userNumber").setValue(value);
    }
    public void setValue(String value){
        $("#subjectsInput").setValue(value).pressEnter();
    }
    public void setWrapper(String value){
        $("#hobbiesWrapper").$(byText(value)).click();
    }
    public void setPicture(String value){
        $("[id=uploadPicture]").uploadFile(new File(value));
    }
    public void setAddress(String value){
        $("#currentAddress").setValue(value);
    }
    public void setState(){
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
    }
    public void setCity(){
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
    }
    public void setSubmit() {
        $("#submit").click();
    }


}
