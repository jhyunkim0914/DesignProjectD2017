package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.CompanyVO;

@Repository
public class CompanyDAOImpl implements CompanyDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = 
			"org.zerock.mapper.CompanyMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getNow");
	}

	@Override
	public void register(CompanyVO vo) {
		sqlSession.insert(namespace + ".register", vo);
	}

	@Override
	public CompanyVO get(String userid) {
		return sqlSession.selectOne(namespace + ".get", userid);
	}

	@Override
	public List<CompanyVO> getList() {
		return sqlSession.selectList(namespace + ".getList");
	}
}