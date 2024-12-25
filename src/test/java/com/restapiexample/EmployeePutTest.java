package com.restapiexample;

import com.restapiexample.model.EmployeePojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class EmployeePutTest extends TestBase {

    @Test
    public void updateEmployeeById() {
        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setEmployee_name("Garrett Winters");
        employeePojo.setEmployee_salary(180750);
        employeePojo.setEmployee_age(63);
        employeePojo.setId(1);

        /**
         *    {
         *             "id": 2,
         *             "employee_name": "Garrett Winters",
         *             "employee_salary": 170750,
         *             "employee_age": 63,
         *             "profile_image": ""
         *         }
         */
        Response response = given()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .pathParam("id", 1362)
                .when()
                .body(employeePojo)
                .put("/update/{id}");
        response.prettyPrint();
        response.then().statusCode(200);


    }
}