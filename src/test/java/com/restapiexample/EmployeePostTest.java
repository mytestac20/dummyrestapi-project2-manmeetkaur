package com.restapiexample;

import com.restapiexample.model.EmployeePojo;
import com.restapiexample.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class EmployeePostTest extends TestBase {

    @Test
    public void createNewRecordOfEmployee(){

        EmployeePojo employeePojo=new EmployeePojo();
        employeePojo.setEmployee_name("Tiger Nixon");
        employeePojo.setEmployee_salary(320800);
        employeePojo.setEmployee_age(63);

        Response response= given().log().all()
                .header("Content-Type", "application/json")
                .header("cookie", "humans_21909=1")
                .when()
                .body(employeePojo)
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);

    }

}
