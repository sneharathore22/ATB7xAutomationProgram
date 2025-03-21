package GET;

 import io.restassured.RestAssured;

public class BDDStyleGET {
    public static void main(String[] args) {

        test1();
        test2();
    }

        private static void test2() {
            RestAssured
                    .given()
                    .baseUri("https://api.zippopotam.us").
                    basePath("/IN/313001")
                    .when().log().all().get()
                    .then()
                    .log().all().statusCode(200);

        }

        private static void test1() {
            RestAssured
                    .given()
                    .baseUri("https://api.zippopotam.us").
                    basePath("/IN/-1")
                    .when().log().all().get()
                    .then()
                    .log().all().statusCode(404);

        }
    }
