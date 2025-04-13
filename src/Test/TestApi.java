import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class TestApi {
    public void getTest(){
        given()
                .baseUri("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2")) // Проверка URL
                .body("args.foo1", equalTo("bar1")) // Проверка значения foo1
                .body("args.foo2", equalTo("bar2")) // Проверка значения foo2
                .body("headers", notNullValue()); // Проверка наличия заголовков
    }
    public void postTest() {

        given()
                .baseUri("https://postman-echo.com/post")
                .contentType("application/json")
                .body("{\"foo1\":\"bar1\",\"foo2\":\"bar2\"}")
                .when()
                .post()
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/post")) // Проверка URL
                .body("json.foo1", equalTo("bar1")) // Проверка значения foo1
                .body("json.foo2", equalTo("bar2")); // Проверка значения foo2
    }
    public void postFormDataTest() {
        given()
                .baseUri("https://postman-echo.com/post")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post()
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/post")) // Проверка URL
                .body("form.foo1", equalTo("bar1")) // Проверка значения foo1
                .body("form.foo2", equalTo("bar2")); // Проверка значения foo2
    }
    public void putTest() {
        given()
                .baseUri("https://postman-echo.com/put")
                .contentType("application/json")
                .body("{\"foo1\":\"bar1\",\"foo2\":\"bar2\"}")
                .when()
                .put()
                .then()
                .statusCode(200) // Проверка кода ответа
                .log().all() // Логирование всех данных
                .body("url", equalTo("https://postman-echo.com/put")) // Проверка URL
                .body("json.foo1", equalTo("bar1")) // Проверка значения foo1
                .body("json.foo2", equalTo("bar2")); // Проверка значения foo2
    }
    public void patchTest() {

        given()
                .baseUri("https://postman-echo.com/patch")
                .contentType("application/json")
                .body("{\"foo1\":\"bar1\",\"foo2\":\"bar2\"}")
                .when()
                .patch()
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/patch")) // Проверка URL
                .body("json.foo1", equalTo("bar1")) // Проверка значения foo1
                .body("json.foo2", equalTo("bar2")); // Проверка значения foo2
    }
    public void deleteTest() {

        given()
                .baseUri("https://postman-echo.com/delete")
                .contentType("application/json")
                .body("{\"foo1\":\"bar1\",\"foo2\":\"bar2\"}")
                .when()
                .delete()
                .then()
                .statusCode(200)
                .body("url", equalTo("https://postman-echo.com/delete")) // Проверка URL
                .body("json.foo1", equalTo("bar1")) // Проверка значения foo1
                .body("json.foo2", equalTo("bar2")); // Проверка значения foo2
    }
}


