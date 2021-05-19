package user.createUser.response;

import user.common.response.BaseResponse;

public class CreateUserResponse extends BaseResponse {
	private String name;

	private String job;

	private String id;

	private String createdAt;

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public String getId() {
		return id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

}
