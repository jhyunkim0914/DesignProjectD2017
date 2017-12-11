package org.zerock.domain;

public class MenuVO {

    private Integer menuidx;

    private Integer companyidx;

    private String name;

    private String price;

    private String imageLink;

    public Integer getMenuidx() {
        return menuidx;
    }

    public void setMenuidx(Integer menuidx) {
        this.menuidx = menuidx;
    }

    public Integer getCompanyidx() {
        return companyidx;
    }

    public void setCompanyidx(Integer companyidx) {
        this.companyidx = companyidx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

}
