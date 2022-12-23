package Pages;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class iurAuth {
    private SelenideElement daloginebisGilaki = $(".swoop-login").$(withText("შესვლა"));
    private SelenideElement registraciisGrafa = $(".register");
    private SelenideElement iuridiuli = $("#ui-id-2");
    private SelenideElement text = $("#register-content-2 h4");
    private SelenideElement checkbox = $("#IsLegalSubscribedNewsletter");


    public void GaxseniShesvlisGrafa() {
        daloginebisGilaki.click();
    }
    public void Gaxsna() {
        Selenide.open("https://www.swoop.ge/");
    }

    public void IuridiulisArcheva() {
        registraciisGrafa.click();
        iuridiuli.click();
    }

    public SelenideElement TeqstisCveneba() {
        return text;
    }

    public SelenideElement Checkbox() {
        return checkbox;
    }

}
