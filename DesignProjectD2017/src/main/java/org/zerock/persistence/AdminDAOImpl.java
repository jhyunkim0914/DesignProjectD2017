package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.AdminVO;

@Repository
public class AdminDAOImpl implements AdminDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = 
			"org.zerock.mapper.AdminMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getNow");
	}

	@Override
	public void register(AdminVO vo) {
		sqlSession.insert(namespace + ".register", vo);
	}

	@Override
	public AdminVO get(String userid) {
		return sqlSession.selectOne(namespace + ".get", userid);
	}

	@Override
	public List<AdminVO> getList() {
		return sqlSession.selectList(namespace + ".getList");
	}
}
