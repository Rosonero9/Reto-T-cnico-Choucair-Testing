package co.com.choucair.certifications.pruebasafte.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Search implements Task {
    public static Object the(String course) {
        return Tasks.instrumented(Search.class);
    }

    @override
    public <T extends Actor> void performAs(T actor){

    }
}
