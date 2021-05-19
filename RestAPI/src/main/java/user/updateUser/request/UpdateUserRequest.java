package user.updateUser.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UpdateUserRequest {
	private String name;
	private String job;
	private int userId;
	
	@JsonIgnore
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
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
