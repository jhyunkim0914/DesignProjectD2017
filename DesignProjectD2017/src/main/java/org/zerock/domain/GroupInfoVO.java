package org.zerock.domain;

public class GroupInfoVO {
    private Integer groupidx;

    private String name;

    private String groupState;

    private String startTime;

    private String endTime;

    private Integer totalDailyFavor;

    private Integer companyId;

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

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "GroupInfoVO [groupidx=" + groupidx + ", name=" + name + ", groupState=" + groupState + ", startTime="
				+ startTime + ", endTime=" + endTime + ", totalDailyFavor=" + totalDailyFavor + ", companyId="
				+ companyId + "]";
	}
    
    
}
