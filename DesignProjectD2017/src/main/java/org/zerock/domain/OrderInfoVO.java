package org.zerock.domain;

public class OrderInfoVO {

    private Integer orderidx;

    private Integer customeridx;

    private Integer groupidx;

    private Integer companyidx;

    private Integer menuidx;

    private String orderState;

    public Integer getOrderidx() {
        return orderidx;
    }

    public void setOrderidx(Integer orderidx) {
        this.orderidx = orderidx;
    }

    public Integer getCustomeridx() {
        return customeridx;
    }

    public void setCustomeridx(Integer customeridx) {
        this.customeridx = customeridx;
    }

    public Integer getGroupidx() {
        return groupidx;
    }

    public void setGroupidx(Integer groupidx) {
        this.groupidx = groupidx;
    }

    public Integer getCompanyidx() {
        return companyidx;
    }

    public void setCompanyidx(Integer companyidx) {
        this.companyidx = companyidx;
    }

    public Integer getMenuidx() {
        return menuidx;
    }

    public void setMenuidx(Integer menuidx) {
        this.menuidx = menuidx;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

}