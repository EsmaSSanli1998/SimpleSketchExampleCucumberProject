package stepDefinition;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import pages.Pages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class StepDefinition {


    Pages pages = new Pages();

    Response response;
    private static String fakeUsername;
    private static String fakeSurname;
    private static String fakeSsn;
    private static String fakePhoneNumber;


    public static String emailGetAll;


    @Given("example uygulamasina giris yapilir")
    public void example_uygulamasina_giris_yapilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("giris yapildigi dogrulanir")
    public void giris_yapildigi_dogrulanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("bla bla sekmesine tiklanir")
    public void bla_bla_sekmesine_tiklanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("bla sla sayfasinin acildigi dogrulanir")
    public void bla_sla_sayfasinin_acildigi_dogrulanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("example butonuna tiklanir")
    public void example_butonuna_tiklanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("bilgiler eklenir")
    public void bilgiler_eklenir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("bilgilerin eklendigine dair alert dogrulanir")
    public void bilgilerin_eklendigine_dair_alert_dogrulanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("onaylama butonuna tiklanir")
    public void onaylama_butonuna_tiklanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("alisveris sayfasina gidildigi dogrulanir")
    public void alisveris_sayfasina_gidildigi_dogrulanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("sepet e tiklanir")
    public void sepet_e_tiklanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("yonlendirildigi dogrulanir")
    public void yonlendirildigi_dogrulanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("sayfaya yonlendirildigi dogrulanir")
    public void sayfaya_yonlendirildigi_dogrulanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






}


