package org.zerock.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.GroupInfoVO;

@Repository
public class GroupInfoImpl implements GroupInfoDAO{
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = 
			"org.zerock.mapper.GroupInfoMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getNow");
	}

	@Override
	public void register(GroupInfoVO vo) {
		sqlSession.insert(namespace + ".register", vo);
	}

	@Override
	public GroupInfoVO get(String groupidx) {
		return sqlSession.selectOne(namespace + ".get", groupidx);
	}

	@Override
	public List<GroupInfoVO> getList() {
		return sqlSession.selectList(namespace + ".getList");
	}
	
	@Override
	public List<GroupInfoVO> getGroupListByCustomerId(String customerId) {
		return sqlSession.selectList(namespace + ".getGroupListByCustomerId", customerId);
	}
}
