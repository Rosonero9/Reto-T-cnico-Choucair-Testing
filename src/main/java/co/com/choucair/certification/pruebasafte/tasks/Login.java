package co.com.choucair.certification.pruebasafte.tasks;

import co.com.choucair.certification.pruebasafte.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @override
    public <T extends Actor> void performsAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON));
            Enter.theValue("jsmith@example.com").into(ChoucairLoginPage.INPUT_USER),
            Enter.theValue("Introduzca su contraseña").into(ChoucairLoginPage.INPUT_PASSWORD),
            Click.on(ChoucairLoginPage.ENTER_BUTTON));
    }
}
