package co.com.choucair.certification.pruebasafte.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screemplay.targets.Target;
import org.openga.selenium.By;

public class SearchCoursePage extends PageObject{
    public static final Target BUTTON_UC = Target.the( targetElementName "")
            .located(By.xpath("//"));
    public static final Target INPUT_COURSE = Target.the( targeElementName "")
            .located(By.id(""));
    public static final Target BUTTON_GO = Target.the( targetElementName "")
            .located(By.id(""));
    public static final Target SELECT_COURSE = Target.the( targetElementName "")
            .located(By.xpath(""));

}
