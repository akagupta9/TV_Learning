import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import user.UserClient;
import user.common.request.UserRequest;
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
}
