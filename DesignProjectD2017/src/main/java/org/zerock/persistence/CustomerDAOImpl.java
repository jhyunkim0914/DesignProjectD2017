package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.CustomerVO;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = 
			"org.zerock.mapper.CustomerMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getNow");
	}

	@Override
	public void register(CustomerVO vo) {
		sqlSession.insert(namespace + ".register", vo);
	}

	@Override
	public CustomerVO get(String userid) {
		return sqlSession.selectOne(namespace + ".get", userid);
	}

	@Override
	public List<CustomerVO> getList() {
		return sqlSession.selectList(namespace + ".getList");
	}
}