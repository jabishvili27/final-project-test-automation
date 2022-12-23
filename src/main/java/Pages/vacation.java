package Pages;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Selenide;

public class vacation {
    private ElementsCollection min = $$("#minprice");
    private ElementsCollection max = $$("#maxprice");
    private ElementsCollection modzebnisGilaki = $$(".submit-button");
    private SelenideElement dasvenebaGilaki = $(".cat-2");

    public void openVacation() {
        Selenide.open("https://www.swoop.ge/");
        dasvenebaGilaki.click();
    }
    public void filter(){
        min.last().setValue("170");
        max.last().setValue("180");
    }

    public void Find(){
        modzebnisGilaki.last().click();
    }
}
