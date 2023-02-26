package com.tta.tests.base;

import com.tta.actions.AssertActions;
import com.tta.endpoints.APIConstants;
import com.tta.modules.PayloadManager;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;



    // Reset the URL
    // Reset Headers


    @BeforeMethod
    public void setUp(){
        payloadManager = new PayloadManager();
        assertActions = new AssertActions();
        requestSpecification = (RequestSpecification) new RequestSpecBuilder().setBaseUri(APIConstants.BASE_URL)
                .addHeader("Content-Type", "application/json").build().log().all();
    }




    @AfterMethod
    public void tearDown(){
            //
    }




}
