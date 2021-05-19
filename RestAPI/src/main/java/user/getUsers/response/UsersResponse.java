package user.getUsers.response;

import java.util.List;

import user.common.response.BaseResponse;
import user.common.response.Data;
import user.common.response.Support;


public class UsersResponse extends BaseResponse {

    private int page;

    private int per_page;

    private int total;

    private int total_pages;

    private List<Data> data;

    private Support support;

    public int getPage() {
        return this.page;
    }

    public int getPer_page() {
        return this.per_page;
    }

    public int getTotal() {
        return this.total;
    }

    public int getTotal_pages() {
        return this.total_pages;
    }

    public List<Data> getData() {
        return this.data;
    }

    public Support getSupport() {
        return this.support;
    }
}
