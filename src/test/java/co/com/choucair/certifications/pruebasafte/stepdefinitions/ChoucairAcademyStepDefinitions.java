package co.com.choucair.certifications.pruebasafte.stepdefinitions;

import co.com.choucair.certification.pruebasafte.tasks.OpenUp;
import co.com.choucair.certification.pruebasafte.tasks.Login;
import co.com.choucair.certifications.pruebasafte.search.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than andres wants to learn automation at the academy Choucair$")
    public void thanAndresWantsToLearnAutomationAtTheAcademyChoucair() throws Exception{
        OnStage.theActorCaLLed( requieredActor "Andres").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @when("^he search for the course (.*) on the choucair academy platform$")
    public void HeSearchForTheCourseRecursosAutomatizaciónUtestOnTheChoucairAcademyPlatform(String course) throws Exception {
        OnStage.theActorInTheSpotlight().attempsTo(Search.the(course));
    }

    @Then ("^he finds the course called resources Recursos Automatización Utest$")
    public void HeFindsTheCourseCalledResourcesRecursosAutomatizaciónUtest() throws Exception {

    }


}
