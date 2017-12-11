/*
 * 2016.04.02 테스트 완료
 * by wjheo
 */
package org.zerock.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.zerock.domain.*;
import org.zerock.persistence.*;

public class MemberDAOImplTest extends AbstractTest{

	@Inject
	private MemberDAO dao;
	@Inject
	private CustomerDAO customerdao;
	@Inject
	private GroupInfoDAO groupinfodao;
	
	
	@Test
	public void test() {
		logger.info(""+dao);
	}
	
	@Test
	public void getTimeTest() {
		logger.info(""+dao.getTime());
	}
	
//	@Test
//	public void registerTest(){
//		MemberVO vo = new MemberVO();
//		vo.setId("kjh156");
//		vo.setPassword("1234");
//		vo.setName("kjh");
//		vo.setEmail("kjh@g.com");
//		
//		// DB에 넣고 DB테이블에서 직접 확인해봐야 한다.
//		dao.register(vo);
//	}
	
	@Test
	public void getTest(){
		logger.info(""+dao.get("kjh0156"));
		logger.info(""+customerdao.get("customer1"));
		logger.info(""+groupinfodao.getGroupListByCustomerId("customer1"));
	}
	
	@Test
	public void getListTest(){
		
		logger.info(""+customerdao.getList());
		logger.info(""+dao.getList());
	}
	
}// class
