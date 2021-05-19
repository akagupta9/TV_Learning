package user.updateUser.response;

import user.common.response.BaseResponse;

public class UpdateUserResponse extends BaseResponse{
	  private String name;

	    private String job;

	    private String updatedAt;

	   public String getName(){
	        return this.name;
	    }
	    public String getJob(){
	        return this.job;
	    }
	    public String getUpdatedAt(){
	        return this.updatedAt;
	    }
}
