package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.CustomerVO;

public interface CustomerDAO{
	public String getTime();
	public void register(CustomerVO vo);
	public CustomerVO get(String userid);
	public List<CustomerVO> getList();
}
