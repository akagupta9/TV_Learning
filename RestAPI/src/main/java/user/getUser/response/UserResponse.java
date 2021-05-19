package user.getUser.response;

import user.common.response.BaseResponse;
import user.common.response.Data;
import user.common.response.Support;

public class UserResponse extends BaseResponse{

	private Data data;
	private Support support;

	public Data getData() {
		return this.data;
	}

	public Support getSupport() {
		return this.support;
	}

}
