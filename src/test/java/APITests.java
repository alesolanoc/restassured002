import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests {
    @Test
    void test1(){
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println("status Code:"+response.getStatusCode());
        System.out.println("Response: " + response.asString());
        System.out.println("Body: " + response.getBody().asString());
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode,200);
    }
}
