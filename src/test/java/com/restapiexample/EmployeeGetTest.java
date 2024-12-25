package com.restapiexample;

import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EmployeeGetTest extends TestBase {

    @Test
    public void getAllEmployeeList() {

        Response response = given()
                .header("cookie", "humans_21909=1")
                .when()
                .get("/employees");
        response.prettyPrint();
        response.then().statusCode(200);


    }
}
