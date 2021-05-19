package user.createUser.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CreateUserRequest {
	private String name;
	private String job;
	private final String baseUrl = "https://reqres.in/api/users";
	
	@JsonIgnore
	public String getBaseUrl() {
		return baseUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
