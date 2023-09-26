package test;


import org.testng.annotations.Test;
import org.testng.Assert;
import com.github.javafaker.Faker;

import EndPoints.Userendpoints;

import io.restassured.response.Response;
import payload.Category;

import payload.Tags;
import payload.User;

public class Test1 {

	// public User[] uu;
	public User u;
	public Faker faker, faker1,faker2;

	@Test()
	public void setdata() {

		// uu = new User[1];

		faker = new Faker();
		faker1 = new Faker();
		faker2 = new Faker();
		
		
		
		Category c = new Category();

		Tags[] ta = new Tags[1];

		u = new User();

		u.setId(faker.idNumber().hashCode());

		//c.setCategoryid(faker.idNumber().hashCode());
		
		c.setCategoryid(faker1.idNumber().hashCode());
		
		//c.setCategoryname(faker.dog().breed());

		
		c.setCategoryname(faker.animal().name().toString());
		
		
		System.out.println("Name : "+c.getCategoryname());
		
		System.out.println(c);
		
		u.setCategory(c);
		
		System.out.println(u.getCategory());

		u.setName(faker.cat().name());

		String[] photo = new String[1];

		photo[0] = faker.internet().image();

		u.setPhoto(photo);

		Tags t = new Tags();

		t.setTagid(faker2.idNumber().hashCode());

		t.setTagname(faker.dog().toString());

		ta[0] = t;

		u.setTag(ta);

		u.setStatus(faker.app().name());

		// ObjectMapper objectMapper = new ObjectMapper();

		// System.out.println(u);

		// uu[0]=u;

		// return uu;
	}

	@Test(priority = 1)
	public void addpet() {

		Response rs = Userendpoints.addnewpet(u);

		rs.then().log().body();

		Assert.assertEquals(rs.getStatusCode(), 200);

	}
	
	@Test(priority=2)
	public void getpetbyid() {
		
		System.out.println("Original Name ");
		
		Response rs = Userendpoints.getpet(this.u.getId());
		rs.then().log().body();
		
		Assert.assertEquals(rs.getStatusCode(), 200);
		
	}
	
	@Test(priority=3)
	public void updatepetbyname() {
		
		
		
		 u.setName(faker.artist().name());
		 
		 String name = u.getName();
		 
		 
	
		
		Response rs = Userendpoints.updatepet(this.u.getName(), u);
		 System.out.println("Updated Name ");
		
		rs.then().log().body();
		
		Assert.assertEquals(rs.getStatusCode(), 200);
		
		
		
	}
	
	@Test(priority = 4)
  public void deletepetbyid() {
	  
	  
	  Response rs = Userendpoints.deletepet(this.u.getId());
		 System.out.println("Delete  record body  ");
			
		rs.then().log().body();
		
		Assert.assertEquals(rs.getStatusCode(), 200);
		//Response rs1 = Userendpoints.getpet(this.u.getId());
  }
	
	

}
