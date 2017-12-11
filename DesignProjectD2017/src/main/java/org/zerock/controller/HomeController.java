package org.zerock.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.domain.*;
import org.zerock.persistence.*;

/**
 * Handles requests for the application home page.
 */


@Controller
@SessionAttributes({"user"})	//세션 사용시 여기에 명시해 주어야 한다.
public class HomeController {

	private UserVO user;
	@Inject
	private AdminDAO admindao;
	@Inject
	private CustomerDAO customerdao;
	@Inject
	private CompanyDAO companydao;
	@Inject
	private GroupInfoDAO groupinfodao;
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	HomeController(){
			user = new UserVO();
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//로그인 함수
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam("id") String id, @RequestParam("password") String password, @RequestParam("usertype") String usertype, Model model) {
		logger.info("Login"+ ' ' + usertype + ' ' + id + ' ' + password );	
		
		if(usertype.equals("customer"))
		{
			CustomerVO customer = customerdao.get(id);
			
			//성공시
			if(!ObjectUtils.isEmpty(customer))
			{
				logger.info(customer.toString());
				
				user.setIdx(customer.getCustomeridx());
				user.setId(customer.getId());
				user.setName(customer.getName());
				user.setPassword(customer.getPassword());
				user.setEmail(customer.getEmail());
				user.setRole("customer");
				
				model.addAttribute("user", user);
			}
			//실패시
			else
			{
				return "login/loginerror";
			}
		}
		
		if(usertype.equals("company"))
		{
			CompanyVO company = companydao.get(id);
			
			
			//성공시
			if(!ObjectUtils.isEmpty(company))
			{
				logger.info(company.toString());
				
				user.setIdx(company.getCompanyidx());
				user.setId(company.getId());
				user.setName(company.getName());
				user.setPassword(company.getPassword());
				user.setEmail(company.getEmail());
				user.setRole("company");
				
				model.addAttribute("user", user);
			}
			//실패시
			else
			{
				return "login/loginerror";
			}
		}
		
		if(usertype.equals("admin"))
		{
			AdminVO admin = admindao.get(id);
			
			//성공시
			if(!ObjectUtils.isEmpty(admin))
			{
				logger.info(admin.toString());
				
				user.setIdx(admin.getAdminidx());
				user.setId(admin.getId());
				user.setName(admin.getName());
				user.setPassword(admin.getPassword());
				user.setEmail(admin.getEmail());
				user.setRole("admin");
				
				model.addAttribute("user", user);
			}
			//실패시
			else
			{
				return "login/loginerror";
			}
		}
	
		return "login/login";
	}
	
	//세션 불러오는 함수
	@RequestMapping(value = "/checkSession", method = RequestMethod.GET)
	public String checkSession(Model model) {
		logger.info("CheckSession");
		
		return "login/checkSession";
	}
	
	@RequestMapping(value = "/getCustomerListByJson", method = RequestMethod.GET)
	public String getCustomerListByJson(Model model) {
		logger.info("getCustomerListByJson");
		
		List<CustomerVO> customerList = customerdao.getList();
		model.addAttribute("customerList", customerList);
		
		return "getCustomerListByJson";
	}
	
	//로그아웃
	@RequestMapping(value="/logout")
	public ModelAndView logOut(ModelAndView mv, SessionStatus status){
	    String page = "redirect:/";
	    status.setComplete();
	    mv.setViewName(page);
	    return mv;
	}

	@RequestMapping(value = "/grouplistview", method = RequestMethod.GET)
	public String viewGroupList(Model model) {
		if(user.getRole().equals("customer")) {
			logger.info("그룹 리스트 페이지 로딩");
			List<GroupInfoVO> groupList = groupinfodao.getGroupListByCustomerId(user.getId());
			model.addAttribute("groupList", groupList);
			
			return "grouplist";
		}
			
		
		return "error";
	}
	
	//그룹 결성 페이지 로딩
	@RequestMapping(value = "/makegroupview", method = RequestMethod.GET)
	public String viewMakeGroup(Model model) {
		if(user.getRole().equals("customer")) {
			logger.info("그룹 결성 페이지 로딩");
			
			List<CustomerVO> customerList = customerdao.getList();
			
			model.addAttribute("customerList", customerList);
			
			return "makegroupview";
		}
			
		
		return "error";
	}
	
	//그룹 
	@RequestMapping(value = "/inviteCustomers", method = RequestMethod.GET)
	public String inviteCustomers(@RequestParam("check") List<String> check, Model model) {
		if(user.getRole().equals("customer")) {
			logger.info("그룹 결성 insert 전달");
			logger.info(check.toString());

			GroupInfoVO vo = new GroupInfoVO();
			vo.setName("temp");
			vo.setGroupState("NOTCONFIRM");
			groupinfodao.register(vo);
			
			int groupidx = groupinfodao.getGroupListByCustomerId(user.getId()).get(0).getGroupidx();

			//에러부분
			
			vo.setGroupidx(groupidx);
			vo.setCustomeridx(user.getIdx());
			vo.setIsleader("YES");
			groupinfodao.register(vo);
			
			vo.setGroupidx(groupidx);
			for(int i=0; i<check.size(); i++) {
				GroupInfoVO vo2 = new GroupInfoVO();
				vo2.setGroupidx(groupidx);
				vo2.setCustomeridx(customerdao.get(check.get(i)).getCustomeridx());
				vo2.setIsleader("NO");
				//groupinfodao.registerGroupMember(vo2);
			}
			
			
			return "completeInvite";
		}
			
		
		return "error";
	}

}
