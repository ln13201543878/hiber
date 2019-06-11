package service;

import java.util.List;

import utils.Users;

public interface IService {
	void add(Users u);
	void delete(Integer uid);
	void edit(Users u);
	Users getOne(Integer uid);
	List<Users>getAll();
}
