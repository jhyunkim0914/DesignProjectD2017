package org.zerock.domain;

public class GroupInfoVO {
    private Integer groupidx;

    private String name;

    private String groupState;

    private String startTime;

    private String endTime;

    private Integer totalDailyFavor;

    private Integer companyidx;
    
    private Integer customeridx;

    private String isleader;

	public Integer getGroupidx() {
		return groupidx;
	}

	public void setGroupidx(Integer groupidx) {
		this.groupidx = groupidx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupState() {
		return groupState;
	}

	public void setGroupState(String groupState) {
		this.groupState = groupState;
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

	public Integer getTotalDailyFavor() {
		return totalDailyFavor;
	}

	public void setTotalDailyFavor(Integer totalDailyFavor) {
		this.totalDailyFavor = totalDailyFavor;
	}

	public Integer getCompanyidx() {
		return companyidx;
	}

	public void setCompanyidx(Integer companyidx) {
		this.companyidx = companyidx;
	}

	public Integer getCustomeridx() {
		return customeridx;
	}

	public void setCustomeridx(Integer customeridx) {
		this.customeridx = customeridx;
	}

	public String getIsleader() {
		return isleader;
	}

	public void setIsleader(String isleader) {
		this.isleader = isleader;
	}

	@Override
	public String toString() {
		return "GroupInfoVO [groupidx=" + groupidx + ", name=" + name + ", groupState=" + groupState + ", startTime="
				+ startTime + ", endTime=" + endTime + ", totalDailyFavor=" + totalDailyFavor + ", companyidx="
				+ companyidx + ", customeridx=" + customeridx + ", isleader=" + isleader + "]";
	}
    
    
   
    
}
