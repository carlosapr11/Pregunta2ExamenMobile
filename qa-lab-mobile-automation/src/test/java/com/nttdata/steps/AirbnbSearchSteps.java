package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    @Step("Click en cerrar")
    public void clickClose(){
        loginScreen.clickClose();
    }

    @Step("Click en cerrar nuevamente")
    public void clickClose2() {
        loginScreen.clickClose();
    }



    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        searchScreen.clickSearchInput();
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickFirstOption();
        searchDetailsScreen.clickNext();
        searchDetailsScreen.clickSearch();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return searchScreen.getResultText();
    }


}
