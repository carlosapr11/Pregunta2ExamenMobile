package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "2131432049") //se puede colocar (xpath = "....")
    private WebElement searchInput;

    @AndroidFindBy(id = "2131431007")
    private WebElement resultText;

    public void clickSearchInput(){
        //La buena practica es: primero asegurarse que exista (y pueda ser clickeable), antes de hacer clic
        //WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        //wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        //getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        searchInput.click();
    }

    public String getResultText(){
        return resultText.getText();
    }
}
