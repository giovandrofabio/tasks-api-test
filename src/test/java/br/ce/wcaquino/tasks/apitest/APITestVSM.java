//package br.ce.wcaquino.tasks.apitest;
//
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//import static io.restassured.RestAssured.given;
//
//public class APITestVSM {
//
//    public static void main(String[] args) {
//        // Realiza a solicitação para obter o token
//        Response response = given()
////                .header("Accept", "application/json, text/plain, */*")
////                .header("Accept-Language", "pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7")
//                .header("Authorization", "Basic YW5ndWxhcjphbmd1bGFy")  // Insira sua credencial codificada aqui
////                .header("Content-Type", "application/x-www-form-urlencoded")
////                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36")
//                .formParam("grant_type", "password")
//                .formParam("username", "giovandrofabiosantos@hotmail.com")
//                .formParam("password", "admin")
//                .when()
//                .post("http://localhost:32905/oauth/token")
//                .then()
//                .statusCode(200)
//                .extract()
//                .response();
//
//        // Extrai o token da resposta JSON
//        String token = response.jsonPath().getString("access_token");
//        System.out.println("Token: " + token);
//
//        // Agora você pode usar esse token para outras solicitações
//        given()
//                .body("{\"size\":28,\"page\":0,\"totalPages\":0,\"obj\":{}}")
//                .contentType(ContentType.JSON)
//                .header("Authorization", "Bearer " + token)
//                .when()
//                .post("http://localhost:32905/api/loja/listar")
//                .then()
//                .log().all()
//                .statusCode(200);
//
//    }
//}
