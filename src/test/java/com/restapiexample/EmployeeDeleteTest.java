package com.restapiexample;

import com.restapiexample.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class EmployeeDeleteTest extends TestBase {

    @Test
    public void verifyThatDeleteEmployee() {
        given()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .pathParam("id", 1364)
                .when()
                .delete("/delete/{id}")
                .then().log().all()
                .statusCode(204);       
    }
}
