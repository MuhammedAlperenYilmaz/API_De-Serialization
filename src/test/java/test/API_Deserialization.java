package test;

import baseURLRepository.JsonPlaceHolderBaseURL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import testDataRepository.JsonPlaceHolderTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class API_Deserialization extends JsonPlaceHolderBaseURL {
    @Test
    public void test01() {
        //1.  Create URL and Request Body
        specJsonPlace.pathParam("ppt1", 70);
        JsonPlaceHolderTestData jsonPlaceHolderTestData = new JsonPlaceHolderTestData();
        Map<String, Object> requestBodyMap = jsonPlaceHolderTestData.createRequestBodyMap();
        //2. Create Expected Data
        Map<String, Object> expectedDataMap = jsonPlaceHolderTestData.createRequestBodyMap();
        //3. Register Response
        Response response = given().contentType(ContentType.JSON).spec(specJsonPlace).when().body(requestBodyMap).put("{ppt1}");
        //4. Assertion
        assertEquals(jsonPlaceHolderTestData.successStatusCode, response.getStatusCode());
        Map<String, Object> responseBodMap = response.as(HashMap.class);
        assertEquals(expectedDataMap.get("title"), responseBodMap.get("title"));
        assertEquals(expectedDataMap.get("body"), responseBodMap.get("body"));
        assertEquals(expectedDataMap.get("userId"), responseBodMap.get("userId"));
        assertEquals(expectedDataMap.get("id"), requestBodyMap.get("id"));
    }
}
