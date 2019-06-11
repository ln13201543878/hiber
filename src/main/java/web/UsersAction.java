package web;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import service.ServiceFactory;
import utils.Users;

public class UsersAction extends ActionSupport implements ModelDriven<Users> {
	Users user=new Users();
	public String save() {
		ServiceFactory.getServiceImpl().add(user);
		return "findAll";
	}
	public String delete() {
		ServiceFactory.getServiceImpl().delete(user.getUid());
		return "findAll";
	}
	public String update() {
		ServiceFactory.getServiceImpl().edit(user);
		return "findAll";
	}
	public String findAll() {
		List<Users>users=ServiceFactory.getServiceImpl().getAll();
		ServletActionContext.getRequest().setAttribute("users", users);
		return "findUI";
	}
	public String findOne() {
		user=ServiceFactory.getServiceImpl().getOne(user.getUid());
		ServletActionContext.getRequest().setAttribute("user", user);
		return "edit";
	}
	
	
	
	
	
	
	
	
	@Override
	public Users getModel() {
		return user;
	}
	
}
