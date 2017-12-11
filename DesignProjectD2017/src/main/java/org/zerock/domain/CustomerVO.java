package org.zerock.domain;

public class CustomerVO {

    private Integer customeridx;

    private String id;

    private String password;

    private String name;

    private String email;

    private Integer existingFlavor1;

    private Integer existingFlavor2;

    private Integer existingFlavor3;

    private Integer dailyFlavor;

    private String participationFlag;

    private String groupFlag;

    private String startTime;

    private String endTime;

    private Integer starPoint;

    public Integer getCustomeridx() {
        return customeridx;
    }

    public void setCustomeridx(Integer customeridx) {
        this.customeridx = customeridx;
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

    public Integer getExistingFlavor1() {
        return existingFlavor1;
    }

    public void setExistingFlavor1(Integer existingFlavor1) {
        this.existingFlavor1 = existingFlavor1;
    }

    public Integer getExistingFlavor2() {
        return existingFlavor2;
    }

    public void setExistingFlavor2(Integer existingFlavor2) {
        this.existingFlavor2 = existingFlavor2;
    }

    public Integer getExistingFlavor3() {
        return existingFlavor3;
    }

    public void setExistingFlavor3(Integer existingFlavor3) {
        this.existingFlavor3 = existingFlavor3;
    }

    public Integer getDailyFlavor() {
        return dailyFlavor;
    }

    public void setDailyFlavor(Integer dailyFlavor) {
        this.dailyFlavor = dailyFlavor;
    }

    public String getParticipationFlag() {
        return participationFlag;
    }

    public void setParticipationFlag(String participationFlag) {
        this.participationFlag = participationFlag;
    }

    public String getGroupFlag() {
        return groupFlag;
    }

    public void setGroupFlag(String groupFlag) {
        this.groupFlag = groupFlag;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getStarPoint() {
        return starPoint;
    }

    public void setStarPoint(Integer starPoint) {
        this.starPoint = starPoint;
    }

    // Customer 모델 복사
    public void CopyData(CustomerVO param)
    {
        this.customeridx = param.getCustomeridx();
        this.id = param.getId();
        this.password = param.getPassword();
        this.name = param.getName();
        this.email = param.getEmail();
        this.existingFlavor1 = param.getExistingFlavor1();
        this.existingFlavor2 = param.getExistingFlavor2();
        this.existingFlavor3 = param.getExistingFlavor3();
        this.dailyFlavor = param.getDailyFlavor();
        this.participationFlag = param.getParticipationFlag();
        this.groupFlag = param.getGroupFlag();
        this.startTime = param.getStartTime();
        this.endTime = param.getEndTime();
        this.starPoint = param.getStarPoint();
    }
}