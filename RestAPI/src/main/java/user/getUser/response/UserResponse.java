package user.getUser.response;

import user.common.response.Data;
import user.common.response.Support;


public class UserResponse {

    private Data data;
    private Support support;
    private int statusCode;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return this.data;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public Support getSupport() {
        return this.support;
    }


}
