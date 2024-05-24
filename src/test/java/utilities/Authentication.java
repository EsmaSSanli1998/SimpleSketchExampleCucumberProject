package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {


    //yazdirdigimiz tokeni gormek icin
     public static void main(String[] args) {
        System.out.println(generateToken());
     }



    public static String generateToken() {

        String body = "{\n" +
                "  \"password\": \"example\",\n" +
                "  \"username\": \"example\"\n" +
                "}";

        Response response = given().
                body(body).
                contentType(ContentType.JSON).
                when().
                post("https://example.com/app/auth/login");

        response.prettyPrint();

        return response.jsonPath().getString("token");

        //consol'da gelen token'i almak icin

        /*
        consol ciktisi :

        "username": "example",
    "role": "ADMIN",
    "token": "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJUZWFtMTJBZG1pbiIsImlhdCI6MTY5NDQyMzQwMiwiZXhwIjoxNjk0NDMyMDQyfQ.pjYbDMUIQTZGufP2S9z-0xFhZqm0WnVEW7Q64kFOE7x1Qnfb9jaeQ-pTaZJVg_UI3mrnW036OpPE8pydnNJXDA",
    "name": "example"
         */

        //{"token":"Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJUZWFtMTJEZWFuIiwiaWF0IjoxNjk0NDMzOTc5LCJleHAiOjE2OTQ0NDI2MTl9._STwWSQr7RPfvPKdqXxcO_8Mi3Mru1dphuhF-e3n78hep5YI2cDKQZhi03WDb9JN0T75AHs1_hMUHFRo85mO-g"}


    }


}
