import static com.codeborne.selenide.Condition.*;
import org.testng.annotations.Test;
import  Pages.auth;
import Pages.vacation;
import Pages.iurRegistr;
import Pages.iurAuth;
public class finalProject {
    private static auth auth = new auth();
    private static iurAuth iurAuth = new iurAuth();
    private static iurRegistr iurRegistr = new iurRegistr();
    private static vacation vacation = new vacation();
    public static void main(String[] args) {
       // pirveliTask();
        //meoreTask();
        //mesameTask()
        //meorxeTask()
    }

    @Test(priority = 1)
    private static void pirveliTask() {
        auth.Open();
        auth.clickLogin();
        auth.loginUser();
        auth.InfoAuth().should(appear);
        auth.InfoAuth().shouldHave(exactText(auth.text));

    }
    @Test( priority = 2)
    private static void meoreTask() {
        iurAuth.Gaxsna();
        iurAuth.GaxseniShesvlisGrafa();
        iurAuth.IuridiulisArcheva();
        iurAuth.TeqstisCveneba().should(appear);
        iurAuth.Checkbox().shouldBe(checked);
    }
    @Test(dependsOnMethods = {"meoreTask"}, priority = 3)
    private static void mesameTask() {
        iurRegistr.Open();
        iurRegistr.openModal();
        iurRegistr.IuridiulisArcheva();
        iurRegistr.Dropdown().selectOption(iurRegistr.saaqcio);
        iurRegistr.Registracia("coca_cola", "121212121212", "gori", "4554", "", "88888888", "88888888", "TOMA JABISHVILI", "20202020204", "599142332");
        iurRegistr.Message().shouldHave(exactText(iurRegistr.errorMesiji));

    }

    @Test(priority = 4)
    private static void meotxeTask(){
        vacation.openVacation();
        vacation.filter();
        vacation.Find();
        
    }


}
