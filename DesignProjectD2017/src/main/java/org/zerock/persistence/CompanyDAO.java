package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.CompanyVO;

public interface CompanyDAO extends GenericDAO<CompanyVO, String> {
	public String getTime();
	public void register(CompanyVO vo);
	public CompanyVO get(String userid);
	public List<CompanyVO> getList();
}
