import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import user.getUser.request.UserRequest;
import user.getUser.response.UserResponse;

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

	public UserResponse getAllUsers(UserRequest userRequest) {

		Response response = given()
				.contentType(ContentType.JSON)
				 .when()
				.get(userRequest.getBaseUrl());

		UserResponse userResponse = response.as(UserResponse.class);
		userResponse.setStatusCode(response.getStatusCode());
		return userResponse;
	}

}
