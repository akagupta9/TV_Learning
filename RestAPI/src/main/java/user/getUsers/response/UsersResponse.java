package user.getUsers.response;

import java.util.List;

import user.common.response.Data;
import user.common.response.Support;


public class UsersResponse {

    private int page;

    private int per_page;

    private int total;

    private int total_pages;

    private List<Data> data;

    private Support support;

    private int statusCode;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return this.page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getPer_page() {
        return this.per_page;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_pages() {
        return this.total_pages;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return this.data;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public Support getSupport() {
        return this.support;
    }
}