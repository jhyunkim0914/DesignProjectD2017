package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.AdminVO;

public interface AdminDAO{
	public String getTime();
	public void register(AdminVO vo);
	public AdminVO get(String userid);
	public List<AdminVO> getList();
}
