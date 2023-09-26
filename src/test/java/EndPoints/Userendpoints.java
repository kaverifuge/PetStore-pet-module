package EndPoints;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payload.User;

import static io.restassured.RestAssured.*;


public class Userendpoints {
	
	
	
	
	public static Response addnewpet(User uu) {
		
      Response rs = given()
      .contentType(ContentType.JSON)
      .accept(ContentType.JSON)
     .body(uu)
      .when()
      .post(Routes.post_url);
      
      return rs;

		
	}
	
	
	
	public static Response getpet(int id) {
	
		Response rs = given()
		.accept(ContentType.JSON)
		.pathParam("id", id)
		.when()
		.get(Routes.get_url);
		
		
		return rs;
		
	}	
	
	public static Response updatepet(String name , User u ) {
		
		Response rs = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(u)
		.when()
		.put(Routes.update_url);
		
		return rs;
		
		
	}
	

	
	
	public static Response deletepet(int id ) {
		
		Response rs = given()
		
		.accept(ContentType.JSON)
		.header("key",345)
		.pathParam("id",id)
		
		.when()
		.delete(Routes.delete_url);
		
		return rs;
	}

}
