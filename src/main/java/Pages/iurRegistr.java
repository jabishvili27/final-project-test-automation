package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class iurRegistr {

    private SelenideElement daloginebisGilaki = $(".swoop-login").$(withText("შესვლა"));
    private SelenideElement registraciisGrafa = $(".register");
    private SelenideElement iuridiuli = $("#ui-id-2");
    private SelenideElement legalFormDropdown = $("#lLegalForm");
    private SelenideElement TaxCode = $("#lTaxCode");
    private SelenideElement City = $("#lCity");
    private SelenideElement PostalCode = $("#lPostalCode");
    private SelenideElement PersonEmail = $("#lContactPersonEmail");
    private SelenideElement PersonPassword = $("#lContactPersonPassword");
    private SelenideElement PersonConfirmPassword = $("#lContactPersonConfirmPassword");
    private SelenideElement PersonName = $("#lContactPersonName");
    private SelenideElement PersonPersonalID = $("#lContactPersonPersonalID");
    private SelenideElement PersonPhone = $("#lContactPersonPhone");
    private SelenideElement legalTerms = $("#IsLegalAgreedTerms");
    private SelenideElement registerButton = $("a[onclick='SubmitLegalForm()']");
    private SelenideElement CompanyName = $("#lName");
    private SelenideElement Message = $("#legalInfoMassage");

    public String saaqcio = "სააქციო საზოგადოება";
    public String errorMesiji = "რეგისტრაციის დროს დაფიქსირდა შეცდომა!";



    public void openModal() {
        daloginebisGilaki.click();
    }
    public void Open() {
        Selenide.open("https://www.swoop.ge/");
    }

    public void IuridiulisArcheva() {
        registraciisGrafa.click();
        iuridiuli.click();
    }
    public SelenideElement Dropdown() {
        return legalFormDropdown;
    }
    public void Registracia(
            String companyName,
            String taxCode,
            String city,
            String postalCode,
            String email,
            String password,
            String confirmPassword,
            String personName,
            String personalID,
            String phone) {
        CompanyName.setValue(companyName);
        TaxCode.setValue(taxCode);
        City.setValue(city);
        PostalCode.setValue(postalCode);
        PersonEmail.setValue(email);
        PersonPassword.setValue(password);
        PersonConfirmPassword.setValue(confirmPassword);
        PersonName.setValue(personName);
        PersonPersonalID.setValue(personalID);
        PersonPhone.setValue(phone);
        legalTerms.click();
        registerButton.click();
    }
    public SelenideElement Message() {
        return Message;
    }
}
