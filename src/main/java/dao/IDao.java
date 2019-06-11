package dao;

import java.util.List;

import utils.Users;

public interface IDao {
	void save(Users u);
	void delete(Integer uid);
	void update(Users u);
	Users findone(Integer uid);
	List<Users>findAll();
}
