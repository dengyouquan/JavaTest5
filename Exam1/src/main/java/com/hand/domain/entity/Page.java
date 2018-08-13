package com.hand.domain.entity;

/**
 * @Program: JavaTest5
 * @Description:
 * @Author: Youquan Deng
 * @Create: 2018-08-13 14:22
 **/
public class Page {
    private int pageSize;
    private int page;
    private String sort = "ASC";

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Page(int pageSize, int page) {
        this.pageSize = pageSize;
        this.page = page;
    }
}
