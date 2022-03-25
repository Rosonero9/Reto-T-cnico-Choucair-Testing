package co.com.choucair.certification.pruebasafte.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitibdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject{
    public static final Target LOGIN_BUTTON = Target.the( targetElementName "button that shows us the form to login")
            .located(By.xpath("//<a class=\"unauthenticated-nav-bar__sign-up\" ui-sref=\"signup.personal\" href=\"/signup/personal\">Join Today</a>"));
    public static final Target INPUT_USER = Target.the( targeElementName "where do we write the user")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the( targetElementName "where do we write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the( targetElementName "button to confirm login")
            .located(By.xpath("<button class=\"btn\" name=\"login\" id=\"kc-login\" type=\"submit\" value=\"Sign In\" _msthash=\"109044\" _msttexthash=\"234910\">Inicia sesión</button>"));
}
