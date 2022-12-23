package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class auth {
    private SelenideElement loginButton = $(".swoop-login").$(withText("შესვლა"));
    private SelenideElement  authInfo = $("#authInfo");
    private SelenideElement email = $(byName("Email"));
    private SelenideElement authButton = $("#AuthBtn");
    private SelenideElement password = $(byName("password"));

    public String loginEmail = "toma@gmail.com";
    public String loginPassw = "987654321";
    public String text = "მეილი ან პაროლი არასწორია, თუ დაგავიწყდათ პაროლი,გთხოვთ ისარგებლოთ პაროლის აღდგენის ფუნქციით!";


    public void clickLogin() {
        loginButton.click();
    }

    public SelenideElement InfoAuth() {
        return authInfo;
    }

    public void Open() {
        Selenide.open("https://www.swoop.ge/");
    }

    public void loginUser(){
        email.setValue(loginEmail);
        password.setValue(loginPassw);
        authButton.click();

    }
}
