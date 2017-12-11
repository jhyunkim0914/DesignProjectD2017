package org.zerock.domain;

public class CompanyVO {

    private Integer companyidx;

    private String id;

    private String password;

    private String name;

    private String email;

    private Integer categoryidx;

    public Integer getCompanyidx() {
        return companyidx;
    }

    public void setCompanyidx(Integer companyidx) {
        this.companyidx = companyidx;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCategoryidx() {
        return categoryidx;
    }

    public void setCategoryidx(Integer categoryidx) {
        this.categoryidx = categoryidx;
    }

    // Company 모델 복사
    public void CopyData(CompanyVO param)
    {
        this.companyidx = param.getCompanyidx();
        this.id = param.getId();
        this.password = param.getPassword();
        this.name = param.getName();
        this.email = param.getEmail();
        this.categoryidx = param.getCategoryidx();
    }
}