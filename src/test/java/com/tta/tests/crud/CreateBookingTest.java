package com.tta.tests.crud;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tta.endpoints.APIConstants;
import com.tta.tests.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

public class CreateBookingTest extends BaseTest {


    @Test(groups = "smoke")
    @Owner("Promode")
    @Description("Verify that create booking is working fine with status code 200")
    public void testCreateBookingNegative() throws JsonProcessingException {
        requestSpecification.basePath(APIConstants.CREATE_BOOKING);
        response = RestAssured.given().spec(requestSpecification)
                .when().body(payloadManager.createPayload()).post();
        assertActions.verifyStatusCode(response);
    }






}
