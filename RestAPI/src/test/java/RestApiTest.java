import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import user.UserClient;
import user.createUser.request.CreateUserRequest;
import user.createUser.response.CreateUserResponse;
import user.getUser.request.UserRequest;
import user.getUser.response.UserResponse;
import user.getUsers.response.UsersResponse;

public class RestApiTest {
	private UserClient userClient ;
	
	@BeforeClass
	public void beforeClass() {
		userClient = new UserClient();
	}

	@Test
	public void getAllUsers() {
		UsersResponse usersResponse = userClient.getAllUsers(new UserRequest());
	    Assert.assertEquals(usersResponse.getStatusCode(), 200);
	   Assert.assertTrue(usersResponse.getData().size()>0);
	}
	
	@Test
	public void getUser() {
		UserRequest userRequest = new UserRequest();
		userRequest.setUserId(2);
		UserResponse userResponse = userClient.getUserResponse(userRequest);
	    Assert.assertEquals(userResponse.getStatusCode(), 200);
	    Assert.assertEquals(userResponse.getData().getFirst_name(), "Janet");
	}

	@Test
	public void createUser() {
		CreateUserRequest createUserRequest = new CreateUserRequest();
		createUserRequest.setName("Akanksha");
		createUserRequest.setJob("SDET");
		CreateUserResponse createResponse = userClient.createUser(createUserRequest);
		Assert.assertEquals(createResponse.getStatusCode(), 201);
		Assert.assertEquals(createResponse.getName(),"Akanksha");
		Assert.assertTrue(createResponse.getId()!=null);
	}
}
