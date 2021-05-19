package user;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import user.createUser.request.CreateUserRequest;
import user.createUser.response.CreateUserResponse;
import user.getUser.request.UserRequest;
import user.getUser.response.UserResponse;
import user.getUsers.response.UsersResponse;
import user.updateUser.request.UpdateUserRequest;
import user.updateUser.response.UpdateUserResponse;

public class UserClient {
	
	private final String baseUrl = "https://reqres.in/api/users";

	public UserResponse getUserResponse(UserRequest userRequest) {

		String uri = String.format("%s/{user}", this.baseUrl);

		Response response = given()
							.contentType(ContentType.JSON)
							.pathParams("user", userRequest.getUserId())
							.when()
							.get(uri);

		UserResponse userResponse = response.as(UserResponse.class);
		userResponse.setStatusCode(response.getStatusCode());
		return userResponse;
	}

	public UsersResponse getAllUsers(UserRequest userRequest) {

		Response response = given()
				.contentType(ContentType.JSON)
				 .when()
				.get(this.baseUrl);

		UsersResponse userResponse = response.as(UsersResponse.class);
		userResponse.setStatusCode(response.getStatusCode());
		return userResponse;
	}
	
	public CreateUserResponse createUser(CreateUserRequest createUserRequest) {

		Response response = given()
				.contentType(ContentType.JSON)
				.body(createUserRequest)
				 .when()
				.post(this.baseUrl);

		CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);
		createUserResponse.setStatusCode(response.getStatusCode());
		return createUserResponse;
	}
	
	public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) {
		
		String uri = String.format("%s/{user}", this.baseUrl);

		Response response = given()
				.contentType(ContentType.JSON)
				.pathParams("user", updateUserRequest.getUserId())
				.body(updateUserRequest)
				.when()
				.put(uri);

		UpdateUserResponse updateUserResponse = response.as(UpdateUserResponse.class);
		updateUserResponse.setStatusCode(response.getStatusCode());
		return updateUserResponse;
	}


}
