package stepDefinitions;

import apiObjects.timeAndBox.Promotion;
import apiObjects.timeAndBox.TimeandboxObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import testBase.TestBase;

import java.io.IOException;
import java.util.List;


public class timeAndBoxStepDefinitions extends TestBase{
    public static TimeandboxObject timeandboxobject;


    @Given("I execute the time and box api")
    public void iExecuteTheTimeAndBoxApi() throws IOException {
        getReadPropertiesFile();
        String timeAndBoxEndpoint = config_prop.getProperty("timeAndBoxApiEndpoint");
        Response resTimeAndBox = utility.restAssured.getRestResponseNoAuthNobody(timeAndBoxEndpoint);
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
        Assert.assertTrue("There are no promotions with the name "+promotionName,promotion.size()>0);
        Assert.assertEquals("There are more that one promotion with the name " + promotionName, 1, promotion.size());
        Assert.assertEquals("Promotion description does not match",promotionDescription,promotion.get(0).getDescription());
    }
}
