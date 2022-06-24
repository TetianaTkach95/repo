import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class AutomationDemoAPI {
    public static void getStatusCode(String url){
        int statusCode = given().when().get(url).getStatusCode();
        System.out.println("Status code: "+statusCode);
    }

    public static void assertStatusCode(String url){
        given().when().get(url).then().assertThat().statusCode(200);
    }

    public static void getResponseBody(String url){
        given().when().get(url).then().log()
                .all();
    }

    public static void getSpecificPartOfResponseBody(String url, String key){
        String height = when().get(url).then().extract().path(key) ;
        System.out.println(height);
    }
}
