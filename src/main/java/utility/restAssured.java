package utility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class restAssured {

    public static Response getRestResponseNoAuthNobody(String url) {
        Response resTimeAndBox = given()
                .relaxedHTTPSValidation()
                .with().contentType(ContentType.ANY).when().get(url)
                .then().extract().response();
        Assert.assertEquals("Api returned invalid status response ",200,resTimeAndBox.statusCode());

        return resTimeAndBox;
    }

}
