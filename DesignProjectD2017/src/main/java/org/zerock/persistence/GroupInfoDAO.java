package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.GroupInfoVO;

public interface GroupInfoDAO{
	public String getTime();
	public void register(GroupInfoVO vo);
	public GroupInfoVO get(String groupidx);
	public List<GroupInfoVO> getList();
	public List<GroupInfoVO> getGroupListByCustomerId(String customerId);
}
