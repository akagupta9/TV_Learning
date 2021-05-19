import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import user.getUser.request.UserRequest;
import user.getUser.response.UserResponse;

public class RestApiTest {
	private UserClient userClient ; 
	
	@BeforeClass
	public void beforeClass() {
		userClient = new UserClient();
	}

	@Test
	public void getAllUsers() {
		UserResponse userResponse = userClient.getAllUsers(new UserRequest());
	    Assert.assertEquals(userResponse.getStatusCode(), 200);
	}
	
	@Test
	public void getUser() {
		UserRequest userRquest = new UserRequest();
		userRquest.setUserId(2);
		UserResponse userResponse = userClient.getUserResponse(userRquest);
	    Assert.assertEquals(userResponse.getStatusCode(), 200);
	    Assert.assertEquals(userResponse.getData().get(0).getFirst_name(), "Janet");
	}
}
