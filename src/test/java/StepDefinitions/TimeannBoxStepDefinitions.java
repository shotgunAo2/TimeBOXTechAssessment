package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import apiObjects.timeandbox.*;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;


public class TimeannBoxStepDefinitions {
    public static TimeandboxObject timeandboxobject;

    @Given("I execute the time and box api")
    public void iExecuteTheTimeAndBoxApi() {
        RestAssured restAssured = new RestAssured();
        Response resTimeAndBox = given()
                .relaxedHTTPSValidation()
                .with().contentType(ContentType.ANY).when().get("https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false")
                .then().extract().response();
        try {
            assert resTimeAndBox.statusCode() == 20;
        } catch (AssertionError e) {
            Assert.fail("Api returned invalid status response "+ resTimeAndBox.statusCode());
        }

        timeandboxobject = resTimeAndBox.as(TimeandboxObject.class);
    }

    @Then("the response name is {string}")
    public void theResponseNameIs(String serviceName) {
        Assert.assertEquals("Service Name does not match",serviceName,timeandboxobject.getName());
    }

    @And("CanRelist is {string}")
    public void is(String strCanRelist) {
        Boolean boolCanRelist = Boolean.parseBoolean(strCanRelist);
        Assert.assertEquals("CanRelist is incorrect",boolCanRelist,timeandboxobject.getCanRelist());
    }

    @And("Promotions has an element that has a name of {string} and the description contains {string}")
    public void promotionsHasAnElementThatHasANameOfAndTheDescriptionContains(String promotionName, String promotionDescription) {
        List<Promotion> promotion = timeandboxobject.getPromotions().stream().filter(e->e.getName().contains(promotionName)).toList();
        Assert.assertTrue("There are no promoations with the name "+promotionName,promotion.size()==1);
        Assert.assertEquals("Promotion description does not match",promotionDescription,promotion.get(0).getDescription());

    }
}
