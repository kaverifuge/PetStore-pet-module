package payload;

public class User {

	private Integer id;

	
	
	
	

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Tags[] getTag() {
		return tag;
	}
	public void setTag(Tags[] tag) {
		this.tag = tag;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	Category category;
	private String name;
	Tags[] tag;

	String[] photo;
	
	/*Photo photo;
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;*/
	
	public String[] getPhoto() {
		return photo;
	}
	public void setPhoto(String[] photo) {
		this.photo = photo;
	}
	private String status;

}
