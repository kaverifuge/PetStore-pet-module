package EndPoints;

public class Routes {
	
	
	
	public static String base_url = "https://petstore.swagger.io/v2";
	
	public static String post_url = base_url+"/pet"; // Add new pet to store
	
	public static String get_url = base_url+"/pet/{id}"; // Get pet by id
	
	public static String update_url = base_url+"/pet"; // update pet in store.
	
	public static String delete_url = base_url+"/pet/{id}"; //Delete pet by id

}
