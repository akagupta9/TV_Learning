package user.updateUser.response;

public class UpdateUserResponse {
	  private String name;

	    private String job;

	    private String updatedAt;
	    
	    private int statusCode;

	    public void setName(String name){
	        this.name = name;
	    }
	    public int getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}
		public String getName(){
	        return this.name;
	    }
	    public void setJob(String job){
	        this.job = job;
	    }
	    public String getJob(){
	        return this.job;
	    }
	    public void setUpdatedAt(String updatedAt){
	        this.updatedAt = updatedAt;
	    }
	    public String getUpdatedAt(){
	        return this.updatedAt;
	    }
}
