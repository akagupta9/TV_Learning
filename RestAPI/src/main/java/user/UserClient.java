package user;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import user.common.request.UserRequest;
import user.getUser.response.UserResponse;
import user.getUsers.response.UsersResponse;

public class UserClient {

	public UserResponse getUserResponse(UserRequest userRequest) {

		String uri = String.format("%s/{user}", userRequest.getBaseUrl());

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
				.get(userRequest.getBaseUrl());

		UsersResponse userResponse = response.as(UsersResponse.class);
		userResponse.setStatusCode(response.getStatusCode());
		return userResponse;
	}

}