package user.common.request;

public class UserRequest {
	
	private int userId;
	private final String baseUrl = "https://reqres.in/api/users";
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}

}
